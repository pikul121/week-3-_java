package in.sp.main.service;

import in.sp.main.model.Employee;
import in.sp.main.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Transactional
    public void saveAllEmployees(List<Employee> employees) {
        for (int i = 0; i < employees.size(); i++) {
            employeeRepository.save(employees.get(i));

            if (i % 20 == 0) { // Flush a batch of inserts and release memory.
                employeeRepository.flush();
            }
        }
    }
}
