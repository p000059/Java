package collections.models.interfaces.validations;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import collections.DTO.CarListDTO;
import collections.models.subclass.entities.CarList;

public interface ICarListValidation {

	CarList validateCarList(CarListDTO carListDTO);
	List<CarList> getValidateCarLists();
	Page<CarList> getValidateCarLists(Pageable pageable);
	CarList getValidateCarList(Long id);
	CarList updateValidadeCarList(Long id, CarListDTO carListDTO);
	CarList deleteValidadeCarList(Long id);
}
