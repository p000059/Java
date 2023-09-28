package ic.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ic.model.Car;
import ic.model.nullable.CarNull;
import ic.repositories.IcarRepository;
import ic.service.interfaces.IcarService;
import jakarta.transaction.Transactional;

@Service
public class CarService implements IcarService {

	@Autowired
	private IcarRepository icarRepository;

	@Override
	@Transactional
	public Car insert(Car car) {

		try {

			return this.icarRepository.saveCar(car);

		} catch (Exception e) {

			return new CarNull();

		}
	}

	@Override
	public Iterable<Car> getCarByName(String nameCar) {
		
		try {
			
			return this.icarRepository.findByName(nameCar);
			
		} catch (Exception e) {

			return new ArrayList<Car>();
		}
		
	}
}
