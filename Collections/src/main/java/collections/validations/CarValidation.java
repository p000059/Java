package collections.validations;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import collections.DTO.CarDTO;
import collections.models.subclass.entities.Car;
import collections.models.subclass.nullables.CarNull;
import collections.services.interfaces.ICarService;
import collections.validations.interfaces.ICarValidation;

@Service
public class CarValidation implements ICarValidation {

	@Autowired
	private ICarService icarService;

	@Override
	@SuppressWarnings("static-access")
	public Car validateCar(@Validated CarDTO carDTO) {

		try {
			
			if (icarService.verifyCar(carDTO.getCar())) {
				
				return new Car().builder().car("not validated").build();
				
			} else {
				
				Car car = new Car();
				
				BeanUtils.copyProperties(carDTO, car);
				return this.icarService.save(car);
			}			
			
		} catch (Exception e) {
			
			return new CarNull();
		}
	}

	@Override
	public Page<Car> getValidateCar(Pageable pageable) {

		try {
			
			return this.icarService.getCar(pageable);			
			
		} catch (Exception e) {
			
			return Page.empty();
		}		
	}

	@Override
	public Car getValidateCar(Long id) {

		try {

			return this.icarService.findId(id).get(); // The .get() method return the class if it exists.

		} catch (IllegalArgumentException e) {

			return new CarNull();
		}
	}

	@Override
	@SuppressWarnings("static-access")
	public Car updateValidadeCar(@Validated Long id, @Validated CarDTO carDTO) {

		try {

			if(carDTO instanceof CarDTO && id != 0) {
				
				Car car = new Car();
				
				BeanUtils.copyProperties(carDTO, car);
				car.setId(icarService.findId(id).get().getId()); // Keep the same ID for the update.
				
				return this.icarService.save(car);
				
			} else {
				
				return new Car().builder().car("object invalid").build();
			}
			

		} catch (IllegalArgumentException e) {

			return new CarNull();
			
		} catch (NullPointerException e) {
			
			return new CarNull();
		}
	}

	@Override
	public Car deleteValidadeCar(Long id) {

		try {
			
			Car car = new Car();
			
			car.setCar("Car Deleted");
			car.setStatus(false);
			
			this.icarService.deleteCar(id);
			
			return car;
			
		} catch (IllegalArgumentException e) {

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
