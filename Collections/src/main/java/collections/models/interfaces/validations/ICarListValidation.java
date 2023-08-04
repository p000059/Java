package collections.models.interfaces.validations;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import collections.DTO.CarDTO;
import collections.models.subclass.entities.Car;

public interface ICarListValidation {

	Car validateCarList(CarDTO carListDTO);

	List<Car> getValidateCarLists();

	Page<Car> getValidateCarLists(Pageable pageable);

	Car getValidateCarList(Long id);

	Car updateValidadeCarList(Long id, CarDTO carListDTO);

	Car deleteValidadeCarList(Long id);
}
