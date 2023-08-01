package collections.models.interfaces.services;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import collections.models.subclass.entities.Driver;

public interface IDriverService {

	Driver save(Driver driver);
	
	List<Driver> getDrivers();
	
	Page<Driver> getDrivers(Pageable pageable);

	Driver updateDriver(Driver driver);

	Optional<Driver> findId(Long id);

	boolean verifyDriver(String driver);

	void deleteDriver(Long id);
}
