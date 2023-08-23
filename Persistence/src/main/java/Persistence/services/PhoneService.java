package Persistence.services;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import Persistence.models.classnull.PhoneNull;
import Persistence.models.entities.Phone;
import Persistence.repositories.PhoneRepository;
import Persistence.services.interfaces.IPhoneService;
import jakarta.transaction.Transactional;

@Service
public class PhoneService implements IPhoneService {

	@Autowired
	private PhoneRepository phoneRepository;

	@Override
	@SuppressWarnings("static-access")
	public Phone getPhone(Long id) {

		try {

			return id == 0 ? new Phone().builder().number("not found").build()
					: this.phoneRepository.queryPhoneById(id);

		} catch (IllegalArgumentException e) {

			return new PhoneNull();
		}
	}

	@Override
	@Transactional
	@SuppressWarnings("static-access")
	public Phone save(Phone phone) {

		try {

			return phone.equals(null) ? new Phone().builder().number("invalid object, check data").build()
					: this.phoneRepository.save(phone);

		} catch (Exception e) {

			return new PhoneNull();
		}
	}

	@Override
	public List<Phone> listPhone() {

		try {

			return this.phoneRepository.findAll();

		} catch (NullPointerException e) {

			return Collections.emptyList();
		}
	}

	@Override
	public Page<Phone> listPhone(Pageable pageable) {

		try {

			return this.phoneRepository.findAll(pageable);

		} catch (IllegalArgumentException e) {

			return Page.empty();
		}
	}

	@Override
	@Transactional
	@SuppressWarnings("static-access")
	public Phone update(Long id, Phone phone) {

		try {

			return this.phoneRepository.queryPhoneById(id).getId() == phone.getId() ? this.save(phone)
					: new Phone().builder().number("unsaved object").build();

		} catch (IllegalArgumentException e) {

			return new PhoneNull();
		}
	}

	@Override
	@Transactional
	@SuppressWarnings("static-access")
	public Phone delete(Phone phone) {

		try {

			if (this.phoneRepository.queryObjectPhoneById(phone.getId())) {

				this.phoneRepository.delete(phone);

				return new Phone().builder().number("Phone Deleted").build();
			} else {

				return new Phone().builder().number("not deleted").build();
			}

		} catch (Exception e) {

			return new PhoneNull();
		}
	}

}
