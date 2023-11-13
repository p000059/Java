package ic.validation;

import java.util.ArrayList;
import java.util.List;

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

	@SuppressWarnings({ "static-access" })
	private Car exceptionMessage(Exception exception) {

		if (exception instanceof IllegalArgumentException) {

			return new CarNull().builder().name(exception.getMessage()).build();

		} else if (exception instanceof NullPointerException) {

			return new CarNull().builder().name(exception.getMessage()).build();

		} else if (exception instanceof Exception) {

			return new CarNull().builder().name(exception.getMessage()).build();

		} else {

			return new CarNull();
		}
	}

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

		} catch (Exception e) {

			return this.exceptionMessage(e);

		} 
	}

	@Override
	public List<Car> validateInsertions(List<CarDTO> listCarDTO) {

		try {

			List<Car> listCar = new ArrayList<Car>();

			for (int i = 0; i < listCarDTO.size(); i++) {

				listCar.add(this.convertToCarObject(listCarDTO.get(i)));
			}

			return this.icarService.insertCars(listCar);

		} catch (Exception e) {

			return new ArrayList<Car>();

		} 
	}

	@Override
	public Car readCar(CarDTO carDTO) {

		try {

			return this.icarService.findCar(this.convertToCarObject(carDTO));

		} catch (Exception e) {

			return this.exceptionMessage(e);
		}
	}

	@Override
	public Car deleteCar(CarDTO carDTO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Car validateCarUpdate(CarDTO carDTO) {

		try {

			Car objectCar = this.icarService.findCar(this.convertToCarObject(carDTO));

			if ((objectCar.getId() == carDTO.getId()) && (objectCar instanceof Car)
					&& (objectCar.getTax() instanceof Tax)) {

				return this.icarService.updateCar(objectCar);

			} else {

				return new CarNull();
			}

		} catch (Exception e) {

			return this.exceptionMessage(e);
		}
	}

}
