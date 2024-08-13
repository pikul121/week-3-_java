package in.sp.main.controller;

import in.sp.main.model.Employee;
import in.sp.main.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/batch")
    public void saveEmployeesBatch(@RequestBody List<Employee> employees) {
        employeeService.saveAllEmployees(employees);
    }
}
