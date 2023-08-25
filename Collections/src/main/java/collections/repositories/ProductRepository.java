package collections.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import collections.models.subclass.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

	/**
	 * Query object by "code".
	 * 
	 * @param code must not be {@literal null}
	 * @return true if found.
	 */
	boolean existsByCode(String code);
	
	/**
	 * Query object by "id".
	 * 
	 * @param id must not be {@literal null}
	 * @return Returns an Product object.
	 */
	@Query("SELECT a FROM Product a WHERE a.id = :id")
	Product queryProductById(@Param("id") Long id);
	
	
	/**
	 * Query object by "name".
	 * 
	 * @param name must not be {@literal null}
	 * @return a Product object.
	 */
	@Query("SELECT p FROM Product p WHERE p.name = :name")
	Product queryProductByName(@Param("name") String name);
	
	
	/**
	 * Query object by "status".
	 * 
	 * @param status must not be {@literal null}
	 * @return a Product object.
	 */
	@Query("SELECT a FROM Product a WHERE a.status = :status")
	Product queryProductByStatus(@Param("status") Boolean status);
	
	
	/**
	 * Query by "id", "name" and "status".
	 * 
	 * @param id must not be {@literal null}
	 * @param name must not be {@literal null}
	 * @param status must not be {@literal null}
	 * @return a Product object.
	 */
	@Query("SELECT a FROM Product a WHERE a.id = :id AND a.name = :name AND a.status = :status")
	Product queryProductByIdNameStatus(@Param("id") Long id, @Param("name") String name, @Param("status") Boolean status);
}
