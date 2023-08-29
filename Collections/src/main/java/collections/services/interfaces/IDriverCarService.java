package collections.services.interfaces;

import collections.DTO.entities.DriverCarDTO;
import collections.models.assotiations.entities.DriverCar;
import collections.models.subclass.entities.Car;
import collections.models.subclass.entities.Driver;

public interface IDriverCarService {

	/**
	 * Save Driver and Car object.
	 *
	 * @param {@link Driver} must not be {@literal null}.
	 * @param {@link Car} must not be {@literal null}.
	 * @return {@link DriverCar} object.
	 * @throws {@link DriveCarNull()} if car does not exist.
	 */
	DriverCar saveDriverCar(Driver driver, Car car);
	
	/**
	 * Save Driver and Car object.
	 *
	 * @param {@link DriverCarDTO} must not be {@literal null}.
	 * @return {@link DriverCar} object.
	 * @throws {@link DriveCarNull()} if car does not exist.
	 */
	DriverCar saveDriverCar(DriverCarDTO driverCarDTO);
	
	/**
	 * Update Driver and Car object .
	 *
	 * @param {@link driverCarDTO} must not be {@literal null}.
	 * @return {@link DriverCar} object.
	 * @throws {@link false} if car does not exist.
	 */
	DriverCar updateDriverCar(DriverCarDTO driverCarDTO);
}
