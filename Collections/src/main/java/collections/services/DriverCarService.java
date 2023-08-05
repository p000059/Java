package collections.services;

import org.springframework.beans.factory.annotation.Autowired;

import collections.models.interfaces.validations.ICarValidation;
import collections.models.interfaces.validations.IDriverValidation;

public class DriverCarService {

	@Autowired
	private ICarValidation iCarListValidation;
	
	@Autowired
	private IDriverValidation iDriverValidation;
	
	
}
