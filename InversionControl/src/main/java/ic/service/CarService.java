package ic.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ic.interfaces.repository.IcarRepository;
import ic.interfaces.service.IcarService;
import ic.interfaces.service.ItaxService;
import ic.model.entity.Car;
import ic.model.nullable.CarNull;
import jakarta.transaction.Transactional;

@Service
public class CarService implements IcarService {

	@Autowired
	private IcarRepository icarRepository;

	@Autowired
	private ItaxService itaxService;

	@Override
	public Car findCar(Car car) {

		return this.icarRepository.findPlateCarParam(car.getCarLicensePlate());
	}

	@Override
	@Transactional
	public Car insert(Car car) {

		return this.icarRepository.saveCar(car);
	}

	@Override
	public Iterable<Car> getCarByName(String nameCar) {

		try {

			return this.icarRepository.findByName(nameCar);

		} catch (Exception e) {

			return new ArrayList<Car>();
		}

	}

	@Override
	@Transactional
	@SuppressWarnings("static-access")
	public Car deleteCar(Long id) {

		Car objectCar = this.icarRepository.findById(id).get();
		this.icarRepository.deleteById(objectCar.getId());

		return new Car().builder().name("Deleted Car").build();
	}

	@Override
	public List<Car> listCar() {

		try {

			return this.icarRepository.listAllCars();

		} catch (Exception e) {

			return new ArrayList<Car>();
		}
	}

	@Override
	@Transactional
	@SuppressWarnings("static-access")
	public Car deleteCar(Car car) {

		Car objectCar = this.icarRepository.findById(car.getId()).get();

		if (car instanceof Car && (car.getId() == objectCar.getId())) {

			this.icarRepository.deleteCarById(car.getId(), false);

			return new Car().builder().name("deleted car").build();

		} else {

			return new CarNull();
		}

	}

	@Override
	@Transactional
	public List<Car> insertCars(List<Car> listCar) {

		try {

			return this.icarRepository.saveAll(listCar);

		} catch (Exception e) {

			return new ArrayList<Car>();
		}

	}

	@Override
	public Car updateCar(Car car) {

		this.icarRepository.updateCar(car.getId(), car.getName(), car.getCarLicensePlate(), this.itaxService.updateTax(car.getTax()),
				car.getStatus());

		return this.icarRepository.findById(car.getId()).get();
	}
}
