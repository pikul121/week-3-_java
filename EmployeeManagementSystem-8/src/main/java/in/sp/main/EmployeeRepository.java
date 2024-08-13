package in.sp.main;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    @Query("SELECT e FROM Employee e")
    List<EmployeeProjection> findAllEmployeeProjections();
    @Query("SELECT new in.sp.main.EmployeeDTO(CONCAT(e.firstName, ' ', e.lastName), e.email, e.salary * 12) FROM Employee e")
    List<EmployeeDTO> findAllEmployeeDTOs();

}
