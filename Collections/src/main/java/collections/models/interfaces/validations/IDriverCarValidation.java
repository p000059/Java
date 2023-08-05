package collections.models.interfaces.validations;

import collections.DTO.CarDTO;
import collections.DTO.DriverDTO;
import collections.models.assotiations.DriverCar;
import collections.models.subclass.entities.Car;
import collections.models.subclass.entities.Driver;

public interface IDriverCarValidation {
	
	Driver saveDriverCar(DriverDTO driverDTO);
	Car saveDriverCar(CarDTO carDTO);
	DriverCar saveDriverCar(DriverDTO driverDTO, CarDTO carDTO);
}
