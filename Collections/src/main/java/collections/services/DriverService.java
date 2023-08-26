package collections.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import collections.models.subclass.entities.Driver;
import collections.models.subclass.nullables.DriverNull;
import collections.repositories.DriverRepository;
import collections.services.interfaces.IDriverService;
import jakarta.transaction.Transactional;

@Service
@Primary
public class DriverService implements IDriverService {

	@Autowired
	private DriverRepository driverRepository;

	@Override
	@Transactional
	@SuppressWarnings("static-access")
	public Driver save(Driver driver) {

		try {

			return driver instanceof Driver ? driverRepository.saveAndFlush(driver)
					: new Driver().builder().name("object invalid").build();

		} catch (IllegalArgumentException e) {

			return new DriverNull();

		} catch (NullPointerException e) {

			return new DriverNull();
		}
	}

	@Override
	@SuppressWarnings("static-access")
	public Driver getDriver(Long id) {

		try {

			return this.driverRepository.existsById(id) ? this.driverRepository.queryDriverById(id)
					: new Driver().builder().name("not found").build();

		} catch (NullPointerException e) {

			return new DriverNull();

		} catch (IllegalArgumentException e) {

			return new DriverNull();
		}
	}

	@Override
	@SuppressWarnings("static-access")
	public Driver getDriver(String name) {

		try {

			return this.driverRepository.existsByName(name) ? this.driverRepository.queryDriverByName(name)
					: new Driver().builder().name("not found driver").build();

		} catch (Exception e) {

			return new DriverNull();
		}
	}

	@Override
	public Page<Driver> getDrivers(Pageable pageable) {

		return driverRepository.findAll(pageable);
	}

	@Override
	@SuppressWarnings("static-access")
	public Driver updateDriver(Long id, Driver driver) {

		try {

			return this.driverRepository.existsById(id) && this.driverRepository.existsByName(driver.getName())
					? this.save(driver)
					: new Driver().builder().name("not found Driver object").build();

		} catch (Exception e) {

			return new DriverNull();
		}

	}
	
	@Override
	@SuppressWarnings("static-access")
	public Driver updateDriver(Driver driver) {

		try {

			return this.driverRepository.existsByName(driver.getName())
					? this.save(driver)
					: new Driver().builder().name("not found Driver object").build();

		} catch (Exception e) {

			return new DriverNull();
		}

	}

	@Override
	public Optional<Driver> findId(Long id) {

		try {
			
			return driverRepository.findById(id);			
			
		} catch (NullPointerException e) {
			
			return Optional.empty();
			
		} catch (IllegalArgumentException e) {
			
			return Optional.empty();
		}
		
	}

	@Override
	public boolean verifyDriver(String driver) {

		try {
			
			return driverRepository.existsByName(driver);			
			
		} catch (Exception e) {
			
			return null != null;
		}
		
	}


	@Override
	@Transactional
	@SuppressWarnings("static-access")
	public Driver deleteDriver(Long id) {

		try {
			
			if(this.driverRepository.existsById(id) == true && id != 0) {
				
				this.driverRepository.deleteById(id);
				
				return new Driver().builder().name("Object Delected").build();
				
			} else {
				
				return new Driver().builder().name("not deleted").build();
			}
						
		} catch (IllegalArgumentException e) {
			
			return new DriverNull();
			
		} catch (NullPointerException e) {
			
			return new DriverNull();
		}
	}
	
	@Override
	@Transactional
	@SuppressWarnings("static-access")
	public Driver deleteDriver(Long id, String name) {

		try {
			
			if(this.driverRepository.existsById(id) == this.driverRepository.existsByName(name)) {
				
				this.driverRepository.deleteById(id);
				
				return new Driver().builder().name("Object Delected").build();
				
			} else {
				
				return new Driver().builder().name("not deleted").build();
			}
						
		} catch (IllegalArgumentException e) {
			
			return new DriverNull();
			
		} catch (NullPointerException e) {
			
			return new DriverNull();
		}
	}
	
	@Override
	@Transactional
	@SuppressWarnings("static-access")
	public Driver deleteDriver(Long id, Driver driver) {

		try {
			
			if(this.driverRepository.existsById(id) == this.driverRepository.existsByName(driver.getName())) {
				
				this.driverRepository.deleteById(id);
				
				return new Driver().builder().name("Object Delected").build();
				
			} else {
				
				return new Driver().builder().name("not deleted").build();
			}
						
		} catch (IllegalArgumentException e) {
			
			return new DriverNull();
			
		} catch (NullPointerException e) {
			
			return new DriverNull();
		}
	}
}
