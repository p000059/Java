package collections.models.interfaces.services;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;

public interface IObjectService<T> {

	T save(T object);

	List<T> getObject();
	
	Page<T> getObject(T object);	

	T updateObject(T object);

	Optional<T> searchObjectId(Long id);

	T verifyObject(T carList);

	void deleteObject(Long id);
}
