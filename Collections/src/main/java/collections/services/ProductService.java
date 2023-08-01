package collections.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import collections.models.interfaces.services.IProductService;
import collections.models.subclass.entities.Product;
import collections.repository.ProductRepository;

@Service
@Primary
public class ProductService implements IProductService {

	@Autowired
	private ProductRepository productRepository;
	
	@Override
	public Product save(Product product) {
		
		return productRepository.save(product);
	}

	@Override
	public Page<Product> getProducts(Pageable pageable) {
		
		return productRepository.findAll(pageable);
	}

	@Override
	public Product updateProducts(Product product) {
		
		return productRepository.saveAndFlush(product);		
	}

	@Override
	public Optional<Product> findId(Long id) {
		
		return productRepository.findById(id);
	}

	@Override
	public boolean verifyProducts(String email) {
		
		return false;
	}

	@Override
	public void deleteProducts(Long id) {
		
		productRepository.deleteById(id);
	}

}
