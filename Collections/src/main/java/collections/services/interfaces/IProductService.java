package collections.services.interfaces;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import collections.models.subclass.entities.Product;

public interface IProductService {

	/**
	 * Save an Product object.
	 *
	 * @param code must not be {@literal null}.
	 * @param name must not be {@literal null}.
	 * @param description must not be {@literal null}.
	 * @param type must not be {@literal null}.
	 * @param status  must not be {@literal null}.
	 * @return the {@link Product} object registered.
	 * @throws {@link ProductNull} if name and status are null.
	 */
	Product save(Product product);
	
	/**
	 * Get pages of the {@link Product} object.
	 *
	 * @param pageable must not be {@literal null}.
	 * @return the {@link Page<Product>}.
	 * @throws {@link Page.empyt} if pageable is null.
	 */
	Page<Product> getProducts(Pageable pageable);
	
	/**
	 * Get registered {@link Product} object.
	 *
	 * @param id must not be {@literal null}.
	 * @return the {@link Product}.
	 * @throws {@link ProductNull} if id is null.
	 */
	Product getProduct(Long id);

	/**
	 * Get registered {@link Product} object.
	 *
	 * @param code must not be {@literal null}.
	 * @return the {@link Product}.
	 * @throws {@link ProductNull} if name is null.
	 */
	Product getProduct(String code);
	
	/**
	 * Get registered {@link Product} object querying by id and code property.
	 *
	 * @param id must not be {@literal null}
	 * @param {@link Product} object must not be {@literal null}.
	 * @return the {@link Product}.
	 * @throws {@link ProductNull} if id and {@link Product} object is null.
	 */
	Product updateProduct(Long id, Product product);
	
	/**
	 * Get registered {@link Product} object querying by code property.
	 *
	 * @param {@link Product} object must not be {@literal null}.
	 * @return the {@link Product}.
	 * @throws {@link ProductNull} if {@link Product} is null.
	 */
	Product updateProduct(Product product);

	/**
	 * Verify if exist {@link Product}.
	 *
	 * @param id must not be {@literal null}.
	 * @return a {@link Optional<Product>} object.
	 * @throws a Optional.Empty if id is null.
	 */
	Optional<Product> findId(Long id);

	/**
	 * Verify if exist {@link Product}.
	 *
	 * @param string product must not be {@literal null}.
	 * @return true or false.
	 */
	boolean verifyProduct(String code);

	/**
	 * Delete {@link Product} object by code property.
	 *
	 * @param string code must not be {@literal null}.
	 * @return the {@link Product} deleted.
	 * @throws {@link ProductNull} if id is null.
	 */
	Product deleteProduct(Long id);
	
	/**
	 * Delete {@link Product} querying by id and name property.
	 *
	 * @param id must not be {@literal null}.
	 * @param code object not be {@literal null}.
	 * @return Deleted object message.
	 * @throws {@link ProductNull} if id and name are null.
	 */
	Product deleteProduct(Long id, String code);
	
	/**
	 * Delete {@link Product} querying by id and code property.
	 *
	 * @param id must not be {@literal null}.
	 * @param {@link Product} object not be {@literal null}.
	 * @return Deleted object message.
	 * @throws {@link ProductNull} if id and code are null.
	 */
	Product deleteProduct(Long id, Product product);
}
