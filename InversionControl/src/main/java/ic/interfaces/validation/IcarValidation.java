package ic.interfaces.validation;

import ic.model.dto.CarDTO;
import ic.model.entity.Car;

public interface IcarValidation {

	Car validateInsertion(CarDTO carDTO);
}
