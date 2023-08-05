package collections.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import collections.models.assotiations.DriverCar;
import collections.models.interfaces.services.IDriveCarService;
import collections.repository.DriverCarRepository;

@Service
public class DriverCarService implements IDriveCarService {

	@Autowired
	public DriverCarRepository driverCarRepository;
	
	public DriverCar save(DriverCar driverCar) {
		
		return driverCarRepository.save(driverCar);
	}
}
