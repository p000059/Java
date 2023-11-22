package ic.validations;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ic.interfaces.repository.PartRepository;
import ic.interfaces.services.IpartService;
import ic.interfaces.validations.IpartValidation;
import ic.model.DTO.PartDTO;
import ic.model.classnull.PartNull;
import ic.model.entity.Part;

@Service
public class PartValidation implements IpartValidation {

	@Autowired
	private IpartService ipartService;

	@Autowired
	private PartRepository partRepository;
	
	private Part searchPart(Part part) {

		return this.partRepository.findById(part.getId()).get();
	}

	private Part convertDTOtoObject(PartDTO partDTO) {
		
		Part objectPart = new Part();
		
		BeanUtils.copyProperties(partDTO, objectPart);
		
		return objectPart;
	}
	
	@SuppressWarnings("unused")
	private PartDTO convertObjecttoDTO(Part part) {
		
		PartDTO partDTO = new PartDTO();
		
		BeanUtils.copyProperties(part, partDTO);
		
		return partDTO;
	}
	
	@Override
	@SuppressWarnings("static-access")
	public Part insert(PartDTO partDTO) {
		
		try {

			Part objectPart = this.convertDTOtoObject(partDTO);
			
			if ((objectPart instanceof Part) && (this.searchPart(objectPart).getCode() != objectPart.getCode())) {

				return this.ipartService.insert(objectPart);

			} else {

				return new PartNull().builder().code("non-existent registration").build();
			}

		} catch (Exception e) {

			return new Part().builder().description(e.getMessage()).build();
		}
	}

	@Override
	@SuppressWarnings("static-access")
	public Part update(PartDTO partDTO) {
		try {
			
			Part objectPart = this.convertDTOtoObject(partDTO);

			if ((objectPart instanceof Part) && (objectPart.getId() == this.searchPart(objectPart).getId())) {

				return this.partRepository.searchByCode(objectPart.getCode());				

			} else if(objectPart.getId() == null) {

				return new PartNull().builder().code("id null").build();
				
			} else {
				
				return new PartNull().builder().code("non-existing record").build();
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
	public Part delete(PartDTO partDTO) {
		
		try {

			Part objectPart = this.convertDTOtoObject(partDTO);
			
			if ((objectPart instanceof Part) && (objectPart.getId() == this.searchPart(objectPart).getId())) {

				this.partRepository.delete(objectPart);

				return this.partRepository.findById(objectPart.getId()).get();

			} else {

				return new PartNull().builder().code("non-existent registration").build();
			}

		} catch (Exception e) {

			return new Part().builder().description(e.getLocalizedMessage()).build();
		}
	}

	@Override
	@SuppressWarnings("static-access")
	public List<Part> listParts(String name) {
		
		try {
			
			return this.ipartService.listParts(name.trim().toUpperCase());
			
		} catch (Exception e) {
			
			Part objectPart = new Part().builder().code(e.getLocalizedMessage()).build();
			
			List<Part> listPart = new ArrayList<>();
			
			listPart.add(objectPart);
			
			return listPart;
		}
	}

}
