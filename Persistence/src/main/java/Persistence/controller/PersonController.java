package Persistence.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Persistence.models.entities.Person;
import Persistence.services.PersonService;

@RequestMapping(value = "/api")
@RestController
@CrossOrigin(value = "*", maxAge = 3600)
public class PersonController {

	@Autowired
	private PersonService personService;
	
	@PostMapping(value = "/saveperson")
	public Person savePerson(@RequestBody Person person) {
		
		return personService.savePerson(person);
	}
	
	@GetMapping(value = "/getpersons")
	public List<Person> getPersons(){
		
		return personService.getPerson();
	}	
}
