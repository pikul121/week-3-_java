package in.sp.main;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeeManagementSystem3Application implements CommandLineRunner {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private DepartmentRepository departmentRepository;

    public static void main(String[] args) {
        SpringApplication.run(EmployeeManagementSystem3Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        // Save a new employee
        Employee employee = new Employee("Mahendra", "Software Engineer",);
        employeeRepository.save(employee);

        // Save a new department
        Department department = new Department("IT");
        departmentRepository.save(department);

        // Fetch employees by role
        List<Employee> developers = employeeRepository.findByRole("Software Engineer");
        developers.forEach(emp -> System.out.println(emp.getName()));

        // Fetch department by name
        Department itDepartment = departmentRepository.findByName("IT");
        System.out.println(itDepartment.getName());
    }
}