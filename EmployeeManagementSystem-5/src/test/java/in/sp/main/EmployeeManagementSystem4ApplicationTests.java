package in.sp.main;

import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class EmployeeManagementSystem4ApplicationTests {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Test
    public void testFindByLastName() {
        List<Employee> employees = employeeRepository.findByLastName("Smith");
        assertFalse(employees.isEmpty());
    }
}

