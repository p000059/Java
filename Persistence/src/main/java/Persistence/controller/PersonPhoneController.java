package Persistence.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Persistence.DTO.PersonPhoneDTO;
import Persistence.models.entities.Person;
import Persistence.models.entities.Phone;
import Persistence.models.intermediate.PersonPhone;
import Persistence.services.PersonPhoneService;

@RequestMapping(value = "/")
@RestController
@CrossOrigin(value = "*", maxAge = 3600)
public class PersonPhoneController {

	@Autowired
	private PersonPhoneService personPhoneService;	
	
	@PostMapping(value = "savepersonphone")
	public ResponseEntity<PersonPhone> savePersonPhone(@RequestBody Map<String, Object> requestData){
		
		@SuppressWarnings("unchecked")
		Map<String, Object> personData = (Map<String, Object>) requestData.get("person");
		
		Person person = new Person();
		person.setName((String) personData.get("name"));
		person.setStatus((Boolean) personData.get("status"));
		
		@SuppressWarnings("unchecked")
		Map<String, Object> phoneData = (Map<String, Object>) requestData.get("phone");
		
		Phone phone = new Phone();
		phone.setNumber((String) phoneData.get("number"));
		phone.setStatus((Boolean) phoneData.get("status"));
		
		return ResponseEntity.status(HttpStatus.OK).body(this.personPhoneService.savePersonPhone(person, phone));
	}
	
	@PostMapping(value = "savepersonphonedto")
	public ResponseEntity<PersonPhone> savePersonPhoneDTO(@RequestBody PersonPhoneDTO personPhoneDTO){
		
		Person person = new Person();
		person.setName(personPhoneDTO.getPerson().getName());
		person.setStatus(personPhoneDTO.getPerson().isStatus());
		
		Phone phone = new Phone();
		phone.setNumber(personPhoneDTO.getPhone().getNumber());
		phone.setStatus(personPhoneDTO.getPhone().getStatus());
		
		return ResponseEntity.status(HttpStatus.OK).body(this.personPhoneService.savePersonPhone(person, phone));
	}
}
