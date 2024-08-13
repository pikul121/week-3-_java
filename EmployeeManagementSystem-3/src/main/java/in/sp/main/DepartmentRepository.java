package in.sp.main;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
    // Derived query method to find department by name
    Department findByName(String name);
}
