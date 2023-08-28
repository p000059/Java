package collections.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import collections.DTO.entities.DriverCarDTO;
import collections.models.assotiations.entities.DriverCar;
import collections.models.assotiations.nullables.DriverCarNull;
import collections.models.embedabble.DriverCarFK;
import collections.models.subclass.entities.Car;
import collections.models.subclass.entities.Driver;
import collections.repositories.DriverCarRepository;
import collections.services.interfaces.ICarService;
import collections.services.interfaces.IDriverCarService;
import collections.services.interfaces.IDriverService;

@Service
public class DriverCarService implements IDriverCarService {

	private Driver driverObject;

	private Car carObject;

	private DriverCarFK driverCarFKobject;

	private DriverCar driverCarObject;

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

			if ((driver instanceof Driver) && (car instanceof Car)) {

				driverObject = this.iDriverService.save(driver);
				carObject = this.iCarService.save(car);

				driverCarFKobject = new DriverCarFK().builder().driverId(driverObject.getId()).carId(carObject.getId())
						.build();

				driverCarObject = new DriverCar().builder().driverCarFK(driverCarFKobject).build();

				return this.driverCarRepository.save(driverCarObject);

			} else {

				return new DriverCar();
			}

		} catch (Exception e) {

			return new DriverCarNull();
		}
	}

	@Override
	@SuppressWarnings("static-access")
	public DriverCar saveDriverCar(DriverCarDTO driverCarDTO) {

		try {
			
			if(driverCarDTO instanceof DriverCarDTO) {
				
				driverObject = this.iDriverService.save(driverCarDTO.getDriver());
				carObject = this.iCarService.save(driverCarDTO.getCar());
				
				driverCarFKobject = new DriverCarFK().builder().driverId(driverObject.getId()).carId(carObject.getId()).build();
				
				driverCarObject = new DriverCar().builder().driverCarFK(driverCarFKobject).build();
				
				return this.driverCarRepository.save(driverCarObject);
				
			} else {
				
				return new DriverCar();
			}
			
		} catch (Exception e) {

			return new DriverCarNull();
		}
	}
	
	

}
