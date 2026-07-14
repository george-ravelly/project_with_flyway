package geo.flyway.project.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import geo.flyway.project.model.Employee;
import geo.flyway.project.repository.EmployeeRepo;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeeRepo employeeRepo;

    public Employee getEmployee(Integer id) {
        return employeeRepo.findById(id).orElse(null);
    }

    public List<Employee> getAllEmployees() {
        return employeeRepo.findAll();
    }
}
