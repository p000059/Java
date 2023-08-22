package Persistence.validation;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import Persistence.DTO.PersonDTO;
import Persistence.models.classnull.PersonNull;
import Persistence.models.entities.Person;
import Persistence.services.interfaces.IPersonService;
import Persistence.validation.interfaces.IPersonValidation;

@Service
public class PersonValidation implements IPersonValidation {
	
	@Autowired
	private IPersonService iPersonService; 
	
	@Override
	public Person save(@Validated PersonDTO personDTO) {
		
		try {
			
			Person objectPerson = new Person();
			
			BeanUtils.copyProperties(personDTO, objectPerson);
			
			return this.iPersonService.save(objectPerson);
			
		} catch (IllegalArgumentException e) {
			
			return new PersonNull();			
		}		
	}

	@Override
	public Page<Person> pages(@Validated Pageable pageable) {
		
		try {
			
			return this.iPersonService.listPerson(pageable);
			
		} catch (NullPointerException e) {
			
			return Page.empty();
		}
	}
	

}
