package collections.services.interfaces;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import collections.models.subclass.entities.Car;

public interface ICarService {

	/**
	 * Verify if string car is null.
	 *
	 * @param car must not be {@literal null}.
	 * @return true if car exists.
	 * @throws {@link false} if car does not exist.
	 */
	Boolean verifyCar(String carList);
	
	/**
	 * Save an Address object.
	 *
	 * @param car must not be {@literal null}.
	 * @param status  must not be {@literal null}.
	 * @return the Car object registered.
	 * @throws {@link CarNull} if car and status are null.
	 */
	Car save(Car car);

	/**
	 * Get object car by id.
	 *
	 * @param id must not be {@literal null}.
	 * @return the registered {@link Car} object.
	 * @throws {@link CarNull} if car and status are null.
	 */
	Car getCar(Long id);
	
	/**
	 * Get object car by String car.
	 *
	 * @param car must not be {@literal null}.
	 * @return the registered {@link Car} object.
	 * @throws {@link CarNull} if car and status are null.
	 */
	Car getCar(Long id, String car);
	
	/**
	 * Get car class pages.
	 *
	 * @param pageable must not be {@literal null}.	 * 
	 * @return a list of cars.
	 * @throws Page.empty if pageable is null.
	 */
	Page<Car> getCar(Pageable pageable);

	/**
	 * Update object Car.
	 *
	 * @param car must not be {@literal null}.	 * 
	 * @return object Car.
	 * @throws {@link CarNull} if car parameter is null.
	 */
	Car updateCar(Car car);
	
	/**
	 * Update object Car by String name.
	 *
	 * @param car must not be {@literal null}.	 * 
	 * @return object Car.
	 * @throws {@link CarNull} if car parameter is null.
	 */
	Car updateCar(String car);
	
	/**
	 * Update object Car by id.
	 *
	 * @param id must not be {@literal null}.	 * 
	 * @return object Car.
	 * @throws {@link CarNull} if id parameter is null.
	 */
	Car udpateCar(Long id);
	
	/**
	 * Update object Car by id and object.
	 *
	 * @param id must not be {@literal null}.
	 * @param object car must not be {@literal null}.	 
	 * @return object Car.
	 * @throws {@link CarNull} if id and car are null.
	 */
	Car updateCar(Long id, Car car);
	
	/**
	 * Search object Car by id.
	 *
	 * @param id must not be {@literal null}.	 
	 * @return {@link Optional<Car>}.
	 * @throws {@link Optional.Empty} if id is null.
	 */
	Optional<Car> findId(Long id);
	
	/**
	 * Delete object Car by id.
	 *
	 * @param id must not be {@literal null}.	 
	 * @return {@link Car} class with confirmation message.
	 * @throws {@link CarNull} if id is null.
	 */
	Car deleteCar(Long id);

}
