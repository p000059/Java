package Persistence.validation.interfaces;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import Persistence.DTO.PersonDTO;
import Persistence.models.entities.Person;

public interface IPersonValidation {

	/**
	 * Search a Person object by id.
	 * 
	 * @param id must not be {@literal null}
	 * @return an Person object.
	 * @throws PersonNull if id is null.
	 */
	Person getPerson(Long id);
	
	/**
	 * Search a Person object.
	 * 
	 * @param person object must not be {@literal null}
	 * @return an Person object.
	 * @throws PersonNull if id is null.
	 */
	Person getPerson(Person person);
	
	/**
	 * Save a Person object.
	 * 
	 * @param person object must not be {@literal null}
	 * @return Returns an Person object.
	 * @throws PersonNull if the specified element is null.
	 */
	Person save(PersonDTO personDTO);
	
	/**
	 * update a Person object.
	 * 
	 * @param person object must not be {@literal null}
	 * @return Returns an Person object updated.
	 * @throws PersonNull if object is null.
	 */
	Person update(PersonDTO personDTO);
	
	/**
	 * Returns a list with pagination.
	 * 
	 * @param pageable must not be {@literal null}
	 * @return Returns a list of pages.
	 * @throws List Null if the @param is null.
	 */
	Page<Person> pages(Pageable pageable);
	
	/**
	 * Delete a object person.
	 * 
	 * @param personDTO must not be {@literal null}
	 * @return an person object.
	 * @throws PersonNull if the operation receives a null object.
	 */
	Person delete(PersonDTO personDTO);
}
