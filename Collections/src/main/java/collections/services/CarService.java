package collections.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import collections.models.subclass.entities.Car;
import collections.models.subclass.nullables.CarNull;
import collections.repositories.CarRepository;
import collections.services.interfaces.ICarService;
import jakarta.transaction.Transactional;

@Service
@Primary
public class CarService implements ICarService {

	@Autowired
	private CarRepository carRepository;

	@Override
	@Transactional
	@SuppressWarnings("static-access")
	public Car save(Car car) {

		try {

			return car instanceof Car ? this.carRepository.saveAndFlush(car)
					: new Car().builder().car("not save").build();

		} catch (IllegalArgumentException e) {

			return new CarNull();

		} catch (NullPointerException e) {

			return new CarNull();
		}
	}

	@Override
	@SuppressWarnings("static-access")
	public Car getCar(Long id) {
		
		try {
			
			return this.carRepository.existsById(id) ? this.carRepository.queryCarById(id) : new Car().builder().car("not found").build();
			
		} catch (IllegalArgumentException e) {
			
			return new CarNull();
			
		} catch (NullPointerException e) {
			
			return new CarNull();
		}
	}
	
	@SuppressWarnings("static-access")
	public Car getCar(Long id, String car) {
		
		try {
			
			Car objectCarName = this.carRepository.queryCarByName(car);
			Car objectCarId = this.carRepository.queryCarById(id);
			
			return objectCarName.getId() == objectCarId.getId() ? objectCarName : new Car().builder().car("not found").build();
			
		} catch (Exception e) {

			return new CarNull();
		}
	}

	@Override
	public Page<Car> getCar(Pageable pageable) {

		try {

			return this.carRepository.findAll(pageable);

		} catch (Exception e) {

			return Page.empty();
		}

	}

	@Override
	public Car updateCar(Car car) {

		try {

			return this.save(car);

		} catch (Exception e) {

			return new CarNull();
		}

	}

	@Override
	@Transactional
	@SuppressWarnings("static-access")
	public Car updateCar(String car) {

		try {

			Car objectCar = this.carRepository.queryCarByName(car);

			return this.carRepository.existsByCar(car) ? this.save(objectCar)
					: new Car().builder().car("not saved").build();

		} catch (Exception e) {

			return new CarNull();
		}
	}

	@Override
	@Transactional
	@SuppressWarnings("static-access")
	public Car udpateCar(Long id) {

		try {

			Car objectCar = this.carRepository.queryCarById(id);

			return this.carRepository.existsById(id) ? this.save(objectCar)
					: new Car().builder().car("not saved").build();

		} catch (Exception e) {

			return new CarNull();
		}
	}
	
	@Override
	@Transactional
	@SuppressWarnings("static-access")
	public Car updateCar(Long id, Car car) {
		
		try {
			
			return this.carRepository.existsById(id) ? this.save(car) : new Car().builder().car("not save").build();
			
		} catch (Exception e) {
			
			return new CarNull();
		}
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
	public Boolean verifyCar(String car) {

		try {
			
			return carRepository.existsByCar(car);
			
		} catch (IllegalArgumentException e) {
			
			return false;
			
		} catch (NullPointerException e) {
			
			return false;
		}
		
	}

	@Override
	@Transactional
	@SuppressWarnings("static-access")
	public Car deleteCar(Long id) {

		try {
			
			if(this.carRepository.existsById(id)) {
				
				this.carRepository.deleteById(id);
				
				return new Car().builder().car("Object Delected").build();
				
			} else {
				
				return new Car().builder().car("not deleted").build();
			}
			
			
		} catch (IllegalArgumentException e) {
			
			return new CarNull();
			
		} catch (NullPointerException e) {
			
			return new CarNull();
		}
	}
}
