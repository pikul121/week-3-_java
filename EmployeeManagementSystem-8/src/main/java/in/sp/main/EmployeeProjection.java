package in.sp.main;

import org.springframework.beans.factory.annotation.Value;

public interface EmployeeProjection {

    @Value("#{target.firstName} #{target.lastName}")
    String getFullName();

    String getEmail();

    @Value("#{target.salary * 12}")
    double getAnnualSalary();
}
