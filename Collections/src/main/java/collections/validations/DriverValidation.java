package collections.validations;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.validation.annotation.Validated;

import collections.DTO.DriverDTO;
import collections.models.interfaces.services.IDriverService;
import collections.models.interfaces.validations.IDriverValidation;
import collections.models.subclass.entities.Driver;
import collections.models.subclass.nullables.DriverNull;

public class DriverValidation implements IDriverValidation {

	@Autowired
	private IDriverService iDriverService;
	
	@Override
	public Driver validateDriver(@Validated DriverDTO driverDTO) {
		
		Driver driver = new Driver();

		if (iDriverService.verifyDriver(driverDTO.getName())) {

			return new DriverNull();

		} else {

			BeanUtils.copyProperties(driverDTO, driver);
			return iDriverService.save(driver);
		}
	}

	@Override
	public List<Driver> getValidateDriver() {
		
		return iDriverService.getDrivers();
	}

	@Override
	public Page<Driver> getValidateDriver(Pageable pageable) {
		
		return iDriverService.getDrivers(pageable);
	}

	@Override
	public Driver getValidateDriver(Long id) {
		
		Optional<Driver> optionalDriver = iDriverService.findId(id);

		if (!optionalDriver.isPresent()) {

			return new DriverNull();

		} else {

			return optionalDriver.get();
		}
	}

	@Override
	public Driver updateValidadeDriver(Long id, @Validated DriverDTO driverDTO) {
		

		Optional<Driver> driverOptional = iDriverService.findId(id);

		if (!driverOptional.isPresent()) {

			return new DriverNull();

		} else {

			Driver driver = new Driver();
			
			BeanUtils.copyProperties(driverDTO, driver);
			driver.setId(driverOptional.get().getId()); //Keeps the same ID.

			return iDriverService.save(driver);
		}
	}

	@Override
	public Driver deleteValidadeDriver(Long id) {
		
		Optional<Driver> driverOptional = iDriverService.findId(id);
		
		if (!driverOptional.isPresent()) {

			return new DriverNull();

		} else {

			Driver driver = new Driver();

			driver.setName("Driver Deleted");
			driver.setStatus(false);

			this.iDriverService.deleteDriver(id);
			return driver;

		}
	}	
}
