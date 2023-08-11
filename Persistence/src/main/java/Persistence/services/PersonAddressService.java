package Persistence.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Persistence.models.Embbedable.PersonAddressFK;
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
	public void savePersonAddress(Person person, Address address) {

		Long addressId = this.addressRepository.save(address).getId();
		Long personId = this.personRepository.save(person).getId();

		PersonAddressFK personAddressFK = new PersonAddressFK();
		personAddressFK.setAddressId(addressId);
		personAddressFK.setPersonId(personId);
		
		PersonAddress personAddress = new PersonAddress();
		personAddress.setPersonAddressFK(personAddressFK);

		
		this.personAddressRepository.save(personAddress);

	}
}
