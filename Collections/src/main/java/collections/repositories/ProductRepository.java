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
	 * Query object by "code".
	 * 
	 * @param code must not be {@literal null}
	 * @return a Product object.
	 */
	@Query("SELECT p FROM Product p WHERE p.code = :code")
	Product queryProductByCode(@Param("code") String code);
	
	
	/**
	 * Query object by "status".
	 * 
	 * @param status must not be {@literal null}
	 * @return a Product object.
	 */
	@Query("SELECT a FROM Product a WHERE a.status = :status")
	Product queryProductByStatus(@Param("status") Boolean status);
	
	
	/**
	 * Query by "id", "code" and "status".
	 * 
	 * @param id must not be {@literal null}
	 * @param code must not be {@literal null}
	 * @param status must not be {@literal null}
	 * @return a Product object.
	 */
	@Query("SELECT a FROM Product a WHERE a.id = :id AND a.code = :code AND a.status = :status")
	Product queryProductByIdCodeStatus(@Param("id") Long id, @Param("code") String code, @Param("status") Boolean status);
}
