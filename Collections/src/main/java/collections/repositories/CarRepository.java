package collections.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import collections.models.subclass.entities.Car;

public interface CarRepository extends JpaRepository<Car, Long> {

	/**
	 * Query object Car by "id".
	 * 
	 * @param id must not be {@literal null}
	 * @return true if found.
	 */
	boolean existsById(Long id);
	
	/**
	 * Query object by "car".
	 * 
	 * @param car must not be {@literal null}
	 * @return true if found.
	 */
	boolean existsByCar(String car);
	
	/**
	 * Query object by "id".
	 * 
	 * @param id must not be {@literal null}
	 * @return a {@link Car} object.
	 */
	@Query("SELECT a FROM Car a WHERE a.id = :id")
	Car queryCarById(@Param("id") Long id);
	
	
	/**
	 * Query object by "car".
	 * 
	 * @param car must not be {@literal null}
	 * @return a {@link Car} object.
	 */
	@Query("SELECT p FROM Car p WHERE p.car = :car")
	Car queryCarByName(@Param("car") String car);
	
	
	/**
	 * Query object by "status".
	 * 
	 * @param status must not be {@literal null}
	 * @return a {@link Car} object.
	 */
	@Query("SELECT a FROM Car a WHERE a.status = :status")
	Car queryCarByStatus(@Param("status") Boolean status);
	
	
	/**
	 * Query by "id", "car" and "status".
	 * 
	 * @param id must not be {@literal null}
	 * @param car must not be {@literal null}
	 * @param status must not be {@literal null}
	 * @return a {@link Car} object.
	 */
	@Query("SELECT a FROM Car a WHERE a.id = :id AND a.car = :car AND a.status = :status")
	Car queryCarByIdNameStatus(@Param("id") Long id, @Param("car") String car, @Param("status") Boolean status);
}
