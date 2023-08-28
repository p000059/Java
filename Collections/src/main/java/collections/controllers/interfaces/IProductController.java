package collections.controllers.interfaces;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import collections.DTO.entities.ProductDTO;
import collections.models.subclass.entities.Product;

public interface IProductController {

	/**
	 * Method of showing pages of Product objects..
	 *
	 * @param {@Pageagle} interface must not be {@literal null}.
	 * @return page of Products.
	 * @throws {@link Page.empty()} if pageable is null.
	 */
	ResponseEntity<Page<Product>> readProduct(@PageableDefault(page = 0, size = 10, sort = "id", direction = Direction.DESC) Pageable pageable);
	
	/**
	 * Method of save Product objects.
	 *
	 * @param {@ProductDTO} must not be {@literal null}.
	 * @return Product object.
	 * @throws Message "object invalid".
	 */
	ResponseEntity<Product> saveProduct(@RequestBody ProductDTO productDTO);
	
	/**
	 * Method of update Product objects.
	 *
	 * @param id must not be {@literal null}.
	 * @param {@ProductDTO} must not be {@literal null}.
	 * @return Product object.
	 * @throws Message "object invalid".
	 */
	ResponseEntity<Product> updateProduct(@PathVariable(value = "id") Long id, @RequestBody ProductDTO productDTO);
	
	/**
	 * Method of delete Product objects.
	 *
	 * @param id must not be {@literal null}.
	 * @param {@ProductDTO} must not be {@literal null}.
	 * @return Operation Confirmation.
	 * @throws Message "object invalid".
	 */
	ResponseEntity<Product> deleteProduct(@PathVariable(value = "id") Long id, @RequestBody ProductDTO productDto);
}
