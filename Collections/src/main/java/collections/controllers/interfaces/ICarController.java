package collections.controllers.interfaces;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import collections.DTO.entities.CarDTO;
import collections.models.subclass.entities.Car;

public interface ICarController {

	/**
	 * Method of showing pages of Car objects.
	 *
	 * @param {@Pageagle} interface must not be {@literal null}.
	 * @return page of Cars.
	 * @throws {@link Page.empty()} if pageable is null.
	 */
	ResponseEntity<Page<Car>> readCar(
			@PageableDefault(page = 0, size = 10, sort = "id", direction = Direction.DESC) Pageable pageable);

	/**
	 * Method of save Car objects.
	 *
	 * @param {@CarDTO} must not be {@literal null}.
	 * @return Car object.
	 * @throws Message "object invalid".
	 */
	ResponseEntity<Car> saveCar(@RequestBody CarDTO carDTO);

	/**
	 * Method of update Car objects.
	 *
	 * @param id must not be {@literal null}.
	 * @param {@CarDTO} must not be {@literal null}.
	 * @return Car object.
	 * @throws Message "object invalid".
	 */
	ResponseEntity<Car> updateCar(@PathVariable(value = "id") Long id, @RequestBody CarDTO carDTO);

	/**
	 * Method of delete Car objects.
	 *
	 * @param id must not be {@literal null}.
	 * @param {@CarDTO} must not be {@literal null}.
	 * @return Operation Confirmation.
	 * @throws Message "object invalid".
	 */
	ResponseEntity<Car> deleteCar(@PathVariable(value = "id") Long id, @RequestBody CarDTO carDto);
}
