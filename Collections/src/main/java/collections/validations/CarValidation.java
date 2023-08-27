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
	
	@SuppressWarnings("static-access")
	CarNull invalidParameter = (CarNull) new CarNull().builder().car("invalid parameter").build(); 
	
	@SuppressWarnings("static-access")
	Car unvalidatedCar = new Car().builder().car("not validated").build();
	
	@Override
	public Car validateCar(@Validated CarDTO carDTO) {

		try {
			
			if (icarService.verifyCar(carDTO.getCar())) {
				
				return unvalidatedCar;
				
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
	
	public Car updateValidateCar(@Validated CarDTO carDTO) {
		
		try {
			
			Car objectCar = new Car();
			
			if(carDTO instanceof CarDTO && carDTO != null) {
				
				BeanUtils.copyProperties(carDTO, objectCar);
				
				return this.icarService.save(objectCar);
				
			} else {
				
				return unvalidatedCar;				
			}
			
			
		} catch (IllegalArgumentException e) {
			
			return invalidParameter;
			
		} catch (NullPointerException e) {
			
			return invalidParameter;
		}
	}

	@Override
	public Car updateValidadeCar(@Validated Long id, @Validated CarDTO carDTO) {

		try {

			if(carDTO instanceof CarDTO && id != 0) {
				
				Car car = new Car();
				
				BeanUtils.copyProperties(carDTO, car);
				car.setId(icarService.findId(id).get().getId()); // Keep the same ID for the update.
				
				return this.icarService.save(car);
				
			} else {
				
				return unvalidatedCar;
			}
			

		} catch (IllegalArgumentException e) {

			return invalidParameter;
			
		} catch (NullPointerException e) {
			
			return invalidParameter;
		}
	}

	@Override
	public Car deleteValidadeCar(Long id) {

		try {
			
			if(!(id == 0)) {
				
				Car car = new Car();
				
				car.setCar("Car Deleted");
				car.setStatus(false);
				
				this.icarService.deleteCar(id);
				
				return car;
			} else {
				
				return unvalidatedCar;
			}
			
			
		} catch (IllegalArgumentException e) {

			return invalidParameter;
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
