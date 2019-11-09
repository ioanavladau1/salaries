package org.fasttrackit.salaries.web;

import org.fasttrackit.salaries.domain.Employees;
import org.fasttrackit.salaries.service.EmployeesService;
import org.fasttrackit.salaries.transfer.employees.SaveEmployeesRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

    @RestController
    @RequestMapping("/employees")

    public class EmployeesController {

        private final EmployeesService employeesService;

        @Autowired
        public EmployeesController(EmployeesService employeesService) {
            this.employeesService = employeesService;
        }

        @PostMapping
        public ResponseEntity<Employees> createEmployees(@RequestBody @Valid SaveEmployeesRequest request){

            Employees employees = employeesService.createEmployees(request);
            return new ResponseEntity<>(employees, HttpStatus.CREATED);
        }

        @GetMapping("/id")
        public ResponseEntity<Employees> getEmployees(@PathVariable("id") long id){
            Employees employees =employeesService.getEmployees(id);
            return  new  ResponseEntity<>(employees, HttpStatus.OK);
        }

        @PutMapping("/id")
        public ResponseEntity<Employees> updateEmployees
                (@PathVariable("id") long id, @RequestBody SaveEmployeesRequest request){
            Employees employees= employeesService.updateEmployees(id,request);
            return  new ResponseEntity<>(employees, HttpStatus.OK);

        }


        @DeleteMapping("/id")
        public ResponseEntity<Employees> deleteEmployees(@PathVariable("id") long id){
            employeesService.deleteEmployees(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }

    }
