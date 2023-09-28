package ic.service.interfaces;

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
}
