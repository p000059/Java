package Persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import Persistence.models.entities.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {

}
