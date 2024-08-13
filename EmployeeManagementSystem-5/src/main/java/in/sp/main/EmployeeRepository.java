package in.sp.main;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    List<Employee> findByLastName(String lastName);
    @Query("SELECT e FROM Employee e WHERE e.department = ?1 ORDER BY e.salary DESC")
    List<Employee> findEmployeesByDepartmentSortedBySalary(String department);
    @Query(name = "Employee.findByDepartment")
    List<Employee> findByDepartment(@Param("department") String department);

    @Query(name = "Employee.findBySalaryGreaterThan")
    List<Employee> findBySalaryGreaterThan(@Param("salary") double salary);
   
}

