package ss.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ss.models.subclass.entity.Email;

public interface EmailRepository extends JpaRepository<Email, Long> {

	boolean existsByAddress(String address);
	boolean existsById(Long id);
}
