package in.sp.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public void run(String... args) throws Exception {
    	Department department = new Department();
    	department.setId(1L); // Manually set the ID
    	department.setName("HR");
    	departmentRepository.save(department);


        Employee emp = new Employee();
        emp.setName("Mahendra Singh");
        emp.setEmail("manusingh98122@gmail.com");
        emp.setDepartment(department);
        employeeRepository.save(emp);
    }
}
