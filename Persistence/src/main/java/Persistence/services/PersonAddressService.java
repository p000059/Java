package Persistence.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Persistence.models.Embbedable.PersonAddressId;
import Persistence.models.entities.Address;
import Persistence.models.entities.Person;
import Persistence.models.intermediate.PersonAddress;
import Persistence.repositories.AddressRepository;
import Persistence.repositories.PersonAddressRepository;
import Persistence.repositories.PersonRepository;

import jakarta.transaction.Transactional;

@Service
public class PersonAddressService {

	@Autowired
	private PersonAddressRepository personAddressRepository;
	
	@Autowired
	private PersonRepository personRepository;

	@Autowired
	private AddressRepository addressRepository;

	@Transactional
	public PersonAddress savePersonAddress(Person person, Address address) {

		Long addressId = this.addressRepository.save(address).getId();
		Long personId = this.personRepository.save(person).getId();

		PersonAddressId personAddressId = new PersonAddressId();
		personAddressId.setAddressId(addressId);
		personAddressId.setPersonId(personId);

		PersonAddress personAddress = new PersonAddress();
		personAddress.setPersonAddressId(personAddressId);

		return this.personAddressRepository.save(personAddress);

	}

	public List<PersonAddress> getPersonAddress() {

		return this.personAddressRepository.findAll();
	}
}
