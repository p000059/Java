package ss.validation;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import ss.DTO.NaturalPersonDTO;
import ss.models.subclass.entity.NaturalPerson;
import ss.models.subclass.nullable.NaturalPersonNull;
import ss.services.NaturalPersonService;

@Service
public class NaturalPersonValidation {

	@Autowired
	private NaturalPersonService naturalPersonService;
	
	public NaturalPerson validateNaturalPerson(@Validated NaturalPersonDTO naturalPersonDTO) {
		
		NaturalPerson naturalPerson = new NaturalPerson();
		
		if(naturalPersonService.verifyName(naturalPersonDTO.getName())) {
			
			return new NaturalPersonNull();
			
		} else {
			
			BeanUtils.copyProperties(naturalPersonDTO, naturalPerson);
			
			return naturalPersonService.save(naturalPerson);
		}
	}
}
