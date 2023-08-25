package collections.services.interfaces;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import collections.models.subclass.entities.Car;

public interface ICarService {

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
	
	Optional<Car> findId(Long id);

	boolean verifyCar(String carList);

	void deleteCar(Long id);

}
