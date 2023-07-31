package ss.validation;

import ss.DTO.EmailDTO;
import ss.models.subclass.entity.Email;
import ss.models.subclass.nullable.EmailNull;
import ss.services.EmailService;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Service
public class EmailValidation {

	@Autowired
	private EmailService emailServices;
	
	public Email validateEmail(@Validated EmailDTO emailDTO){
		
		Email email = new Email();
		
		if(emailServices.verifyEmail(emailDTO.getAddress())) {
			
			return new EmailNull();
			
		} else {
			
			BeanUtils.copyProperties(emailDTO, email);
			return emailServices.save(email);
		}
	}
	
	public Page<Email> getValidateEmails(Pageable pageable){
		
		Page<Email> listEmails = emailServices.getEmails(pageable);
		
		return listEmails;
	}
	
	public Email updateValidateEmail(Long id, @Validated EmailDTO emailDTO) {
		
		Email email = new Email();
		
		Optional<Email> emailOptional = emailServices.findId(id);
        
		if (!emailOptional.isPresent()) {
            
			return new EmailNull();
        } else {
        
        	BeanUtils.copyProperties(emailDTO, email);
        	email.setId(emailOptional.get().getId());
        	return emailServices.save(email);
        }
	}
}
