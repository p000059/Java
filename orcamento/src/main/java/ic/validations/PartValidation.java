package ic.validations;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ic.interfaces.repository.PartRepository;
import ic.interfaces.services.IpartService;
import ic.interfaces.validations.IpartValidation;
import ic.model.classnull.PartNull;
import ic.model.entity.Part;

@Service
public class PartValidation implements IpartValidation {

	@Autowired
	private IpartService ipartService;

	private PartRepository partRepository;
	
	private Part searchPart(Part part) {

		return this.partRepository.findById(part.getId()).get();
	}

	@Override
	@SuppressWarnings("static-access")
	public Part insert(Part part) {
		
		try {

			if ((part instanceof Part) && (this.searchPart(part).getCode() != part.getCode())) {

				return this.ipartService.insert(part);

			} else {

				return new PartNull().builder().code("non-existent registration").build();
			}

		} catch (Exception e) {

			return new Part().builder().description(e.getMessage()).build();
		}
	}

	@Override
	@SuppressWarnings("static-access")
	public Part update(Part part) {
		try {

			if ((part instanceof Part) && (part.getId() == this.searchPart(part).getId())) {

				return this.partRepository.searchByCode(part.getCode());				

			} else {

				return new PartNull().builder().code("non-existent registration").build();
			}

		} catch (Exception e) {

			return new Part().builder().description(e.getLocalizedMessage()).build();
		}
	}

	@Override
	public List<Part> listParts() {
		
		try {
			
			return this.ipartService.listParts();
			
		} catch (Exception e) {
			
			return new ArrayList<Part>();
		}
	}

	@Override
	@SuppressWarnings("static-access")
	public Part delete(Part part) {
		
		try {

			if ((part instanceof Part) && (part.getId() == this.searchPart(part).getId())) {

				this.partRepository.delete(part);

				return this.partRepository.findById(part.getId()).get();

			} else {

				return new PartNull().builder().code("non-existent registration").build();
			}

		} catch (Exception e) {

			return new Part().builder().description(e.getLocalizedMessage()).build();
		}
	}

}
