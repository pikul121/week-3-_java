package com.example.ems.repository.secondary;

import com.example.ems.model.secondary.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
