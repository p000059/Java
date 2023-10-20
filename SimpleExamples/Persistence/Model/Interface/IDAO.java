package Persistence.Model.Interface;

import java.util.List;

public interface IDAO<T> {

	void create(T object);
	T read(int object);
	List<T> readAll();
	void update(T object);
	void delete(T object);
	int findMaxId();
	
}
