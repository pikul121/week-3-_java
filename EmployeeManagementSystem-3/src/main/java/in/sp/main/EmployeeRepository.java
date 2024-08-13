package in.sp.main;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    // Derived query method to find employees by role
    List<Employee> findByRole(String role);
}
