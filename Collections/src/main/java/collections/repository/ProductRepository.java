package collections.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import collections.models.subclass.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

	boolean existsByCode(String code);
}
