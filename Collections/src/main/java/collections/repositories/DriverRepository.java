package collections.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import collections.models.subclass.entities.Driver;

public interface DriverRepository extends JpaRepository<Driver, Long> {
	
	/**
	 * Query object by "name".
	 * 
	 * @param code must not be {@literal null}
	 * @return true if found.
	 */
	boolean existsByName(String name);
	
	/**
	 * Query object by "id".
	 * 
	 * @param id must not be {@literal null}
	 * @return Returns an Driver object.
	 */
	@Query("SELECT a FROM Driver a WHERE a.id = :id")
	Driver queryDriverById(@Param("id") Long id);
	
	
	/**
	 * Query object by "name".
	 * 
	 * @param name must not be {@literal null}
	 * @return a Driver object.
	 */
	@Query("SELECT p FROM Driver p WHERE p.name = :name")
	Driver queryDriverByName(@Param("name") String name);
	
	
	/**
	 * Query object by "status".
	 * 
	 * @param status must not be {@literal null}
	 * @return a Driver object.
	 */
	@Query("SELECT a FROM Driver a WHERE a.status = :status")
	Driver queryDriverByStatus(@Param("status") Boolean status);
	
	
	/**
	 * Query by "id", "name" and "status".
	 * 
	 * @param id must not be {@literal null}
	 * @param name must not be {@literal null}
	 * @param status must not be {@literal null}
	 * @return a Driver object.
	 */
	@Query("SELECT a FROM Driver a WHERE a.id = :id AND a.name = :name AND a.status = :status")
	Driver queryDriverByIdNameStatus(@Param("id") Long id, @Param("name") String name, @Param("status") Boolean status);
}
