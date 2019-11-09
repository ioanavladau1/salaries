package org.fasttrackit.salaries.web;

import org.fasttrackit.salaries.domain.Salary;
import org.fasttrackit.salaries.service.SalaryService;
import org.fasttrackit.salaries.transfer.salary.AddEmployeesToSalary;
import org.fasttrackit.salaries.transfer.salary.SaveSalaryRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/salaries")
public class SalaryController {

    private final SalaryService salaryService;

    @Autowired
    public SalaryController(SalaryService salaryService) {
        this.salaryService = salaryService;
    }

    @PostMapping
    public ResponseEntity<Salary> createSalary
            (@RequestBody @Valid AddEmployeesToSalary toSalary, @RequestBody SaveSalaryRequest request){
        Salary salary =salaryService.createSalary(toSalary, request);
        return new ResponseEntity<>(salary, HttpStatus.CREATED);
    }

    @GetMapping("/id")
    public ResponseEntity<Salary> getSalary(@PathVariable("id") long id){
        Salary salary = salaryService.getSalary(id);
        return  new ResponseEntity<>(salary, HttpStatus.OK);

    }
    @PutMapping("/id")
    public ResponseEntity<Salary> updateSalary(@PathVariable("id") long id, @RequestBody SaveSalaryRequest request){
        Salary salary = salaryService.updateSalary(id, request);
        return  new ResponseEntity<>(salary, HttpStatus.OK);
    }

    @DeleteMapping("/id")
    public ResponseEntity<Salary> deleteSalary(@PathVariable("id") long id){
        salaryService.deleteSalary(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}