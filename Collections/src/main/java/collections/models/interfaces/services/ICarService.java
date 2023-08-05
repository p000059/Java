package collections.models.interfaces.services;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import collections.models.subclass.entities.Car;

public interface ICarService {

	Car save(Car carList);
	
	Page<Car> getCar(Pageable pageable);

	Car updateCar(Car carList);

	Optional<Car> findId(Long id);

	boolean verifyCar(String carList);

	void deleteCar(Long id);

}
