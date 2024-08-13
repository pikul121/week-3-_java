package in.sp.main;

public class EmployeeDTO {
    
    private String fullName;
    private String email;
    private double annualSalary;

    public EmployeeDTO(String fullName, String email, double annualSalary) {
        this.fullName = fullName;
        this.email = email;
        this.annualSalary = annualSalary;
    }

    // Getters and Setters
    public String getFullName() { return fullName; }
    public void setFullName(String fullName) { this.fullName = fullName; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public double getAnnualSalary() { return annualSalary; }
    public void setAnnualSalary(double annualSalary) { this.annualSalary = annualSalary; }
}
