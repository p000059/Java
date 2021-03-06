package Persistence.validation;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.validation.annotation.Validated;

import Persistence.DTO.PhoneDTO;
import Persistence.models.classnull.PhoneNull;
import Persistence.models.entities.Phone;
import Persistence.repositories.PhoneRepository;
import Persistence.services.interfaces.IPhoneService;
import Persistence.validation.interfaces.IPhoneValidation;

public class PhoneValidation implements IPhoneValidation {

	@Autowired
	private IPhoneService iPhoneService;
	
	@Autowired
	private PhoneRepository phoneRepository;
	
	@Override
	@SuppressWarnings("static-access")
	public Phone getPhone(Long id) {

		try {

			return id == 0 ? new Phone().builder().number("not found").build() : this.iPhoneService.getPhone(id);

		} catch (IllegalArgumentException e) {

			return new PhoneNull();
		}
	}

	@Override
	@SuppressWarnings("static-access")
	public Phone getPhone(@Validated Phone phone) {

		try {

			return this.phoneRepository.existsByNumber(phone.getNumber()) ? this.iPhoneService.getPhone(phone.getId())
					: new Phone().builder().number("invalid data").build();

		} catch (IllegalArgumentException e) {

			return new PhoneNull().builder().number("invalid object").build();

		} catch (NullPointerException e) {

			return new PhoneNull().builder().number("null object").build();
		}
	}

	@Override
	public Phone save(PhoneDTO phoneDTO) {

		try {

			Phone objectPhone = new Phone();

			BeanUtils.copyProperties(phoneDTO, objectPhone);

			return this.iPhoneService.save(objectPhone);

		} catch (IllegalArgumentException e) {

			return new PhoneNull();
		}
	}

	@Override
	public Phone update(PhoneDTO phoneDTO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Phone> pages(Pageable pageable) {

		try {

			return this.iPhoneService.listPhone(pageable);

		} catch (NullPointerException e) {

			return Page.empty();
		}
	}

	@Override
	@SuppressWarnings("static-access")
	public Phone delete(PhoneDTO phoneDTO) {

		try {

			Phone objectPhone = new Phone();

			BeanUtils.copyProperties(phoneDTO, objectPhone);

			return this.phoneRepository.existsByNumber(phoneDTO.getNumber()) ? this.iPhoneService.delete(objectPhone)
					: new Phone().builder().number("invalid object").build();

		} catch (IllegalArgumentException e) {

			return new PhoneNull();
			
		} catch (NullPointerException e) {
			
			return new PhoneNull();
		}
	}

}
