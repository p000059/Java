package collections.validations;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import collections.DTO.ProductDTO;
import collections.models.subclass.entities.Product;
import collections.models.subclass.nullables.ProductNull;
import collections.services.interfaces.IProductService;
import collections.validations.interfaces.IProductValidation;

@Service
public class ProductValidation implements IProductValidation {

	@Autowired
	private IProductService iProductService;
	
	@SuppressWarnings("static-access")
	Product invalidParameter = new ProductNull().builder().code("invalid parameter").build(); 
	
	@SuppressWarnings("static-access")
	Product unvalidatedProduct = new Product().builder().code("not validated").build();
	
	@Override
	public Product validateProduct(@Validated ProductDTO productDTO) {

		try {
			
			if (iProductService.verifyProduct(productDTO.getName())) {
				
				return unvalidatedProduct;
				
			} else {
				
				Product product = new Product();
				
				BeanUtils.copyProperties(productDTO, product);
				return this.iProductService.save(product);
			}			
			
		} catch (Exception e) {
			
			return new ProductNull();
		}
	}

	@Override
	public Page<Product> getValidateProduct(Pageable pageable) {

		try {
			
			return this.iProductService.getProducts(pageable);			
			
		} catch (Exception e) {
			
			return Page.empty();
		}		
	}

	@Override
	public Product getValidateProduct(Long id) {

		try {

			return this.iProductService.findId(id).get(); // The .get() method return the class if it exists.

		} catch (IllegalArgumentException e) {

			return new ProductNull();
		}
	}
	
	public Product updateValidateProduct(@Validated ProductDTO productDTO) {
		
		try {
			
			Product objectProduct = new Product();
			
			if(productDTO instanceof ProductDTO && productDTO != null) {
				
				BeanUtils.copyProperties(productDTO, objectProduct);
				
				return this.iProductService.save(objectProduct);
				
			} else {
				
				return unvalidatedProduct;				
			}
			
			
		} catch (IllegalArgumentException e) {
			
			return invalidParameter;
			
		} catch (NullPointerException e) {
			
			return invalidParameter;
		}
	}

	@Override
	public Product updateValidadeProduct(@Validated Long id, @Validated ProductDTO productDTO) {

		try {

			if(productDTO instanceof ProductDTO && id != 0) {
				
				Product Product = new Product();
				
				BeanUtils.copyProperties(productDTO, Product);
				Product.setId(iProductService.findId(id).get().getId()); // Keep the same ID for the update.
				
				return this.iProductService.save(Product);
				
			} else {
				
				return unvalidatedProduct;
			}
			

		} catch (IllegalArgumentException e) {

			return invalidParameter;
			
		} catch (NullPointerException e) {
			
			return invalidParameter;
		}
	}

	@Override
	public Product deleteValidadeProduct(Long id) {

		try {
			
			if(!(id == 0)) {
				
				@SuppressWarnings("static-access")
				Product product = new Product().builder().code("product deleted").build();
				
				this.iProductService.deleteProduct(id);
				
				return product;
				
			} else {
				
				return unvalidatedProduct;
			}
			
			
		} catch (IllegalArgumentException e) {

			return invalidParameter;
		}
	}
	
	@Override
	public Product deleteValidadeProduct(Long id, ProductDTO productDTO) {

		try {

			if (productDTO instanceof ProductDTO) {

				Product product = new Product();

				BeanUtils.copyProperties(productDTO, product);

				this.iProductService.deleteProduct(id, product);
				
				product.setName("Product Deleted");
				product.setStatus(false);

				return product;
				
			} else {

				return unvalidatedProduct;
			}

		} catch (IllegalArgumentException e) {

			return invalidParameter;
			
		} catch (NullPointerException e) {
			
			return invalidParameter;
		}
	}
}
