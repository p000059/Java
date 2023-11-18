package ic.interfaces.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ic.model.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

	
}
