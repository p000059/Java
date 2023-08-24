package Persistence.validation;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.validation.annotation.Validated;

import Persistence.DTO.AddressDTO;
import Persistence.models.classnull.AddressNull;
import Persistence.models.entities.Address;
import Persistence.repositories.AddressRepository;
import Persistence.services.interfaces.IAddressService;
import Persistence.validation.interfaces.IAddressValidation;

public class AddressValidation implements IAddressValidation {

	@Autowired
	private IAddressService iAddressService;
	
	@Autowired
	private AddressRepository addressRepository;
	
	@Override
	@SuppressWarnings("static-access")
	public Address getAddress(@Validated Long id) {

		try {

			return id == 0 ? new Address().builder().address("not found").build() : this.iAddressService.getAddress(id);

		} catch (IllegalArgumentException e) {

			return new AddressNull();
		}
	}

	@Override
	@SuppressWarnings("static-access")
	public Address getAddress(@Validated Address address) {
		
		try {

			return this.addressRepository.existsByAddress(address.getAddress()) ? this.iAddressService.getAddress(address.getId())
					: new Address().builder().address("invalid data").build();

		} catch (IllegalArgumentException e) {

			return new AddressNull().builder().address("invalid object").build();

		} catch (NullPointerException e) {

			return new AddressNull().builder().address("null object").build();
		}
	}

	@Override
	public Address save(AddressDTO addressDTO) {

		try {

			Address objectAddress = new Address();

			BeanUtils.copyProperties(addressDTO, objectAddress);

			return this.iAddressService.saveAddress(objectAddress);

		} catch (IllegalArgumentException e) {

			return new AddressNull();
		}
	}

	@Override
	@SuppressWarnings("static-access")
	public Address update(AddressDTO addressDTO) {

		try {

			if (this.addressRepository.existsByAddress(addressDTO.getAddress())) {

				return this.save(addressDTO);

			} else {

				return new Address().builder().address("invalid Address").build();
			}

		} catch (Exception e) {

			return new AddressNull();
		}
	}

	@Override
	public Page<Address> pages(Pageable pageable) {

		try {

			return this.iAddressService.getAddresses(pageable);

		} catch (NullPointerException e) {

			return Page.empty();
		}
	}

	@Override
	@SuppressWarnings("static-access")
	public Address delete(Long id, @Validated AddressDTO addressDTO) {

		try {

			Address objectAddress = new Address();

			BeanUtils.copyProperties(addressDTO, objectAddress);

			return this.addressRepository.existsByAddress(addressDTO.getAddress()) ? this.iAddressService.deleteAddress(id, objectAddress)
					: new Address().builder().address("invalid object").build();

		} catch (IllegalArgumentException e) {

			return new AddressNull();
			
		} catch (NullPointerException e) {
			
			return new AddressNull();
		}
	}
	
}
