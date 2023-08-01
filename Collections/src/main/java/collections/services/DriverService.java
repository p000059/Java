package collections.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import collections.models.interfaces.IDriverService;
import collections.models.subclass.entities.Driver;
import collections.repository.DriverRepository;
import jakarta.transaction.Transactional;

@Service
@Primary
public class DriverService implements IDriverService {

	@Autowired
	private DriverRepository driverRepository;
	
	@Override
	@Transactional
	public Driver save(Driver driver) {
		
		return driverRepository.saveAndFlush(driver);		
	}

	@Override
	public Page<Driver> getDrivers(Pageable pageable) {
		
		return driverRepository.findAll(pageable);
	}

	@Override
	public Driver updateDriver(Driver driver) {
		
		return driverRepository.save(driver);
	}

	@Override
	public Optional<Driver> findId(Long id) {
		
		Optional<Driver> driver = driverRepository.findById(id);
		
		return driver;
	}

	@Override
	public boolean verifyDriver(String driver) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void deleteDriver(Long id) {
		
		driverRepository.deleteById(id);		
	}

}
