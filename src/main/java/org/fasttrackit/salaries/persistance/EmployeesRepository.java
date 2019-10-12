package org.fasttrackit.salaries.persistance;

import org.fasttrackit.salaries.domain.Employees;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeesRepository extends JpaRepository <Employees, Long> {
}
