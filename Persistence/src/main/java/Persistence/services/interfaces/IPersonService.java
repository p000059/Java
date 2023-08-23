package Persistence.services.interfaces;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import Persistence.models.entities.Person;

public interface IPersonService {

	/**
	 * Search an Person object.
	 *
	 * @param id must not be {@literal null}.
	 * @return the Person object registered.
	 * @throws {@link PersonNull} if object are null.
	 */
	Person getPerson(Long id);
	
	/**
	 * Save an Person object.
	 *
	 * @param object Person must not be {@literal null}.
	 * @return the Person object registered.
	 * @throws {@link PersonNull} if object are null.
	 */
	Person save(Person person);
	
	/**
	 * Provide a list of Person.
	 *
	 * @return a list of registered people.
	 * @throws Collections.emptyList() if object are null.
	 */
	List<Person> listPerson();
	
	/**
	 * Provides a list of registered people.
	 * 
	 * @param pageable must not be {@literal null}.
	 * @return a list of registered person pages.
	 * @throws Page.empty if object are null.
	 */
	Page<Person> listPerson(Pageable pageable);
	
	/**
	 * Update an Person object.
	 *
	 * @param id must not be {@literal null}.
	 * @param object Person must not be {@literal null}.
	 * @return the Person object registered.
	 * @throws {@link PersonNull} if object are null.
	 */
	Person update(Long id, Person person);
	
	/**
	 * Delete an Person object.
	 *
	 * @param object Person must not be {@literal null}.
	 * @return the Person object deleted.
	 * @throws {@link PersonNull} if object are null.
	 */
	Person delete(Person person);
}
