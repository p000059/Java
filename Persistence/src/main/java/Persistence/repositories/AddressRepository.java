package Persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import Persistence.models.entities.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
