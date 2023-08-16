package Persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import Persistence.models.entities.Phone;

public interface PhoneRepository extends JpaRepository<Phone, Long> {

}
