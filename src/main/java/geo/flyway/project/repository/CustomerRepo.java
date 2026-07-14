package geo.flyway.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import geo.flyway.project.model.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Integer> {
}
