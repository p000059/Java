package Persistence.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Persistence.models.associations.PersonAddress;
import Persistence.models.entities.Address;
import Persistence.models.entities.Person;
import Persistence.repositories.AddressRepository;
import Persistence.repositories.PersonRepository;

@Service
public class PersonAddressService {

	@Autowired
	private AddressRepository addressRepository;
	
	@Autowired
	private PersonRepository personRepository;
	
	
	public void savePersonAddress(Person person, Address address) {
		
		Long addressId = this.addressRepository.save(address).getId();
		Long personId = this.personRepository.save(person).getId();
		
		PersonAddress personAddress = new PersonAddress();
		
		personAddress.setAddressId(addressId);
		personAddress.setPersonId(personId);
		
	}
}
