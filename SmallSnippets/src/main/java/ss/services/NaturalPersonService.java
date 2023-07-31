package ss.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import ss.models.subclass.entity.NaturalPerson;
import ss.repositories.NaturalPersonRepository;

@Service
public class NaturalPersonService {

	@Autowired
	private NaturalPersonRepository naturalPersonRepository;
	
	@Transactional
	public NaturalPerson save(NaturalPerson naturalPerson) {
		
		return naturalPersonRepository.saveAndFlush(naturalPerson);
	}
	
	public Page<NaturalPerson> getPersons(Pageable pageable){
		
		return naturalPersonRepository.findAll(pageable);
	}
	
	@Transactional
	public NaturalPerson updatePerson(NaturalPerson naturalPerson) {
		
		return naturalPersonRepository.saveAndFlush(naturalPerson);
	}
	
	public Optional<NaturalPerson> findIdPerson(Long id){
		
		return naturalPersonRepository.findById(id);
	}
	
	public boolean verifyName(String name) {
		
		return naturalPersonRepository.existsByAllIgnoringCaseName(name);
	}
	
	public boolean verifyLastName(String lastName) {
		
		return naturalPersonRepository.existsByAllIgnoringCaseLastName(lastName);
	}
	
	@Transactional
	public void deletePerson(Long id) {
		
		naturalPersonRepository.deleteById(id);
	}	
}
