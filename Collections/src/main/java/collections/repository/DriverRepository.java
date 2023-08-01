package collections.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import collections.models.subclass.entities.Driver;

public interface DriverRepository extends JpaRepository<Driver, Long> {

	boolean existsByName(String name);
}
