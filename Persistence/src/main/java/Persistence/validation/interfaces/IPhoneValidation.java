package Persistence.validation.interfaces;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import Persistence.DTO.PhoneDTO;
import Persistence.models.entities.Phone;

public interface IPhoneValidation {

	/**
	 * Search a Phone object by id.
	 * 
	 * @param id must not be {@literal null}
	 * @return an Phone object.
	 * @throws PhoneNull if id is null.
	 */
	Phone getPhone(Long id);
	
	/**
	 * Search a Phone object.
	 * 
	 * @param Phone object must not be {@literal null}
	 * @return an Phone object.
	 * @throws PhoneNull if id is null.
	 */
	Phone getPhone(Phone phone);
	
	/**
	 * Save a Phone object.
	 * 
	 * @param Phone object must not be {@literal null}
	 * @return Returns an Phone object.
	 * @throws PhoneNull if the specified element is null.
	 */
	Phone save(PhoneDTO phoneDTO);
	
	/**
	 * update a Phone object.
	 * 
	 * @param Phone object must not be {@literal null}
	 * @return Returns an Phone object updated.
	 * @throws PhoneNull if object is null.
	 */
	Phone update(PhoneDTO phoneDTO);
	
	/**
	 * Returns a list with pagination.
	 * 
	 * @param pageable must not be {@literal null}
	 * @return Returns a list of pages.
	 * @throws List Null if the @param is null.
	 */
	Page<Phone> pages(Pageable pageable);
	
	/**
	 * Delete a object Phone.
	 * 
	 * @param PhoneDTO must not be {@literal null}
	 * @return an Phone object.
	 * @throws PhoneNull if the operation receives a null object.
	 */
	Phone delete(PhoneDTO phoneDTO);
}
