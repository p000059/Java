package ss.validation;

import ss.DTO.EmailDTO;
import ss.interfaces.EmailServices.IEmailServices;
import ss.models.subclass.entity.Email;
import ss.models.subclass.nullable.EmailNull;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

@Service
public class EmailValidation {

	@Autowired
	@Qualifier("emailService")
	private IEmailServices iEmailServices;
	
	public Email validateEmail(@Validated EmailDTO emailDTO){
		
		Email email = new Email();
		
		if(iEmailServices.verifyEmail(emailDTO.getAddress())) {
			
			return new EmailNull();
			
		} else {
			
			BeanUtils.copyProperties(emailDTO, email);
			return iEmailServices.save(email);
		}
	}
	
	public Page<Email> getValidateEmails(Pageable pageable){
		
		Page<Email> listEmails = iEmailServices.getEmails(pageable);
		
		return listEmails;
	}
	
	public Email getValidateEmail(Long id) {
		
		Optional<Email> optionalEmail = iEmailServices.findId(id);
		
		if(!optionalEmail.isPresent()) {
			
			return new EmailNull();
			
		} else {
			
			return optionalEmail.get();
		}
	}
	
	public Email updateValidateEmail(Long id, @Validated EmailDTO emailDTO) {
		
		Email email = new Email();
		
		Optional<Email> emailOptional = iEmailServices.findId(id);
        
		if (!emailOptional.isPresent()) {
            
			return new EmailNull();
        } else {
        
        	BeanUtils.copyProperties(emailDTO, email);
        	email.setId(emailOptional.get().getId());
        	return iEmailServices.save(email);
        }
	}
	
	public Email deleteEmail(Long id) {
		
		Optional<Email> emailOptional = iEmailServices.findId(id);
		
		if(!emailOptional.isPresent()) {
			
			return new EmailNull();
			
		} else {
			
			Email email = new Email();
			
			email.setAddress("Email Deleted");
			email.setStatus(false);
			
			iEmailServices.deleteEmail(id);
			return email;
			
		}
	}
}
