package collections.validations.interfaces;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import collections.DTO.CarDTO;
import collections.models.subclass.entities.Car;

public interface ICarValidation {

	Car validateCar(CarDTO carListDTO);

	Page<Car> getValidateCar(Pageable pageable);

	Car getValidateCar(Long id);

	Car updateValidadeCar(Long id, CarDTO carListDTO);

	Car deleteValidadeCar(Long id);
}
