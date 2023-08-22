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
	 * @throws {@link AddressNull} if address and status are null.
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

	/**
	 * Search address by Id.
	 * 
	 * @param id must not be {@literal null}
	 * @return Returns Address object.
	 * @throws {@link AddressNull} if id is null.
	 */
	Address searchAddressById(Long id);

	/**
	 * Search address by Id.
	 * 
	 * @param id must not be {@literal null}
	 * @param object Address not be {@literal null}
	 * @return Returns Address object.
	 * @throws {@link AddressNull} if id and address object is null.
	 */
	Address searchAddressById(Long id, Address address);

	/**
	 * Search address by Id.
	 * 
	 * @param id must not be {@literal null}
	 * @param string address not be {@literal null}
	 * @return Returns Address object.
	 * @throws {@link AddressNull} if id and string address is null.
	 */
	Address searchAddressById(Long id, String address);

	/**
	 * Search by object address.
	 * 
	 * @param object Address not be {@literal null}
	 * @return Returns Address object.
	 * @throws {@link AddressNull} if object is null.
	 */
	Address searchAddressByName(Address address);

	/**
	 * Search an Address object by string.
	 * 
	 * @param address string not be {@literal null}
	 * @return Returns Address object.
	 * @throws {@link AddressNull} if string is null.
	 */
	Address searchAddressByName(String address);

	/**
	 * Delete object address by id.
	 * 
	 * @param id must not be {@literal null}
	 * @return returns a confirmation of the operation.
	 * @throws {@link AddressNull} if id is null.
	 */
	Address deleteAddress(Long id);

	/**
	 * Delete object address by id.
	 * 
	 * @param id must not be {@literal null}
	 * @param object address must not be {@literal null}
	 * @return returns a confirmation of the operation.
	 * @throws {@link AddressNull} if id is null.
	 */
	Address deleteAddress(Long id, Address address);
	
	/**
	 * Update address object.
	 * 
	 * @param object Address must not be {@literal null}
	 * @return Returns the updated Address object.
	 * @throws {@link AddressNull} if address object is null.
	 */
	Address updateAddress(Address address);
	
	/**
	 * Update address by id and object.
	 * 
	 * @param id must not be {@literal null}
	 * @param object Address must not be {@literal null}
	 * @return Returns the updated Address object.
	 * @throws {@link AddressNull} if id and object is null.
	 */
	Address updateAddress(Long id, Address address);
}
