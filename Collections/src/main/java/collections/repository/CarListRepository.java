package collections.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import collections.models.subclass.entities.CarList;

public interface CarListRepository extends JpaRepository<CarList, Long> {

	boolean existsByCar(String car);
}
