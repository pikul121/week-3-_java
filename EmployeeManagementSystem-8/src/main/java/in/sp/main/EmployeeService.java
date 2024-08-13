package in.sp.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<EmployeeProjection> getAllEmployeeProjections() {
        return employeeRepository.findAllEmployeeProjections();
    }

    public List<EmployeeDTO> getAllEmployeeDTOs() {
        return employeeRepository.findAllEmployeeDTOs();
    }
}
