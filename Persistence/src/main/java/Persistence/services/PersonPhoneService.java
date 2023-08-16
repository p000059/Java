package Persistence.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Persistence.models.entities.Person;
import Persistence.models.entities.Phone;
import Persistence.models.intermediate.PersonPhone;
import Persistence.repositories.PersonPhoneRepository;
import Persistence.repositories.PersonRepository;
import Persistence.repositories.PhoneRepository;

import jakarta.transaction.Transactional;

@Service
public class PersonPhoneService {

	@Autowired
	private PersonPhoneRepository personPhoneRepository;

	@Autowired
	private PersonRepository personRepository;

	@Autowired
	private PhoneRepository phoneRepository;

	@Transactional
	public PersonPhone savePersonPhone(Person person, Phone phone) {

		Long personId = this.personRepository.save(person).getId();
		Long phoneId = this.phoneRepository.save(phone).getId();

		PersonPhone personPhone = new PersonPhone();

		personPhone.setPersonId(personId);
		personPhone.setPhoneId(phoneId);

		return this.personPhoneRepository.save(personPhone);

	}

	public List<PersonPhone> getPersonPhone() {

		return this.personPhoneRepository.findAll();
	}
}
