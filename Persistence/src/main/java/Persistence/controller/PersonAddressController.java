package Persistence.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Persistence.models.entities.Address;
import Persistence.models.entities.Person;
import Persistence.services.PersonAddressService;

@RequestMapping(value = "/api")
@RestController
@CrossOrigin(value = "*", maxAge = 3600)
public class PersonAddressController {

	@Autowired
	private PersonAddressService personAddressService;
	
	@PostMapping(value = "/savepersonaddress")
	public void savePersonAddress(@RequestBody Person person, Address address) {
		
		this.personAddressService.savePersonAddress(person, address);		
		
	}
}
