package collections.models.interfaces.services;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import collections.models.subclass.entities.Car;

public interface ICarService {

	Car save(Car carList);

	List<Car> getCarLists();
	
	Page<Car> getCarLists(Pageable pageable);

	Car updateCarList(Car carList);

	Optional<Car> findId(Long id);

	boolean verifyCarList(String carList);

	void deleteCarList(Long id);

}
