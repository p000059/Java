package collections.models.interfaces.services;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import collections.models.subclass.entities.Product;

public interface IProductService {

	Product save(Product product);
	
	List<Product> getProducts();

	Page<Product> getProducts(Pageable pageable);

	Product updateProducts(Product product);

	Optional<Product> findId(Long id);

	boolean verifyProducts(String email);

	void deleteProducts(Long id);
}
