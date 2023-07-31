package ss.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import ss.models.subclass.entity.Email;
import ss.repositories.EmailRepository;

@Service
public class EmailService {

	@Autowired
	private EmailRepository emailRepository;
	
	@Transactional
	public Email save(Email email){
		
		return emailRepository.saveAndFlush(email);
	}
	
	public Page<Email> getEmails(Pageable pageable){
		
		return emailRepository.findAll(pageable);
	}
	
	@Transactional
	public Email updateEmail(Email email) {
		
		return emailRepository.save(email);
	}
	
	public Optional<Email> findId(Long id) {
		
		return emailRepository.findById(id);
	}
	
	public boolean verifyEmail(String email) {
		
		return emailRepository.existsByAddress(email);
	}
}
