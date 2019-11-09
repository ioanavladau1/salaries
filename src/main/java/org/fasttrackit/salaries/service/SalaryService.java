package org.fasttrackit.salaries.service;

import org.fasttrackit.salaries.domain.Employees;
import org.fasttrackit.salaries.domain.Salary;
import org.fasttrackit.salaries.exception.ResourceNotFoundException;
import org.fasttrackit.salaries.persistance.EmployeesRepository;
import org.fasttrackit.salaries.persistance.SalaryRepository;
import org.fasttrackit.salaries.transfer.salary.AddEmployeesToSalary;
import org.fasttrackit.salaries.transfer.salary.SaveSalaryRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SalaryService {

    private static final Logger LOGGER = LoggerFactory.getLogger(SalaryService.class);

    private final SalaryRepository salaryRepository;
    private final EmployeesRepository employeesRepository;
    private final EmployeesService employeesService;

    @Autowired
    public SalaryService(SalaryRepository salaryRepository, EmployeesService employeesService, EmployeesRepository employeesRepository) {

        this.salaryRepository = salaryRepository;
        this.employeesService = employeesService;
        this.employeesRepository = employeesRepository;
    }


    public Salary createSalary(AddEmployeesToSalary request1, SaveSalaryRequest request) {
        LOGGER.info("Create salary: ", request1);

        Employees employee = employeesRepository.findById(request1.getEmployeesId())
                .orElseThrow(() -> new ResourceNotFoundException("Not found employee: " + request1.getEmployeesId()));

        Salary salary = salaryRepository.findById(request1.getEmployeesId())
                .orElse(new Salary());

        if (salary.getEmployees() == null) {
            LOGGER.info("Employees doesn't exist");
            Employees employees = employeesService.getEmployees(request1.getEmployeesId());
            salary.setEmployees(employees);
            salary.setId(employees.getId());
        }

        salary.setWorkingdaysmonth(request.getWorkingdaysmonth());
        salary.setWorkeddays(request.getWorkeddays());
        salary.setHolidays(request.getHolidays());
        salary.setSickdays(request.getSickdays());
        salary.setDayswithoutsalary(request.getDayswithoutsalary());
        salaryRepository.save(salary);

        return salary;
    }


    public Salary getSalary(long id) {
        LOGGER.info("Retrievied clocking : {} ", id);
        return salaryRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Not found salary for " + id));
    }

    public Salary updateSalary(long id, SaveSalaryRequest request) {
        LOGGER.info("Update salary for {}: {}", id, request);

        Salary salary = getSalary(id);
        BeanUtils.copyProperties(request, salary);
        return salaryRepository.save(salary);
    }

    public void deleteSalary(long id) {
        LOGGER.info("Deleting clocking : {}", id);
        salaryRepository.deleteById(id);
    }
}