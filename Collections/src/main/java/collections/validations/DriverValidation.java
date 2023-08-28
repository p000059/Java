package collections.validations;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import collections.DTO.DriverDTO;
import collections.models.subclass.entities.Driver;
import collections.models.subclass.nullables.DriverNull;
import collections.services.interfaces.IDriverService;
import collections.validations.interfaces.IDriverValidation;

@Service
public class DriverValidation implements IDriverValidation {

	@Autowired
	private IDriverService iDriverService;

	@SuppressWarnings("static-access")
	Driver invalidParameter = new DriverNull().builder().name("invalid parameter").build();

	@SuppressWarnings("static-access")
	Driver unvalidatedDriver = new Driver().builder().name("not validated").build();

	@Override
	public Driver validateDriver(@Validated DriverDTO driverDTO) {

		try {

			if (iDriverService.verifyDriver(driverDTO.getName())) {

				return unvalidatedDriver;

			} else {

				Driver driver = new Driver();

				BeanUtils.copyProperties(driverDTO, driver);
				return this.iDriverService.save(driver);
			}

		} catch (IllegalArgumentException e) {

			return invalidParameter;

		} catch (NullPointerException e) {

			return invalidParameter;
		}
	}

	@Override
	public Page<Driver> getValidateDriver(Pageable pageable) {

		try {

			return this.iDriverService.getDrivers(pageable);

		} catch (Exception e) {

			return Page.empty();
		}
	}

	@Override
	public Driver getValidateDriver(Long id) {

		try {

			return this.iDriverService.findId(id).get(); // The .get() method return the class if it exists.

		} catch (IllegalArgumentException e) {

			return invalidParameter;

		} catch (NullPointerException e) {

			return invalidParameter;
		}
	}

	public Driver updateValidateDriver(@Validated DriverDTO driverDTO) {

		try {

			Driver objectDriver = new Driver();

			if (driverDTO instanceof DriverDTO && driverDTO != null) {

				BeanUtils.copyProperties(driverDTO, objectDriver);

				return this.iDriverService.save(objectDriver);

			} else {

				return unvalidatedDriver;
			}

		} catch (IllegalArgumentException e) {

			return invalidParameter;

		} catch (NullPointerException e) {

			return invalidParameter;
		}
	}

	@Override
	public Driver updateValidadeDriver(@Validated Long id, @Validated DriverDTO driverDTO) {

		try {

			if (driverDTO instanceof DriverDTO && id != 0) {

				Driver driver = new Driver();

				BeanUtils.copyProperties(driverDTO, driver);
				driver.setId(iDriverService.findId(id).get().getId()); // Keep the same ID for the update.

				return this.iDriverService.save(driver);

			} else {

				return unvalidatedDriver;
			}

		} catch (IllegalArgumentException e) {

			return invalidParameter;

		} catch (NullPointerException e) {

			return invalidParameter;
		}
	}

	@Override
	public Driver deleteValidadeDriver(Long id) {

		try {

			if (!(id == 0)) {

				Driver driver = new Driver();

				driver.setName("Driver Deleted");
				driver.setStatus(false);

				this.iDriverService.deleteDriver(id);

				return driver;
				
			} else {

				return unvalidatedDriver;
			}

		} catch (IllegalArgumentException e) {

			return invalidParameter;
			
		} catch (NullPointerException e) {
			
			return invalidParameter;
		}
	}
	
	@Override
	public Driver deleteValidadeDriver(Long id, DriverDTO driverDTO) {

		try {

			if (driverDTO instanceof DriverDTO) {

				Driver driver = new Driver();

				BeanUtils.copyProperties(driverDTO, driver);

				this.iDriverService.deleteDriver(id, driver);
				
				driver.setName("Driver Deleted");
				driver.setStatus(false);

				return driver;
				
			} else {

				return unvalidatedDriver;
			}

		} catch (IllegalArgumentException e) {

			return invalidParameter;
			
		} catch (NullPointerException e) {
			
			return invalidParameter;
		}
	}
}
