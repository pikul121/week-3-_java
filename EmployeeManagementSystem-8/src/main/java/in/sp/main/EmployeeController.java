package in.sp.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/projections")
    public ResponseEntity<List<EmployeeProjection>> getEmployeeProjections() {
        List<EmployeeProjection> projections = employeeService.getAllEmployeeProjections();
        return ResponseEntity.ok(projections);
    }

    @GetMapping("/dtos")
    public ResponseEntity<List<EmployeeDTO>> getEmployeeDTOs() {
        List<EmployeeDTO> dtos = employeeService.getAllEmployeeDTOs();
        return ResponseEntity.ok(dtos);
    }
}
