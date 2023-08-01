package collections.models.interfaces.validations;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import collections.DTO.ProductDTO;
import collections.models.subclass.entities.Product;

public interface IProductValidation {

	Product validateProduct(ProductDTO productDTO);

	List<Product> getValidateProduct();

	Page<Product> getValidateProduct(Pageable pageable);

	Product getValidateProduct(Long id);

	Product updateValidadeProduct(Long id, ProductDTO productDTO);

	Product deleteValidadeProduct(Long id);
}
