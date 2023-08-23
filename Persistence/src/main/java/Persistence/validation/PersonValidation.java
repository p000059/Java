package Persistence.validation;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import Persistence.DTO.PersonDTO;
import Persistence.models.classnull.PersonNull;
import Persistence.models.entities.Person;
import Persistence.repositories.PersonRepository;
import Persistence.services.interfaces.IPersonService;
import Persistence.validation.interfaces.IPersonValidation;

@Service
public class PersonValidation implements IPersonValidation {

	@Autowired
	private IPersonService iPersonService;

	@Autowired
	private PersonRepository iPersonRepository;

	@Override
	@SuppressWarnings("static-access")
	public Person getPerson(@Validated Long id) {

		try {

			return id == 0 ? new Person().builder().name("not found").build() : this.iPersonService.getPerson(id);

		} catch (IllegalArgumentException e) {

			return new PersonNull();
		}
	}

	@Override
	@SuppressWarnings("static-access")
	public Person getPerson(@Validated Person person) {

		try {

			return this.iPersonRepository.existsByName(person.getName()) ? this.iPersonService.getPerson(person.getId())
					: new Person().builder().name("invalid data").build();

		} catch (IllegalArgumentException e) {

			return new PersonNull().builder().name("invalid object").build();

		} catch (NullPointerException e) {

			return new PersonNull().builder().name("null object").build();
		}

	}

	@Override
	@SuppressWarnings("static-access")
	public Person update(@Validated PersonDTO personDTO) {

		try {

			if (this.iPersonRepository.existsByName(personDTO.getName())) {

				return this.save(personDTO);

			} else {

				return new Person().builder().name("invalid person").build();
			}

		} catch (Exception e) {

			return new PersonNull();
		}
	}

	@Override
	public Person save(@Validated PersonDTO personDTO) {

		try {

			Person objectPerson = new Person();

			BeanUtils.copyProperties(personDTO, objectPerson);

			return this.iPersonService.save(objectPerson);

		} catch (IllegalArgumentException e) {

			return new PersonNull();
		}
	}

	@Override
	public Page<Person> pages(@Validated Pageable pageable) {

		try {

			return this.iPersonService.listPerson(pageable);

		} catch (NullPointerException e) {

			return Page.empty();
		}
	}

	@Override
	@SuppressWarnings("static-access")
	public Person delete(@Validated PersonDTO personDTO) {

		try {

			Person objectPerson = new Person();

			BeanUtils.copyProperties(personDTO, objectPerson);

			return this.iPersonRepository.existsByName(personDTO.getName()) ? this.iPersonService.delete(objectPerson)
					: new Person().builder().name("invalid object").build();

		} catch (IllegalArgumentException e) {

			return new PersonNull();
			
		} catch (NullPointerException e) {
			
			return new PersonNull();
		}
	}

}
