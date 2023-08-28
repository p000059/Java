package collections.services.interfaces;

import collections.DTO.DriverCarDTO;
import collections.models.assotiations.DriverCar;
import collections.models.subclass.entities.Car;
import collections.models.subclass.entities.Driver;

public interface IDriverCarService {

	DriverCar saveDriverCar(Driver driver, Car car);
	
	DriverCar saveDriverCar(DriverCarDTO driverCarDTO);
}
