package in.sp.main;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    // No additional methods needed for basic pagination and sorting
}
