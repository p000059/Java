package ic.validation;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ic.interfaces.service.IcarFuelService;
import ic.model.dto.CarDTO;
import ic.model.dto.CarFuelDTO;
import ic.model.dto.FuelDTO;
import ic.model.embeddables.CarFuelFK;
import ic.model.entity.Car;
import ic.model.entity.CarFuel;
import ic.model.entity.Fuel;
import ic.model.nullable.CarFuelNull;

@Service
public class CarFuelValidation {

	@Autowired
	private IcarFuelService icarFuelService;

	@SuppressWarnings("unused")
	private CarFuel convertDTOtoObject(CarFuelDTO carFuelDTO) {

		CarFuel objectCarFuel = new CarFuel();

		BeanUtils.copyProperties(carFuelDTO, objectCarFuel);

		return objectCarFuel;
	}

	@SuppressWarnings({ "static-access", "unused" })
	private CarFuel converteDTO(CarDTO car, FuelDTO fuel) {

		Car objectCar = new Car();

		Fuel objectFuel = new Fuel();

		BeanUtils.copyProperties(car, objectCar);
		BeanUtils.copyProperties(fuel, objectFuel);

		CarFuelFK carFuelFK = new CarFuelFK().builder().carId(objectCar.getId()).fuelId(objectFuel.getId()).build();

		return new CarFuel().builder().carFuelFK(carFuelFK).build();
	}

	@SuppressWarnings("unused")
	private Fuel convertDTOtoObject(FuelDTO fuelDTO) {

		Fuel objectFuel = new Fuel();

		BeanUtils.copyProperties(fuelDTO, objectFuel);

		return objectFuel;
	}

	@SuppressWarnings("unused")
	private Car convertDTOtoObject(CarDTO carDTO) {

		Car objectCar = new Car();

		BeanUtils.copyProperties(carDTO, objectCar);

		return objectCar;
	}

	@SuppressWarnings("static-access")
	public CarFuel insertValidation(CarDTO carDTO, FuelDTO fuelDTO) {

		try {

			return ((carDTO instanceof CarDTO) && (fuelDTO instanceof FuelDTO))
					? this.icarFuelService.insert(this.convertDTOtoObject(carDTO), this.convertDTOtoObject(fuelDTO))
					: new CarFuelNull().builder().build();

		} catch (Exception e) {

			return new CarFuelNull().builder().build();
		}

	}
}
