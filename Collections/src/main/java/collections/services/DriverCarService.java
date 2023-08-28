package collections.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import collections.DTO.DriverCarDTO;
import collections.models.assotiations.DriverCar;
import collections.models.embedabble.DriverCarFK;
import collections.models.subclass.entities.Car;
import collections.models.subclass.entities.Driver;
import collections.repositories.DriverCarRepository;
import collections.services.interfaces.ICarService;
import collections.services.interfaces.IDriverCarService;
import collections.services.interfaces.IDriverService;

@Service
public class DriverCarService implements IDriverCarService {

	private Driver objectDriver;

	private Car objectCar;

	private DriverCarFK objectDriverCarFK;

	private DriverCar objectDriverCar;
	
	@Autowired
	private DriverCarRepository driverCarRepository;

	@Autowired
	private IDriverService iDriverService;

	@Autowired
	private ICarService iCarService;

	@Override
	@SuppressWarnings("static-access")
	public DriverCar saveDriverCar(Driver driver, Car car) {

		try {
			
			objectDriver = this.iDriverService.save(driver);
			objectCar = this.iCarService.save(car);
			
			objectDriverCarFK = new DriverCarFK().builder().driverId(objectDriver.getId()).carId(objectCar.getId()).build();
			
			objectDriverCar = new DriverCar().builder().driverCarFK(objectDriverCarFK).build();
			
			return this.driverCarRepository.save(objectDriverCar);
			
			
		} catch (Exception e) {

			return null;
		}
		

	}

	@Override
	@SuppressWarnings("static-access")
	public DriverCar saveDriverCar(DriverCarDTO driverCarDTO) {

		objectDriver = this.iDriverService.save(driverCarDTO.getDriver());
		objectCar = this.iCarService.save(driverCarDTO.getCar());

		objectDriverCarFK = new DriverCarFK().builder().driverId(objectDriver.getId()).carId(objectCar.getId()).build();

		objectDriverCar = new DriverCar().builder().driverCarFK(objectDriverCarFK).build();

		return this.driverCarRepository.save(objectDriverCar);

	}

}
