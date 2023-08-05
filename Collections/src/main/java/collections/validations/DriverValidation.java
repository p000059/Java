package collections.validations;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import collections.DTO.DriverDTO;
import collections.models.interfaces.services.IDriverService;
import collections.models.interfaces.validations.IDriverValidation;
import collections.models.subclass.entities.Driver;
import collections.models.subclass.nullables.DriverNull;

@Service
public class DriverValidation implements IDriverValidation {

	@Autowired
	private IDriverService iDriverService;
	
	@Override
	public Driver validateDriver(@Validated DriverDTO driverDTO) {
		
		if(iDriverService.verifyDriver(driverDTO.getName())) {
		
			return new DriverNull();
			
		} else {
			
			Driver driver = new Driver();
			
			BeanUtils.copyProperties(driverDTO, driver);
			return this.iDriverService.save(driver);			
		}
	}

	@Override
	public Page<Driver> getValidateDriver(Pageable pageable) {
		
		return this.iDriverService.getDrivers(pageable);
	}

	@Override
	public Driver getValidateDriver(Long id) {
		
		try {
			
			return this.iDriverService.findId(id).get(); // The .get() method return the class if it exists.
			
		} catch (IllegalArgumentException e) {

			return new DriverNull();
		}
	}

	@Override
	public Driver updateValidadeDriver(Long id, DriverDTO driverDTO) {
		
		try {
			
			Driver driver = new Driver();
			
			BeanUtils.copyProperties(driverDTO, driver);
			driver.setId(this.iDriverService.findId(id).get().getId()); // Keep the same ID for the update.
			
			return this.iDriverService.save(driver);
			
		} catch (IllegalArgumentException e) {

			return new DriverNull();
		}
	}

	@Override
	public Driver deleteValidadeDriver(Long id) {
		
		try {
			
			Driver driver = new Driver();
			
			driver.setName("Driver deleted");
			driver.setStatus(false);
			
			this.iDriverService.deleteDriver(id);
			
			return driver;
			
		} catch (IllegalArgumentException e) {
			
			return new DriverNull();
		}
	}	
}
