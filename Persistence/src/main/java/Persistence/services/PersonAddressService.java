package Persistence.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Persistence.models.associations.PersonAddress;
import Persistence.models.entities.Address;
import Persistence.models.entities.Person;
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
	public void savePersonAddress(Person person, Address address) {
		
		
<<<<<<< HEAD
		personAddressRepository.save(personAddress);
=======
		  Long addressId = this.addressRepository.save(address).getId(); 
		  Long personId = this.personRepository.save(person).getId();
		  
		  PersonAddress personAddress = new PersonAddress();
		  
		  personAddress.setAddressId(addressId); personAddress.setPersonId(personId);
		 
		 
>>>>>>> cf5a132cc2113a1c99f632ec0446e211727efa09
	}
}
