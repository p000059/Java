package collections.reports.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import collections.models.subclass.entities.Product;

public interface ReportProductRepository extends JpaRepository<Product, Long> {

	boolean existsByCode(String code);
}
