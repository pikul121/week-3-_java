package com.example.ems.repository.primary;

import com.example.ems.model.primary.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
