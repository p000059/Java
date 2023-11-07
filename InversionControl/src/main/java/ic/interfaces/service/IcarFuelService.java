package ic.interfaces.service;

import ic.model.entity.Car;
import ic.model.entity.CarFuel;
import ic.model.entity.Fuel;

public interface IcarFuelService {

	/**
	 * Save a CarFuel object.
	 *
	 * @param carFuel must not be {@literal null}.
	 * @return the CarFuel object registered.
	 * @throws {@link CarFuelNull} if car is null.
	 */
	CarFuel insert(CarFuel carFuel);
	
	/**
	 * Save a CarFuel object.
	 *
	 * @param car and fuel must not be {@literal null}.
	 * @return the CarFuel object registered.
	 * @throws {@link CarFuelNull} if car and fuel are null.
	 */
	CarFuel insert(Car car, Fuel fuel);
}
