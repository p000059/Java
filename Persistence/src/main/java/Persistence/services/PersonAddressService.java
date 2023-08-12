package Persistence.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
	private AddressRepository addressRepository;

	@Autowired
	private PersonRepository personRepository;

	@Autowired
	private PersonAddressRepository personAddressRepository;

	@Transactional
	public PersonAddress savePersonAddress(Person person, Address address) {
		
		  Long addressId = this.addressRepository.save(address).getId(); 
		  Long personId = this.personRepository.save(person).getId();
		  
		  PersonAddress personAddress = new PersonAddress();
		  personAddress.setAddressId(addressId);
		  personAddress.setPersonId(personId);
		  
		  return this.personAddressRepository.save(personAddress);
	}
}
