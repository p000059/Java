package Persistence.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Persistence.DTO.PersonDTO;
import Persistence.models.entities.Person;
import Persistence.validation.interfaces.IPersonValidation;

@RequestMapping(value = "/api")
@RestController
@CrossOrigin(value = "*", maxAge = 3600)
public class PersonController {

	@Autowired
	private IPersonValidation iPersonValidation;
	
	@PostMapping(value = "/savePerson")
	public ResponseEntity<Person> savePerson(@RequestBody PersonDTO personDTO){
		
		return ResponseEntity.status(HttpStatus.CREATED).body(this.iPersonValidation.save(personDTO));
	}
	
	@GetMapping(value = "/getPersons")
	public ResponseEntity<Page<Person>> getPersons(@PageableDefault(page = 0, size = 10, sort = "id", direction = Direction.DESC) Pageable pageable){
		
		return ResponseEntity.status(HttpStatus.FOUND).body(this.iPersonValidation.pages(pageable));		
	}
	
	@GetMapping(value = "getPerson")
	public ResponseEntity<Person> getPerson(@RequestBody Person person){
		
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(this.iPersonValidation.getPerson(person));
	}
	
	@PutMapping(value = "/updatePersons")
	public ResponseEntity<Person> updatePerson(@RequestBody PersonDTO personDTO){
		
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(this.iPersonValidation.update(personDTO));
	}
	
	@DeleteMapping(value = "/deletePersons")
	public ResponseEntity<Person> deletePerson(@RequestBody PersonDTO personDTO){
		
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(this.iPersonValidation.delete(personDTO));
	}
}
