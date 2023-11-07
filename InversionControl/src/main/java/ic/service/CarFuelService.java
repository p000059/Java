package ic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ic.interfaces.repository.ICarFuelRepository;
import ic.interfaces.service.IcarFuelService;
import ic.interfaces.service.IcarService;
import ic.interfaces.service.IfuelService;
import ic.model.embeddables.CarFuelFK;
import ic.model.entity.Car;
import ic.model.entity.CarFuel;
import ic.model.entity.Fuel;

@Service
public class CarFuelService implements IcarFuelService {

	@Autowired
	private ICarFuelRepository iCarFuelRepository;

	@Autowired
	private IcarService icarService;

	@Autowired
	private IfuelService ifuelService;

	@Override
	public CarFuel insert(CarFuel carFuel) {

		return this.iCarFuelRepository.saveCarFuel(carFuel);
	}

	@Override
	@SuppressWarnings("static-access")
	public CarFuel insert(Car car, Fuel fuel) {

		/*
		 * Car objectCar = this.icarService.insert(car);
		 * 
		 * Fuel objectFuel = this.ifuelService.insert(fuel);
		 * 
		 * CarFuelFK carFuelFK = new
		 * CarFuelFK().builder().carId(this.icarService.insert(car).getId())
		 * .fuelId(this.ifuelService.insert(fuel).getId()).build();
		 */

		return this.iCarFuelRepository.saveCarFuel(
				new CarFuel().builder().carFuelFK(new CarFuelFK().builder().carId(this.icarService.insert(car).getId())
						.fuelId(this.ifuelService.insert(fuel).getId()).build()).build());
	}

}
