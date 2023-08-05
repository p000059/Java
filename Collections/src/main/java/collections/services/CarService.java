package collections.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import collections.models.interfaces.services.ICarService;
import collections.models.subclass.entities.Car;
import collections.repository.CarRepository;

@Service
@Primary
public class CarService implements ICarService {

	@Autowired
	private CarRepository carRepository;
	
	@Override
	public Car save(Car car) {
		
		return this.carRepository.save(car);
	}
	
	@Override
	public Page<Car> getCar(Pageable pageable) {
		
		return this.carRepository.findAll(pageable);
	}

	@Override
	public Car updateCar(Car car) {
		
		return this.carRepository.saveAndFlush(car);
	}

	@Override
	public Optional<Car> findId(Long id) {
		
		try {
			
			return this.carRepository.findById(id);
			
		} catch (Exception e) {
			
			return Optional.empty();
		}
	}

	@Override
	public boolean verifyCar(String car) {
		
		return carRepository.existsByCar(car);
	}

	@Override
	public void deleteCar(Long id) {
		
		carRepository.deleteById(id);
	}
}
