package collections.validations.interfaces;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import collections.DTO.entities.DriverDTO;
import collections.models.subclass.entities.Driver;

public interface IDriverValidation {

	/**
	 * Validates a {@link Driver} Object.
	 *
	 * @param {@link DriverDTO} must not be {@literal null}.
	 * @param status  must not be {@literal null}.
	 * @return the Driver object registered.
	 * @throws {@link DriverNull} if Driver and status are null.
	 */
	Driver validateDriver(DriverDTO driverDTO);

	/**
	 * Get pages from the {@link Driver} object.
	 *
	 * @param pageable must not be {@literal null}.
	 * @return registered Driver object pages.
	 * @throws {@link Page.empty()} if pageable is null.
	 */
	Page<Driver> getValidateDriver(Pageable pageable);

	/**
	 * Validates {@link Driver} object.
	 *
	 * @param id must not be {@literal null}.
	 * @return registered {@link Driver} object.
	 * @throws {@link DriverNull()} if id is null.
	 */
	Driver getValidateDriver(Long id);

	/**
	 * This method validates and updates an object of the {@link Driver} class, 
	 * using the properties of this same class, 
	 * which are the id and the name.
	 *
	 * @param id must not be {@literal null}.
	 * @param {@link DriverDTO} must not be {@literal null}.
	 * @return registered {@link Driver} object.
	 * @throws {@link DriverNull()} if id is null.
	 */
	Driver updateValidadeDriver(Long id, DriverDTO driverDTO);

	/**
	 * Delete {@link Driver} object.
	 *
	 * @param id must not be {@literal null}.
	 * @return the {@link Driver} object deleted.
	 * @throws {@link DriverNull()} if id is null.
	 */
	Driver deleteValidadeDriver(Long id);
	
	/**
	 * Delete {@link Driver} object.
	 *
	 * @param id must not be {@literal null}.
	 * @param {@link DriverDTO} must not be {@literal null}.
	 * @return the {@link Driver} object deleted.
	 * @throws {@link DriverNull()} if id is null.
	 */
	Driver deleteValidadeDriver(Long id, DriverDTO driverDTO);
}
