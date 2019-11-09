package org.fasttrackit.salaries;

import org.fasttrackit.salaries.service.EmployeesService;
import org.fasttrackit.salaries.service.SalaryService;
import org.fasttrackit.salaries.transfer.salary.AddEmployeesToSalary;
import org.fasttrackit.salaries.transfer.salary.SaveSalaryRequest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

    @SpringBootTest
    @RunWith(SpringRunner.class)
    public class SalaryServiceIntegrationTests {

    @Autowired
    private EmployeesService employeesService;

    @Autowired
    private SalaryService salaryService;

    @Test
    public void createSalaryTest_whenNewSalary_thenCreateSalary() {

        SaveSalaryRequest request2 = new SaveSalaryRequest();
        request2.setWorkingdaysmonth(22);
        request2.setWorkeddays(18);
        request2.setHolidays(7);
        request2.setSickdays(0);
        request2.setDayswithoutsalary(0);

//        SaveEmployeesRequest request = new SaveEmployeesRequest();
//        Employees employees = employeesService.createEmployees(request);

        AddEmployeesToSalary request1 = new AddEmployeesToSalary();
        request1.setEmployeesId(1);

        salaryService.createSalary(request1, request2);
    }

}
