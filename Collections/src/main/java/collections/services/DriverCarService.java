package collections.services;

import org.springframework.beans.factory.annotation.Autowired;

import collections.models.interfaces.validations.ICarListValidation;
import collections.models.interfaces.validations.IDriverValidation;

public class DriverCarService {

	@Autowired
	private ICarListValidation iCarListValidation;
	
	@Autowired
	private IDriverValidation iDriverValidation;
	
	public  saveDriverCar() {
		
	}
}
