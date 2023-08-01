package collections.models.interfaces.services;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import collections.models.subclass.entities.Driver;

public interface IDriverService {

	Driver save(Driver driver);
	
	Page<Driver> getDrivers(Pageable pageable);

	Driver updateDriver(Driver driver);

	Optional<Driver> findId(Long id);

	boolean verifyDriver(String driver);

	void deleteDriver(Long id);
}
