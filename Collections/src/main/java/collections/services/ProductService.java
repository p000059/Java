package collections.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import collections.models.subclass.entities.Product;
import collections.models.subclass.nullables.ProductNull;
import collections.repositories.ProductRepository;
import collections.services.interfaces.IProductService;
import jakarta.transaction.Transactional;

@Service
@Primary
public class ProductService implements IProductService {

	@Autowired
	private ProductRepository productRepository;

	@Override
	@Transactional
	@SuppressWarnings("static-access")
	public Product save(Product Product) {

		try {

			return Product instanceof Product ? productRepository.saveAndFlush(Product)
					: new Product().builder().name("object invalid").build();

		} catch (IllegalArgumentException e) {

			return new ProductNull();

		} catch (NullPointerException e) {

			return new ProductNull();
		}
	}

	@Override
	@SuppressWarnings("static-access")
	public Product getProduct(Long id) {

		try {

			return this.productRepository.existsById(id) ? this.productRepository.queryProductById(id)
					: new Product().builder().name("not found").build();

		} catch (NullPointerException e) {

			return new ProductNull();

		} catch (IllegalArgumentException e) {

			return new ProductNull();
		}
	}

	@Override
	@SuppressWarnings("static-access")
	public Product getProduct(String code) {

		try {

			return this.productRepository.existsByCode(code) ? this.productRepository.queryProductByCode(code)
					: new Product().builder().name("not found Product").build();

		} catch (Exception e) {

			return new ProductNull();
		}
	}

	@Override
	public Page<Product> getProducts(Pageable pageable) {

		try {
			
			return productRepository.findAll(pageable);			
			
		} catch (Exception e) {

			return Page.empty();
		}
		
	}

	@Override
	@SuppressWarnings("static-access")
	public Product updateProduct(Long id, Product product) {

		try {

			return this.productRepository.existsById(id) && this.productRepository.existsByCode(product.getCode())
					? this.save(product)
					: new Product().builder().name("not found Product object").build();

		} catch (Exception e) {

			return new ProductNull();
		}

	}

	@Override
	@SuppressWarnings("static-access")
	public Product updateProduct(Product product) {

		try {

			return this.productRepository.existsByCode(product.getCode()) ? this.save(product)
					: new Product().builder().name("not found Product object").build();

		} catch (Exception e) {

			return new ProductNull();
		}

	}

	@Override
	public Optional<Product> findId(Long id) {

		try {

			return productRepository.findById(id);

		} catch (NullPointerException e) {

			return Optional.empty();

		} catch (IllegalArgumentException e) {

			return Optional.empty();
		}

	}

	@Override
	public boolean verifyProduct(String product) {

		try {

			return productRepository.existsByCode(product);

		} catch (Exception e) {

			return null != null;
		}

	}

	@Override
	@Transactional
	@SuppressWarnings("static-access")
	public Product deleteProduct(Long id) {

		try {

			if (this.productRepository.existsById(id) == true && id != 0) {

				this.productRepository.deleteById(id);

				return new Product().builder().name("Object Delected").build();

			} else {

				return new Product().builder().name("not deleted").build();
			}

		} catch (IllegalArgumentException e) {

			return new ProductNull();

		} catch (NullPointerException e) {

			return new ProductNull();
		}
	}

	@Override
	@Transactional
	@SuppressWarnings("static-access")
	public Product deleteProduct(Long id, String code) {

		try {

			if (this.productRepository.existsById(id) == this.productRepository.existsByCode(code)) {

				this.productRepository.deleteById(id);

				return new Product().builder().name("Object Delected").build();

			} else {

				return new Product().builder().name("not deleted").build();
			}

		} catch (IllegalArgumentException e) {

			return new ProductNull();

		} catch (NullPointerException e) {

			return new ProductNull();
		}
	}

	@Override
	@Transactional
	@SuppressWarnings("static-access")
	public Product deleteProduct(Long id, Product product) {

		try {

			if (this.productRepository.existsById(id) == this.productRepository.existsByCode(product.getName())) {

				this.productRepository.deleteById(id);

				return new Product().builder().name("Object Delected").build();

			} else {

				return new Product().builder().name("not deleted").build();
			}

		} catch (IllegalArgumentException e) {

			return new ProductNull();

		} catch (NullPointerException e) {

			return new ProductNull();
		}
	}

}
