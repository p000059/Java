package ic.service.interfaces;

import java.util.List;

import ic.model.Car;

public interface IcarService {

	/**
	 * Save a Car object.
	 *
	 * @param car must not be {@literal null}.
	 * @param status must not be {@literal null}.
	 * @return the Car object registered.
	 * @throws {@link CarNull} if car and status are null.
	 */
	Car insert(Car car);
	
	/**
	 * List Car object.
	 *
	 * @param nameCar must not be {@literal null}.
	 * @return a List Car object registered.
	 * @throws {@link CarNull} if nameCar are null.
	 */
	Iterable<Car> getCarByName(String nameCar);
	
	/**
	 * Delete a Car object.
	 *
	 * @param id must not be {@literal null}.
	 * @throws {@link CarNull} if id is null.
	 */
	Car deleteCar(Long id);
	
	/**
	 * List Car object.
	 *
	 * @return the List Car object.
	 * @throws ArrayList<Car> null.
	 */
	List<Car> listCar();
}
