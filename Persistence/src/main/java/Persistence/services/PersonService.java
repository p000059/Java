package Persistence.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Persistence.models.entities.Person;
import Persistence.repositories.PersonRepository;
import jakarta.transaction.Transactional;

@Service
public class PersonService {

	@Autowired
	private PersonRepository personRepository;
	
	@Transactional
	public Person savePerson(Person person) {
		
		return personRepository.save(person);
	}
	
	public List<Person> getPerson(){
		
		return personRepository.findAll();
	}
}
