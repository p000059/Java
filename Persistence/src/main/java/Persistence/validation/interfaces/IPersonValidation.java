package Persistence.validation.interfaces;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import Persistence.DTO.PersonDTO;
import Persistence.models.entities.Person;

public interface IPersonValidation {

	/**
	 * Save a Person object.
	 * 
	 * @param person object must not be {@literal null}
	 * @return Returns an Person object.
	 * @throws PersonNull if if the specified element is null.
	 */
	Person save(PersonDTO personDTO);
	
	/**
	 * Returns a list with pagination.
	 * 
	 * @param pageable must not be {@literal null}
	 * @return Returns a list of pages.
	 * @throws List Null if if the @param is null.
	 */
	Page<Person> pages(Pageable pageable);
}
