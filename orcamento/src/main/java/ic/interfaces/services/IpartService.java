package ic.interfaces.services;

import java.util.List;

import ic.model.entity.Part;

public interface IpartService {

	Part insert(Part part);
	
	Part update(Part part);
	
	List<Part> listParts();
	
	void delete(Part part);
	
	List<Part> listParts(String part);
}
