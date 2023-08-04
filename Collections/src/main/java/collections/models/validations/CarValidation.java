package collections.models.validations;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import collections.DTO.CarDTO;
import collections.models.interfaces.services.ICarService;
import collections.models.interfaces.validations.ICarListValidation;
import collections.models.subclass.entities.Car;
import collections.models.subclass.nullables.CarNull;

@Service
public class CarValidation implements ICarListValidation {

	@Autowired
	private ICarService iCarListService;

	@Override
	public Car validateCarList(@Validated CarDTO carListDTO) {

		Car carList = new Car();

		if (iCarListService.verifyCarList(carListDTO.getCar())) {

			return new CarNull();

		} else {

			BeanUtils.copyProperties(carListDTO, carList);
			return iCarListService.save(carList);
		}
	}

	@Override
	public List<Car> getValidateCarLists() {

		return iCarListService.getCarLists();
	}

	@Override
	public Page<Car> getValidateCarLists(Pageable pageable) {

		return iCarListService.getCarLists(pageable);
	}

	@Override
	public Car getValidateCarList(Long id) {

		Optional<Car> optionalCarList = iCarListService.findId(id);

		if (!optionalCarList.isPresent()) {

			return new CarNull();

		} else {

			return optionalCarList.get();
		}
	}

	@Override
	public Car updateValidadeCarList(Long id, @Validated CarDTO carListDTO) {

		Car carList = new Car();

		Optional<Car> carListOptional = iCarListService.findId(id);

		if (!carListOptional.isPresent()) {

			return new CarNull();

		} else {

			BeanUtils.copyProperties(carListDTO, carList);
			carList.setId(carListOptional.get().getId());

			return iCarListService.save(carList);
		}
	}

	@Override
	public Car deleteValidadeCarList(Long id) {

		Optional<Car> carListOptional = iCarListService.findId(id);

		if (!carListOptional.isPresent()) {

			return new CarNull();

		} else {

			Car carList = new Car();

			carList.setCar("Car Deleted");
			carList.setStatus(false);

			this.iCarListService.deleteCarList(id);
			return carList;

		}
	}
}
