package ic.service.interfaces;

import ic.model.Tax;

public interface ItaxService {

	/**
	 * Save a Car object.
	 *
	 * @param car must not be {@literal null}.
	 * @param status must not be {@literal null}.
	 * @return the Car object registered.
	 * @throws {@link CarNull} if car and status are null.
	 */
	Tax insert(Tax car);
	
	/**
	 * List Car object.
	 *
	 * @param nameCar must not be {@literal null}.
	 * @return a List Car object registered.
	 * @throws {@link CarNull} if nameCar are null.
	 */
	Iterable<Tax> getTaxByType(String type);
}
