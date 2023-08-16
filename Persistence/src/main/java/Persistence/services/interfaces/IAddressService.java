package Persistence.services.interfaces;

import Persistence.models.entities.Address;

public interface IAddressService {

	boolean existAddressObject(Address address);

	boolean existAddressObjec(String address);

	/**
	 * Save an Address object.
	 *
	 * @param address must not be {@literal null}.
	 * @param status must not be {@literal null}.
	 * @return the Address object registered.
	 * @throws AddressNull() object if address and status are null.
	 */
	Address saveAddress(Address address);

	Address getAddress(Long id);

	Address searchAddressById(Long id);

	Address searchAddressById(Long id, Address address);

	Address searchAddressById(Long id, String address);

	Address searchAddressByName(Address address);

	Address searchAddressByName(String address);

	Address deleteAddress(Long id);

	Address deleteAddress(Long id, Address address);
}
