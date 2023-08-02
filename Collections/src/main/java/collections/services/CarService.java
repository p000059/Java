package collections.services;

import java.util.List;
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
	private CarRepository carListRepository;
	
	@Override
	public Car save(Car carList) {
		
		return this.carListRepository.save(carList);
	}
	
	@Override
	public List<Car> getCarLists() {
		
		return this.carListRepository.findAll();
	}

	@Override
	public Page<Car> getCarLists(Pageable pageable) {
		
		return this.carListRepository.findAll(pageable);
	}

	@Override
	public Car updateCarList(Car carList) {
		
		return this.carListRepository.saveAndFlush(carList);
	}

	@Override
	public Optional<Car> findId(Long id) {
		
		return this.carListRepository.findById(id);
	}

	@Override
	public boolean verifyCarList(String carList) {
		
		return carListRepository.existsByCar(carList);
	}

	@Override
	public void deleteCarList(Long id) {
		
		carListRepository.deleteById(id);
	}
}
