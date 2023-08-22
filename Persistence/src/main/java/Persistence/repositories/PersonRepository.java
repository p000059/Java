package Persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import Persistence.models.entities.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {

	/**
	 * Query object by "id".
	 * 
	 * @param id must not be {@literal null}
	 * @return Returns an Person object.
	 */
	@Query("SELECT p FROM Person p WHERE p.id = :id")
	Person queryPersonById(@Param("id") Long id);
	
	/**
	 * Query object by "id".
	 * 
	 * @param id must not be {@literal null}
	 * @return Returns an Person object.
	 */
	@Query("SELECT p FROM Person p WHERE p.id = :id")
	Boolean queryObjectPersonById(@Param("id") Long id);
}
