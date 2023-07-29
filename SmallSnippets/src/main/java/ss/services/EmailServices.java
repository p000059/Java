package ss.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import ss.models.subclass.Email;
import ss.repositories.EmailRepository;

@Service
public class EmailServices {

	@Autowired
	private EmailRepository emailRepository;
	
	@Transactional
	public Email save(Email email){
		
		return emailRepository.saveAndFlush(email);
	}
	
	public ResponseEntity<List<Email>> getEmails(){
		
		return ResponseEntity.status(HttpStatus.OK).body(emailRepository.findAll());
	}
}
