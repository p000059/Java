package Persistence.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Persistence.models.entities.Phone;
import Persistence.repositories.PhoneRepository;
import jakarta.transaction.Transactional;

@Service
public class PhoneService {

	@Autowired
	private PhoneRepository phoneRepository;
	
	@Transactional
	public Phone savePhone(Phone phone) {
		
		return this.phoneRepository.save(phone);
	}
	
	public List<Phone> getPhones(){
		
		return this.phoneRepository.findAll();
	}
}
