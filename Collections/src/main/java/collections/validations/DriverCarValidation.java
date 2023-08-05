package collections.validations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import collections.DTO.CarDTO;
import collections.DTO.DriverDTO;
import collections.models.assotiations.DriverCar;
import collections.models.embedabble.DriverCarFK;
import collections.models.interfaces.validations.ICarValidation;
import collections.models.interfaces.validations.IDriverValidation;

@Service
public class DriverCarValidation {

	@Autowired
	private ICarValidation iCarValidation;
	
	
	@Autowired
	private IDriverValidation iDriverValidation;
	
	public void saveDriverCar(DriverDTO driverDTO, CarDTO carDTO) {
		
		DriverCar driverCar = new DriverCar();
		
		Long carId = this.iCarValidation.validateCar(carDTO).getId();
		Long driverId = this.iDriverValidation.validateDriver(driverDTO).getId();
		
		DriverCarFK driverCarFK = new DriverCarFK(driverId, carId);	
		
		driverCar.setDriverCarFK(driverCarFK);
	}
}
