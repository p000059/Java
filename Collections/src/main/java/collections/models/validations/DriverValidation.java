package collections.models.validations;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.validation.annotation.Validated;

import collections.DTO.DriverDTO;
import collections.models.interfaces.validations.IDriverValidation;
import collections.models.subclass.entities.Driver;

public class DriverValidation implements IDriverValidation {

	@Override
	public Driver validateDriver(@Validated DriverDTO driverDTO) {
		
		return null;
	}

	@Override
	public List<Driver> getValidateDriver() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Driver> getValidateDriver(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Driver getValidateDriver(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Driver updateValidadeDriver(Long id, DriverDTO driverDTO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Driver deleteValidadeDriver(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
