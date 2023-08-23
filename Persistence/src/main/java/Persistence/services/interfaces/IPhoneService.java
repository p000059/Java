package Persistence.services.interfaces;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import Persistence.models.entities.Phone;

public interface IPhoneService {

	/**
	 * Search an Phone object.
	 *
	 * @param id must not be {@literal null}.
	 * @return the Phone object registered.
	 * @throws {@link PhoneNull} if object are null.
	 */
	Phone getPhone(Long id);
	
	/**
	 * Save an Phone object.
	 *
	 * @param object Phone must not be {@literal null}.
	 * @return the Phone object registered.
	 * @throws {@link PhoneNull} if object are null.
	 */
	Phone save(Phone Phone);
	
	/**
	 * Provide a list of Phone.
	 *
	 * @return a list of registered people.
	 * @throws Collections.emptyList() if object are null.
	 */
	List<Phone> listPhone();
	
	/**
	 * Provides a list of registered people.
	 * 
	 * @param pageable must not be {@literal null}.
	 * @return a list of registered Phone pages.
	 * @throws Page.empty if object are null.
	 */
	Page<Phone> listPhone(Pageable pageable);
	
	/**
	 * Update an Phone object.
	 *
	 * @param id must not be {@literal null}.
	 * @param object Phone must not be {@literal null}.
	 * @return the Phone object registered.
	 * @throws {@link PhoneNull} if object are null.
	 */
	Phone update(Long id, Phone Phone);
	
	/**
	 * Delete an Phone object.
	 *
	 * @param object Phone must not be {@literal null}.
	 * @return the Phone object deleted.
	 * @throws {@link PhoneNull} if object are null.
	 */
	Phone delete(Phone Phone);
}
