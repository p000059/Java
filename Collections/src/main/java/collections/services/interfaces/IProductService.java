package collections.services.interfaces;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import collections.models.subclass.entities.Product;

public interface IProductService {

	Product save(Product product);

	Page<Product> getProducts(Pageable pageable);

	Product updateProducts(Product product);

	Optional<Product> findId(Long id);

	boolean verifyProducts(String email);

	void deleteProducts(Long id);
}
