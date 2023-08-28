package collections.services.interfaces;

import collections.DTO.entities.DriverCarDTO;
import collections.models.assotiations.entities.DriverCar;
import collections.models.subclass.entities.Car;
import collections.models.subclass.entities.Driver;

public interface IDriverCarService {

	DriverCar saveDriverCar(Driver driver, Car car);
	
	DriverCar saveDriverCar(DriverCarDTO driverCarDTO);
}
