package ic.service.interfaces;

import java.util.List;

import ic.model.Fuel;

public interface IfuelService {

	/**
	 * Save a Fuel object.
	 *
	 * @param Fuel must not be {@literal null}.
	 * @param status must not be {@literal null}.
	 * @return the Fuel object registered.
	 * @throws {@link FuelNull} if Fuel and status are null.
	 */
	Fuel insert(Fuel Fuel);
	
	/**
	 * List Fuel object.
	 *
	 * @param type must not be {@literal null}.
	 * @return a List Fuel object registered.
	 * @throws {@link FuelNull} if type are null.
	 */
	Iterable<Fuel> getFuelByType(String type);
	
	/**
	 * List Fuel.
	 * 
	 * @return a List Fuel object registered.
	 * @throws empty ArrayList<Fuel>.
	 */
	List<Fuel> listFuel();
}
