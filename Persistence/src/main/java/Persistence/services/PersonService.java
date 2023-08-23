package Persistence.services;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import Persistence.models.classnull.PersonNull;
import Persistence.models.entities.Person;
import Persistence.repositories.PersonRepository;
import Persistence.services.interfaces.IPersonService;
import jakarta.transaction.Transactional;

@Service
public class PersonService implements IPersonService {

	@Autowired
	private PersonRepository personRepository;
	
	@Override
	@SuppressWarnings("static-access")
	public Person getPerson(Long id) {

		try {

			return id == 0 ? new Person().builder().name("not found").build()
					: this.personRepository.queryPersonById(id);

		} catch (IllegalArgumentException e) {

			return new PersonNull();
		}
	}

	@SuppressWarnings("static-access")
	public Person getPerson(String name) {

		try {

			return personRepository.existsByName(name) ? this.personRepository.queryPersonByName(name)
					: new Person().builder().name("not found").build();

		} catch (IllegalArgumentException e) {
			
			return new PersonNull();
		}
	}

	@Override
	public List<Person> listPerson() {

		try {

			return this.personRepository.findAll();

		} catch (NullPointerException e) {

			return Collections.emptyList();
		}
	}

	@Override
	public Page<Person> listPerson(Pageable pageable) {

		try {

			return this.personRepository.findAll(pageable);

		} catch (IllegalArgumentException e) {

			return Page.empty();
		}
	}

	@Override
	@Transactional
	@SuppressWarnings("static-access")
	public Person save(Person person) {

		try {

			return person.equals(null) ? new Person().builder().name("invalid object, check data").build()
					: this.personRepository.save(person);

		} catch (Exception e) {

			return new PersonNull();
		}
	}

	@Override
	@Transactional
	@SuppressWarnings("static-access")
	public Person update(Long id, Person person) {

		try {

			return this.personRepository.queryPersonById(id).getId() == person.getId() ? this.save(person)
					: new Person().builder().name("unsaved object").build();

		} catch (IllegalArgumentException e) {

			return new PersonNull();
		}
	}

	@Override
	@Transactional
	@SuppressWarnings("static-access")
	public Person delete(Person person) {

		try {

			if (this.personRepository.queryObjectPersonById(person.getId())) {

				this.personRepository.delete(person);

				return new Person().builder().name("Person Deleted").build();
			} else {

				return new Person().builder().name("not deleted").build();
			}

		} catch (Exception e) {

			return new PersonNull();
		}
	}

}
