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

import Persistence.DTO.PersonAddressDTO;
import Persistence.models.entities.Address;
import Persistence.models.entities.Person;
import Persistence.models.intermediate.PersonAddress;
import Persistence.services.PersonAddressService;

@RequestMapping(value = "/api")
@RestController
@CrossOrigin(value = "*", maxAge = 3600)
public class PersonAddressController {

	@Autowired
	private PersonAddressService personAddressService;
	
	@PostMapping(value = "/savepersonaddress")
	public ResponseEntity<PersonAddress> savePersonAddress(@RequestBody Map<String, Object> requestData) {

		@SuppressWarnings("unchecked")
		Map<String, Object> personData = (Map<String, Object>) requestData.get("person");
		
		Person person = new Person();
		person.setName((String) personData.get("name"));
		person.setStatus((Boolean) personData.get("status"));

		@SuppressWarnings("unchecked")
		Map<String, Object> addressData = (Map<String, Object>) requestData.get("address");

		Address address = new Address();
		address.setAddress((String) addressData.get("address"));
		address.setStatus((Boolean) addressData.get("status"));

		return ResponseEntity.status(HttpStatus.OK).body(this.personAddressService.savePersonAddress(person, address));
	}

	@PostMapping(value = "/savepersonaddressdto")
	public ResponseEntity<PersonAddress> savePersonAddressDTO(@RequestBody PersonAddressDTO personAddressDTO){
		
		Person person = new Person();
		person.setName(personAddressDTO.getPerson().getName());
		person.setStatus(personAddressDTO.getPerson().getStatus());
		
		Address address = new Address();
		address.setAddress(personAddressDTO.getAddress().getAddress());
		address.setStatus(personAddressDTO.getAddress().getStatus());
		
		return ResponseEntity.status(HttpStatus.OK).body(this.personAddressService.savePersonAddress(person, address));
	}
}
