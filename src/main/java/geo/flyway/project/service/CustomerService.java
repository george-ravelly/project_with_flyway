package geo.flyway.project.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import geo.flyway.project.model.Customer;
import geo.flyway.project.repository.CustomerRepo;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerRepo customerRepo;

    public Customer get(Integer id) {
        return customerRepo.findById(id).orElse(null);
    }

    public List<Customer> getAllCustomers() {
        return customerRepo.findAll();
    }
}
