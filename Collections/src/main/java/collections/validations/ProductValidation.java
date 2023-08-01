package collections.validations;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.validation.annotation.Validated;

import collections.DTO.ProductDTO;
import collections.models.interfaces.services.IProductService;
import collections.models.interfaces.validations.IProductValidation;
import collections.models.subclass.entities.Product;
import collections.models.subclass.nullables.ProductNull;

public class ProductValidation implements IProductValidation {

	@Autowired
	private IProductService iProductService;

	@Override
	public Product validateProduct(@Validated ProductDTO productDTO) {

		Product product = new Product();

		if (iProductService.verifyProducts(productDTO.getCode())) {

			return new ProductNull();

		} else {

			BeanUtils.copyProperties(productDTO, product);
			return iProductService.save(product);
		}
	}

	@Override
	public List<Product> getValidateProduct() {

		return iProductService.getProducts();
	}

	@Override
	public Page<Product> getValidateProduct(Pageable pageable) {

		return iProductService.getProducts(pageable);
	}

	@Override
	public Product getValidateProduct(Long id) {

		Optional<Product> optionalProduct = iProductService.findId(id);

		if (!optionalProduct.isPresent()) {

			return new ProductNull();

		} else {

			return optionalProduct.get();
		}
	}

	@Override
	public Product updateValidadeProduct(Long id, @Validated ProductDTO productDTO) {

		Optional<Product> optionalProduct = iProductService.findId(id);

		if (!optionalProduct.isPresent()) {

			return new ProductNull();

		} else {

			Product product = new Product();

			BeanUtils.copyProperties(productDTO, product);
			product.setId(optionalProduct.get().getId()); // Keeps the same ID.

			return iProductService.save(product);
		}
	}

	@Override
	public Product deleteValidadeProduct(Long id) {
		
		Optional<Product> optionalProduct = iProductService.findId(id);

		if (!optionalProduct.isPresent()) {

			return new ProductNull();

		} else {

			Product product = new Product();

			product.setDescription("Code Deleted");
			product.setStatus(false);

			this.iProductService.deleteProducts(id);
			return product;

		}
	}
}
