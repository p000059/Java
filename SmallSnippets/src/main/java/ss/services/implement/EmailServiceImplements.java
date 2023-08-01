package ss.services.implement;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import ss.interfaces.EmailServices.IEmailServices;
import ss.models.subclass.entity.Email;

@Service
public class EmailServiceImplements implements IEmailServices {

	@Override
	public Email save(Email email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Email> getEmails(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Email updateEmail(Email email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Email> findId(Long id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public boolean verifyEmail(String email) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void deleteEmail(Long id) {
		// TODO Auto-generated method stub
		
	}

}
