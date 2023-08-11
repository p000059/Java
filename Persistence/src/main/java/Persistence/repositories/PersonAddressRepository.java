package Persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import Persistence.models.intermediate.PersonAddress;

public interface PersonAddressRepository extends JpaRepository<PersonAddress, Long> {

	
}
