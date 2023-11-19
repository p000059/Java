package ic.interfaces.validations;

import java.util.List;

import ic.model.DTO.PartDTO;
import ic.model.entity.Part;

public interface IpartValidation {

	Part insert(PartDTO partDTO);
	
	Part update(Part part);
	
	List<Part> listParts();
	
	Part delete(Part part);
}
