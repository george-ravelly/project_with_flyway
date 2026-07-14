package geo.flyway.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import geo.flyway.project.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
}
