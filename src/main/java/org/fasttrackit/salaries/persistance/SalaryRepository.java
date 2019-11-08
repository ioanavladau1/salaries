package org.fasttrackit.salaries.persistance;

import org.fasttrackit.salaries.domain.Salary;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalaryRepository extends JpaRepository <Salary, Long> {
}
