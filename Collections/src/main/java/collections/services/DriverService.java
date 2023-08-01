package collections.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import collections.models.interfaces.services.IDriverService;
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
	public List<Driver> getDrivers() {
		
		return driverRepository.findAll();
	}

	@Override
	public Page<Driver> getDrivers(Pageable pageable) {
		
		return driverRepository.findAll(pageable);
	}

	@Override
	public Driver updateDriver(Driver driver) {
		
		return driverRepository.saveAndFlush(driver);
	}

	@Override
	public Optional<Driver> findId(Long id) {
		
		return driverRepository.findById(id);
	}

	@Override
	public boolean verifyDriver(String driver) {
		
		return driverRepository.existsByName(driver);
	}

	@Override
	public void deleteDriver(Long id) {
		
		driverRepository.deleteById(id);		
	}
}
