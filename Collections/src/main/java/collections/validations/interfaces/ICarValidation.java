package collections.validations.interfaces;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import collections.DTO.CarDTO;
import collections.models.subclass.entities.Car;

public interface ICarValidation {

	/**
	 * Validates a {@link Car} Object.
	 *
	 * @param {@link CarDTO} must not be {@literal null}.
	 * @param status  must not be {@literal null}.
	 * @return the Car object registered.
	 * @throws {@link CarNull} if car and status are null.
	 */
	Car validateCar(CarDTO carDTO);

	/**
	 * Get pages from the {@link Car} object.
	 *
	 * @param pageable must not be {@literal null}.
	 * @return registered car object pages.
	 * @throws {@link Page.empty()} if pageable is null.
	 */
	Page<Car> getValidateCar(Pageable pageable);

	/**
	 * Validates {@link Car} object.
	 *
	 * @param id must not be {@literal null}.
	 * @return registered {@link Car} object.
	 * @throws {@link CarNull()} if id is null.
	 */
	Car getValidateCar(Long id);

	/**
	 * This method validates and updates an object of the {@link Car} class, 
	 * using the properties of this same class, 
	 * which are the id and the name.
	 *
	 * @param id must not be {@literal null}.
	 * @param carDTO must not be {@literal null}.
	 * @return registered {@link Car} object.
	 * @throws {@link CarNull()} if id is null.
	 */
	Car updateValidadeCar(Long id, CarDTO carDTO);
	
	/**
	 * This method validates and updates an object of the {@link Car} class.
	 *
	 * @param carDTO must not be {@literal null}.
	 * @return registered {@link Car} object.
	 * @throws {@link CarNull()} if id is null.
	 */
	Car updateValidateCar(CarDTO carDTO);

	/**
	 * Delete {@link Car} object.
	 *
	 * @param id must not be {@literal null}.
	 * @return the {@link Car} object deleted.
	 * @throws {@link CarNull()} if id is null.
	 */
	Car deleteValidadeCar(Long id);
	
	/**
	 * Delete {@link Car} object.
	 *
	 * @param id must not be {@literal null}.
	 * @return the {@link Car} object deleted.
	 * @throws {@link CarNull()} if id is null.
	 */
	Car deleteValidateCar(Long id, CarDTO carDTO);
}
