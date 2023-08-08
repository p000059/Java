package Persistence.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Persistence.models.entities.Address;
import Persistence.repositories.AddressRepository;
import jakarta.transaction.Transactional;

@Service
public class AddressService {

	@Autowired
	private AddressRepository addressRepository;
	
	@Transactional
	public Address saveAddress(Address address) {
		
		return addressRepository.save(address);
	}
	
	public List<Address> getAddress(){
		
		return addressRepository.findAll();
	}
}
