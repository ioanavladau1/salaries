package org.fasttrackit.salaries.service;

import org.fasttrackit.salaries.domain.Salary;
import org.fasttrackit.salaries.exception.ResourceNotFoundException;
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

    @Autowired
    public SalaryService(SalaryRepository salaryRepository) {
        this.salaryRepository = salaryRepository;
    }


    public Salary createSalary(AddEmployeesToSalary request1, SaveSalaryRequest request){

        LOGGER.info("Create clocking: ", request);
        Salary salary = new Salary();
        salary.setWorkingdaysmonth(request.getWorkingdaysmonth());
        salary.setWorkeddays(request.getWorkeddays());
        salary.setHolidays(request.getHolidays());
        salary.setSickdays(request.getSickdays());
        salary.setDayswithoutsalary(request.getDayswithoutsalary());
        // salary.setUnmotivateddays(request.getUnmotivateddays());
        return salaryRepository.save(salary);
    }

    public Salary getSalary(long id){
        LOGGER.info("Retrievied clocking : {} " ,id);
        return salaryRepository.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("Not found salary for " + id));
    }

    public Salary updateSalary(long id, SaveSalaryRequest request){
        LOGGER.info("Update salary for {}: {}",id,request);

        Salary salary = getSalary(id);
        BeanUtils.copyProperties(request,salary);
        return salaryRepository.save(salary);
    }
    public  void  deleteSalary(long id){
        LOGGER.info("Deleting clocking : {}", id);
        salaryRepository.deleteById(id);
    }
}

