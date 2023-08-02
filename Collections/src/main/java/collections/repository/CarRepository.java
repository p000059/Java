package collections.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import collections.models.subclass.entities.Car;

public interface CarRepository extends JpaRepository<Car, Long> {

	boolean existsByCar(String car);
}
