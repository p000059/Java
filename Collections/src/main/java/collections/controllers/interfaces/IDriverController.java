package collections.controllers.interfaces;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import collections.DTO.entities.DriverDTO;
import collections.models.subclass.entities.Driver;

public interface IDriverController {

	/**
	 * Method of showing pages of Driver objects..
	 *
	 * @param {@Pageagle} interface must not be {@literal null}.
	 * @return page of Drivers.
	 * @throws {@link Page.empty()} if pageable is null.
	 */
	ResponseEntity<Page<Driver>> readDriver(
			@PageableDefault(page = 0, size = 10, sort = "id", direction = Direction.DESC) Pageable pageable);

	/**
	 * Method of save Driver objects.
	 *
	 * @param {@DriverDTO} must not be {@literal null}.
	 * @return Driver object.
	 * @throws Message "object invalid".
	 */
	ResponseEntity<Driver> saveDriver(@RequestBody DriverDTO driverDTO);

	/**
	 * Method of update Driver objects.
	 *
	 * @param id           must not be {@literal null}.
	 * @param {@DriverDTO} must not be {@literal null}.
	 * @return Driver object.
	 * @throws Message "object invalid".
	 */
	ResponseEntity<Driver> updateDriver(@PathVariable(value = "id") Long id, @RequestBody DriverDTO driverDTO);

	/**
	 * Method of delete Driver objects.
	 *
	 * @param id           must not be {@literal null}.
	 * @param {@DriverDTO} must not be {@literal null}.
	 * @return Operation Confirmation.
	 * @throws Message "object invalid".
	 */
	ResponseEntity<Driver> deleteDriver(@PathVariable(value = "id") Long id, @RequestBody DriverDTO driverDto);
}
