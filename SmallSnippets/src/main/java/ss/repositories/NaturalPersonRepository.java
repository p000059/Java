package ss.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ss.models.subclass.entity.NaturalPerson;

public interface NaturalPersonRepository extends JpaRepository<NaturalPerson, Long> {

	boolean existsByAllIgnoringCaseName(String name);
	boolean existsByAllIgnoringCaseLastName(String lastName);
}
