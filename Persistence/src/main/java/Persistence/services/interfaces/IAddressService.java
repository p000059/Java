package Persistence.services.interfaces;

import java.util.List;

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
	 * @throws {@link AddressNull} object if address and status are null.
	 */
	Address saveAddress(Address address);

	/**
	 * Get an object Address by ID.
	 *
	 * @param id must not be {@literal null}.
	 * @return the Address object registered.
	 * @throws {@link AddressNull} object if id is null.
	 */
	Address getAddress(Long id);
	
	/**
	 * Gets a list of address objects.
	 * 
	 * @return Returns a list of Address.
	 */
	List<Address> getAddresses();

	Address searchAddressById(Long id);

	Address searchAddressById(Long id, Address address);

	Address searchAddressById(Long id, String address);

	Address searchAddressByName(Address address);

	Address searchAddressByName(String address);

	Address deleteAddress(Long id);

	Address deleteAddress(Long id, Address address);

	/**
	 * Update address object.
	 * 
	 * @param id must not be {@literal null}
	 * @param address must not be {@literal null}
	 * @param status must not be {@literal null}
	 * @return Returns the updated Address object.
	 * @throws {@link AddressNull} object if id is null.
	 */
	Address updateAddress(Address address);
}
