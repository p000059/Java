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
	List<Car> validateInsertions(List<CarDTO> listCarDTO);
	
	/**
	 * Validates the find of a car object.
	 *
	 * @param carDTO must not be {@literal null}.	 
	 * @return car Object.
	 * @throws {@link CarNull} if carDTO is null.
	 */
	Car readCar(CarDTO carDTO);
	
	/**
	 * Delete a car object.
	 *
	 * @param carDTO must not be {@literal null}.	 
	 * @return car Object.
	 * @throws {@link CarNull} if carDTO is null.
	 */
	Car deleteCar(CarDTO carDTO);
	
	/**
	 * Update a car object.
	 *
	 * @param carDTO must not be {@literal null}.	 
	 * @return car Object.
	 * @throws {@link CarNull} if carDTO is null.
	 */
	Car validateCarUpdate(CarDTO carDTO);
}
