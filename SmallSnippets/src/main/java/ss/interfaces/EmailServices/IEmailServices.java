package ss.interfaces.EmailServices;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import ss.models.subclass.entity.Email;

public interface IEmailServices {

	Email save(Email email);

	Page<Email> getEmails(Pageable pageable);

	Email updateEmail(Email email);

	Optional<Email> findId(Long id);

	boolean verifyEmail(String email);

	void deleteEmail(Long id);
}
