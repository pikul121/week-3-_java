package in.sp.main.repository;

import in.sp.main.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    // Additional query methods (if needed) can be defined here
}

