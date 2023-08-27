package Persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import Persistence.models.associations.PersonPhone;

public interface PersonPhoneRepository extends JpaRepository<PersonPhone, Long> {

}
