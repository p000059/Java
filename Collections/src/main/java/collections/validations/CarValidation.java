package collections.validations;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import collections.DTO.CarDTO;
import collections.models.interfaces.services.ICarService;
import collections.models.interfaces.validations.ICarValidation;
import collections.models.subclass.entities.Car;
import collections.models.subclass.nullables.CarNull;

@Service
public class CarValidation implements ICarValidation {

	@Autowired
	private ICarService icarService;

	@Override
	public Car validateCar(@Validated CarDTO carDTO) {


		if (icarService.verifyCar(carDTO.getCar())) {

			return new CarNull();

		} else {
			
			Car car = new Car();

			BeanUtils.copyProperties(carDTO, car);
			return this.icarService.save(car);
		}
	}

	@Override
	public Page<Car> getValidateCar(Pageable pageable) {

		return this.icarService.getCar(pageable);
	}

	@Override
	public Car getValidateCar(Long id) {

		try {

			return this.icarService.findId(id).get(); // The .get() method return the class if it exists.

		} catch (Exception e) {

			return new CarNull();
		}
	}

	@Override
	public Car updateValidadeCar(Long id, @Validated CarDTO carDTO) {

		try {

			Car car = new Car();

			BeanUtils.copyProperties(carDTO, car);
			car.setId(icarService.findId(id).get().getId()); // Keep the same ID for the update.

			return this.icarService.save(car);

		} catch (Exception e) {

			return new CarNull();
		}		
	}

	@Override
	public Car deleteValidadeCar(Long id) {

		try {
			
			Car car = new Car();;
			
			car.setCar("Car Deleted");
			car.setStatus(false);
			
			this.icarService.deleteCar(id);
			
			return car;
			
		} catch (Exception e) {

			return new CarNull();
		}
		
		/*
		 * Optional<Car> carOptional = icarService.findId(id);
		 * 
		 * if (!carOptional.isPresent()) {
		 * 
		 * return new CarNull();
		 * 
		 * } else {
		 * 
		 * Car car = new Car();
		 * 
		 * car.setCar("Car Deleted"); car.setStatus(false);
		 * 
		 * this.icarService.deleteCar(id); return car;
		 * 
		 * }
		 */
	}
}
