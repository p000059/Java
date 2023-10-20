package ic.interfaces.validation;

import java.util.List;

import ic.model.dto.CarDTO;
import ic.model.entity.Car;

public interface IcarValidation {

	/**
	 * Validates the insertion of a car object.
	 *
	 * @param carDTO must not be {@literal null}.	 
	 * @return the Car object registered.
	 * @throws {@link CarNull} if carDTO is null.
	 */
	Car validateInsertion(CarDTO carDTO);
	
	/**
	 * Validates the insertion of a car object list.
	 *
	 * @param listCarDTO must not be {@literal null}.	 
	 * @return the inserted list.
	 * @throws {@link ArrayList<>()} if listCarDTO is null.
	 */
	List<Car> validateInsertion(List<CarDTO> listCarDTO);
}
