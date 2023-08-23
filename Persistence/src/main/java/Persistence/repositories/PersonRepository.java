package Persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import Persistence.models.entities.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {

	/**
	 * Query if name exists.
	 * 
	 * @param name must not be {@literal null}
	 * @return true if found name.
	 */
	boolean existsByName(String name);
	
	/**
	 * Query object by "name".
	 * 
	 * @param name must not be {@literal null}
	 * @return Returns an Person object.
	 * @throws PersonNull if name is null;
	 */
	@Query("SELECT p FROM Person WHERE p.name = :name")
	Person queryPersonByName(@Param("name") String name);
	
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
	 * @return a boolean result.
	 */
	@Query("SELECT p FROM Person p WHERE p.id = :id")
	Boolean queryObjectPersonById(@Param("id") Long id);
}
