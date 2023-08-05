package collections.validations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import collections.DTO.CarDTO;
import collections.DTO.DriverDTO;
import collections.models.assotiations.DriverCar;
import collections.models.embedabble.DriverCarFK;
import collections.models.interfaces.services.IDriveCarService;
import collections.models.interfaces.validations.ICarValidation;
import collections.models.interfaces.validations.IDriverCarValidation;
import collections.models.interfaces.validations.IDriverValidation;
import collections.models.subclass.entities.Car;
import collections.models.subclass.entities.Driver;

@Service
public class DriverCarValidation implements IDriverCarValidation {

	@Autowired
	private ICarValidation iCarValidation;
	
	@Autowired
	private IDriverValidation iDriverValidation;
	
	@Autowired
	private IDriveCarService iDriveCarService;
	
	@Override
	public Driver saveDriverCar(@Validated DriverDTO driverDTO) {
		
		return this.iDriverValidation.validateDriver(driverDTO);
	}
	
	@Override
	public Car saveDriverCar(CarDTO carDTO) {
		
		return this.iCarValidation.validateCar(carDTO);
	}
	
	@Override
	public DriverCar saveDriverCar(@Validated DriverDTO driverDTO, CarDTO carDTO) {
		
		DriverCar driverCar = new DriverCar();
		
		Long carId = this.iCarValidation.validateCar(carDTO).getId();
		Long driverId = this.iDriverValidation.validateDriver(driverDTO).getId();
		
		DriverCarFK driverCarFK = new DriverCarFK(driverId, carId);
		
		driverCar.setDriverCarFK(driverCarFK);
		
		return this.iDriveCarService.save(driverCar);
	}
}
