package Persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import Persistence.models.entities.Phone;

public interface PhoneRepository extends JpaRepository<Phone, Long> {

	/**
	 * Query if number already exists.
	 * 
	 * @param number must not be {@literal null}
	 * @return true if found number.
	 */
	boolean existsByNumber(String number);
	
	/**
	 * Query object by "number".
	 * 
	 * @param number must not be {@literal null}
	 * @return Returns an Phone object. 
	 */
	@Query("SELECT p FROM Phone WHERE p.number = :number")
	Phone queryPhoneByNumber(@Param("number") String number);
	
	/**
	 * Query object by "id".
	 * 
	 * @param id must not be {@literal null}
	 * @return Returns an Phone object.
	 */
	@Query("SELECT p FROM Phone p WHERE p.id = :id")
	Phone queryPhoneById(@Param("id") Long id);
	
	/**
	 * Query object by "id".
	 * 
	 * @param id must not be {@literal null}
	 * @return a boolean value.
	 */
	@Query("SELECT p FROM Phone p WHERE p.id = :id")
	Boolean queryObjectPhoneById(@Param("id") Long id);
}
