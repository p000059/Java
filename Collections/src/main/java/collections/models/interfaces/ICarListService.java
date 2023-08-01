package collections.models.interfaces;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import collections.models.subclass.entities.CarList;

public interface ICarListService {

	CarList save(CarList carList);

	Page<CarList> getCarLists(Pageable pageable);

	CarList updateCarList(CarList carList);

	Optional<CarList> findId(Long id);

	boolean verifyCarList(String carList);

	void deleteCarList(Long id);

}
