package ic.validation;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ic.interfaces.service.IcarService;
import ic.interfaces.validation.IcarValidation;
import ic.model.dto.CarDTO;
import ic.model.entity.Car;
import ic.model.entity.Tax;
import ic.model.nullable.CarNull;

@Service
public class ValidationCar implements IcarValidation {

	@Autowired
	private IcarService icarService;

	private Car convertToCarObject(CarDTO carDTO) {

		Car objectCar = new Car();

		Tax objectTax = new Tax();

		BeanUtils.copyProperties(carDTO.getTax(), objectTax);

		BeanUtils.copyProperties(carDTO, objectCar);

		objectCar.setTax(objectTax);
		
		return objectCar;
	}

	@SuppressWarnings("static-access")
	@Override
	public Car validateInsertion(CarDTO carDTO) {

		try {

			Car objectCar = this.convertToCarObject(carDTO);

			Boolean registeredCar = this.icarService.findCar(objectCar) == objectCar ? true : false;

			if (objectCar instanceof Car && (registeredCar == false) && ((objectCar.getName() != null))
					&& (objectCar.getStatus() != null)) {

				return this.icarService.insert(objectCar);

			} else {

				return new CarNull();
			}

		} catch (IllegalArgumentException e) {

			return new CarNull().builder().name("Illegal Argument").build();

		} catch (NullPointerException e) {

			return new CarNull().builder().name("object null").build();

		}
	}

}
