package ss.validation;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import ss.DTO.EmailDTO;
import ss.models.subclass.Email;
import ss.repositories.EmailRepository;
import ss.services.EmailServices;

@NoArgsConstructor
@AllArgsConstructor
@Service
public class EmailValidation {

	@Autowired
	private EmailServices emailServices;
	
	@Autowired
	private EmailRepository emailRepository;
	
	@Transactional
	public ResponseEntity<Object> validateEmail(@Validated EmailDTO emailDTO){
		
		Email email = new Email();
		
		if(emailRepository.existsByAddress(emailDTO.getAddress())) {
			
			return ResponseEntity.status(HttpStatus.CONFLICT).body("Duplicate Email");
			
		} else {
			
			BeanUtils.copyProperties(emailDTO, email);
			return ResponseEntity.status(HttpStatus.OK).body(emailServices.save(email));
		}
	}
}
