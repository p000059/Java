package collections.services.interfaces;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import collections.models.subclass.entities.Driver;

public interface IDriverService {

	/**
	 * Save an Driver object.
	 *
	 * @param name must not be {@literal null}.
	 * @param status  must not be {@literal null}.
	 * @return the {@link Driver} object registered.
	 * @throws {@link DriverNull} if name and status are null.
	 */
	Driver save(Driver driver);
	
	/**
	 * Get pages of the {@link Driver} object.
	 *
	 * @param pageable must not be {@literal null}.
	 * @return the {@link Page<Driver>}.
	 * @throws {@link Page.empyt} if pageable is null.
	 */
	Page<Driver> getDrivers(Pageable pageable);
	
	/**
	 * Get registered {@link Driver} object.
	 *
	 * @param id must not be {@literal null}.
	 * @return the {@link Driver}.
	 * @throws {@link DriverNull} if id is null.
	 */
	Driver getDriver(Long id);

	/**
	 * Get registered {@link Driver} object.
	 *
	 * @param name must not be {@literal null}.
	 * @return the {@link Driver}.
	 * @throws {@link DriverNull} if name is null.
	 */
	Driver getDriver(String name);
	
	/**
	 * Get registered {@link Driver} object querying by id and name property.
	 *
	 * @param id must not be {@literal null}
	 * @param {@link Driver} object must not be {@literal null}.
	 * @return the {@link Driver}.
	 * @throws {@link DriverNull} if id and {@link Driver} object is null.
	 */
	Driver updateDriver(Long id, Driver driver);
	
	/**
	 * Get registered {@link Driver} object querying by name property.
	 *
	 * @param {@link Driver} object must not be {@literal null}.
	 * @return the {@link Driver}.
	 * @throws {@link DriverNull} if {@link Driver} is null.
	 */
	Driver updateDriver(Driver driver);

	/**
	 * Verify if exist {@link Driver}.
	 *
	 * @param id must not be {@literal null}.
	 * @return a {@link Optional<Driver>} object.
	 * @throws a Optional.Empty if id is null.
	 */
	Optional<Driver> findId(Long id);

	/**
	 * Verify if exist {@link Driver}.
	 *
	 * @param string driver must not be {@literal null}.
	 * @return true or false.
	 */
	boolean verifyDriver(String driver);

	/**
	 * Delete {@link Driver} object by id property.
	 *
	 * @param id must not be {@literal null}.
	 * @return the {@link Driver} deleted.
	 * @throws {@link DriverNull} if id is null.
	 */
	Driver deleteDriver(Long id);
	
	/**
	 * Delete {@link Driver} querying by id and name property.
	 *
	 * @param id must not be {@literal null}.
	 * @param name object not be {@literal null}.
	 * @return Deleted object message.
	 * @throws {@link DriverNull} if id and name are null.
	 */
	Driver deleteDriver(Long id, String name);
	
	/**
	 * Delete {@link Driver} querying by id and name property.
	 *
	 * @param id must not be {@literal null}.
	 * @param {@link Driver} object not be {@literal null}.
	 * @return Deleted object message.
	 * @throws {@link DriverNull} if id and name are null.
	 */
	Driver deleteDriver(Long id, Driver driver);
}
