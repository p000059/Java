package collections.validations.interfaces;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import collections.DTO.ProductDTO;
import collections.models.subclass.entities.Product;

public interface IProductValidation {

	/**
	 * Validates a {@link Product} Object.
	 *
	 * @param {@link productDTO} must not be {@literal null}.
	 * @param status  must not be {@literal null}.
	 * @return the Product object registered.
	 * @throws {@link ProductNull} if Product and status are null.
	 */
	Product validateProduct(ProductDTO productDTO);

	/**
	 * Get pages from the {@link Product} object.
	 *
	 * @param pageable must not be {@literal null}.
	 * @return registered Product object pages.
	 * @throws {@link Page.empty()} if pageable is null.
	 */
	Page<Product> getValidateProduct(Pageable pageable);

	/**
	 * Validates {@link Product} object.
	 *
	 * @param id must not be {@literal null}.
	 * @return registered {@link Product} object.
	 * @throws {@link ProductNull()} if id is null.
	 */
	Product getValidateProduct(Long id);

	/**
	 * This method validates and updates an object of the {@link Product} class, 
	 * using the properties of this same class, 
	 * which are the id and the name.
	 *
	 * @param id must not be {@literal null}.
	 * @param ProductDTO must not be {@literal null}.
	 * @return registered {@link Product} object.
	 * @throws {@link ProductNull()} if id is null.
	 */
	Product updateValidadeProduct(Long id, ProductDTO productDTO);

	/**
	 * Delete {@link Product} object.
	 *
	 * @param id must not be {@literal null}.
	 * @return the {@link Product} object deleted.
	 * @throws {@link ProductNull()} if id is null.
	 */
	Product deleteValidadeProduct(Long id);
	
	/**
	 * Delete {@link Product} object.
	 *
	 * @param id must not be {@literal null}.
	 * @param {@link ProductDTO} must not be {@literal null}.
	 * @return the {@link Product} object deleted.
	 * @throws {@link ProductNull()} if id is null.
	 */
	Product deleteValidadeProduct(Long id, ProductDTO productDTO);
}
