package Persistence.validation.interfaces;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import Persistence.DTO.AddressDTO;
import Persistence.models.entities.Address;

public interface IAddressValidation {

	/**
	 * Search a Address object by id.
	 * 
	 * @param id must not be {@literal null}
	 * @return an Address object.
	 * @throws {@link AddressNull} if id is null.
	 */
	Address getAddress(Long id);
	
	/**
	 * Search a Address object.
	 * 
	 * @param Address object must not be {@literal null}
	 * @return an Address object.
	 * @throws {@link AddressNull} if id is null.
	 */
	Address getAddress(Address address);
	
	/**
	 * Save a Address object.
	 * 
	 * @param Address object must not be {@literal null}
	 * @return Returns an Address object.
	 * @throws {@link AddressNull} if the specified element is null.
	 */
	Address save(AddressDTO addressDTO);
	
	/**
	 * update a Address object.
	 * 
	 * @param Address object must not be {@literal null}
	 * @return Returns an Address object updated.
	 * @throws {@link AddressNull} if object is null.
	 */
	Address update(AddressDTO addressDTO);
	
	/**
	 * Returns a list with pagination.
	 * 
	 * @param pageable must not be {@literal null}
	 * @return Returns a list of pages.
	 * @throws {@link Page.empty()} if the @param is null.
	 */
	Page<Address> pages(Pageable pageable);
	
	/**
	 * Delete a object Address.
	 * 
	 * @param id must not be {@literal null}
	 * @param AddressDTO must not be {@literal null}
	 * @return an Address object.
	 * @throws {@link AddressNull} if the operation receives a null object.
	 */
	Address delete(Long id, AddressDTO addressDTO);
}
