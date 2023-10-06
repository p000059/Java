package ic.service;

import java.util.ArrayList;
import java.util.List;

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

	@SuppressWarnings("static-access")
	@Override
	public Car deleteCar(Long id) {
		
		try {
			
			Car objectCar = this.icarRepository.findById(id).get();
			this.icarRepository.deleteById(objectCar.getId());
			
			
			return new Car().builder().name("Deleted Car").build();
			
		} catch (Exception e) {
			
			return new CarNull();
		}
	}

	@Override
	public List<Car> listCar() {
		
		try {
			
			return this.icarRepository.findAll();
			
		} catch (Exception e) {
			
			return new ArrayList<Car>();
		}
	}
}
