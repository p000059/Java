package collections.validations;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import collections.DTO.CarListDTO;
import collections.models.interfaces.services.ICarListService;
import collections.models.interfaces.validations.ICarListValidation;
import collections.models.subclass.entities.CarList;
import collections.models.subclass.nullables.CarListNull;

@Service
public class CarListValidation implements ICarListValidation {

	@Autowired
	private ICarListService iCarListService;

	@Override
	public CarList validateCarList(@Validated CarListDTO carListDTO) {

		CarList carList = new CarList();

		if (iCarListService.verifyCarList(carListDTO.getCar())) {

			return new CarListNull();

		} else {

			BeanUtils.copyProperties(carListDTO, carList);
			return iCarListService.save(carList);
		}
	}

	@Override
	public List<CarList> getValidateCarLists() {

		return iCarListService.getCarLists();
	}

	@Override
	public Page<CarList> getValidateCarLists(Pageable pageable) {

		return iCarListService.getCarLists(pageable);
	}

	@Override
	public CarList getValidateCarList(Long id) {

		Optional<CarList> optionalCarList = iCarListService.findId(id);

		if (!optionalCarList.isPresent()) {

			return new CarListNull();

		} else {

			return optionalCarList.get();
		}
	}

	@Override
	public CarList updateValidadeCarList(Long id, @Validated CarListDTO carListDTO) {

		CarList carList = new CarList();

		Optional<CarList> carListOptional = iCarListService.findId(id);

		if (!carListOptional.isPresent()) {

			return new CarListNull();

		} else {

			BeanUtils.copyProperties(carListDTO, carList);
			carList.setId(carListOptional.get().getId()); //Keeps the same ID.

			return iCarListService.save(carList);
		}
	}

	@Override
	public CarList deleteValidadeCarList(Long id) {

		Optional<CarList> carListOptional = iCarListService.findId(id);

		if (!carListOptional.isPresent()) {

			return new CarListNull();

		} else {

			CarList carList = new CarList();

			carList.setCar("Car Deleted");
			carList.setStatus(false);

			this.iCarListService.deleteCarList(id);
			return carList;

		}
	}
}
