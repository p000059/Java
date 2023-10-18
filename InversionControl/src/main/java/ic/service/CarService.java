package ic.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ic.interfaces.repository.IcarRepository;
import ic.interfaces.service.IcarService;
import ic.model.entity.Car;
import ic.model.nullable.CarNull;
import jakarta.transaction.Transactional;

@Service
public class CarService implements IcarService {

	@Autowired
	private IcarRepository icarRepository;

	@Override
	public Car findCar(Car car) {
		
		try {
			
			return this.icarRepository.findNameCarParam(car.getName());
			
		} catch (IllegalArgumentException e) {
			
			return new CarNull();
			
		} catch (NullPointerException e) {
			
			return new CarNull();
		}
	}
	
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

	@Override
	@SuppressWarnings("static-access")
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
			
			return this.icarRepository.listAllCars();
			
		} catch (Exception e) {
			
			return new ArrayList<Car>();
		}
	}

	@Override
	@SuppressWarnings("static-access")
	public Car deleteCar(Car car) {
		
		try {
			
			Car objectCar = this.icarRepository.findById(car.getId()).get();
			
			if(car instanceof Car && car.getId() == objectCar.getId()) {
				
				this.icarRepository.deleteCarById(car.getId(), false);

				return new Car().builder().name("deleted car").build();
				
			} else {
				
				return new CarNull();
			}
			
		} catch (NullPointerException e) {
			
			return new CarNull().builder().name("object null").build();
			
		} catch (IllegalArgumentException e) {
			
			return new CarNull().builder().name("illegal argument").build();			
		}
	}
}
