package Persistence.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
	public ResponseEntity<PersonAddress> savePersonAddress(@RequestBody Person person, Address address) {
		
		return ResponseEntity.status(HttpStatus.OK).body(this.personAddressService.savePersonAddress(person, address));			
	}
}
