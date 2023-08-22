package Persistence.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Persistence.models.classnull.AddressNull;
import Persistence.models.entities.Address;
import Persistence.repositories.AddressRepository;
import Persistence.services.interfaces.IAddressService;
import jakarta.transaction.Transactional;

@Service
public class AddressService implements IAddressService {

	@Autowired
	private AddressRepository addressRepository;

	@Override
	public boolean existAddressObject(Address address) {
		
		try {
			
			return this.addressRepository.existsByAddress(address);
			
		} catch (Exception e) {

			return false;
		}		
	}
	
	@Override
	public boolean existAddressObjec(String address) {
		
		return this.addressRepository.existsByAddress(address);
	}
	
	@Override
	@Transactional
	@SuppressWarnings("static-access")
	public Address saveAddress(Address address) {

		try {
			
			return address instanceof Address ? this.addressRepository.save(address) : new Address().builder().address("Not Saved").build();
			
		} catch (IllegalArgumentException e) {

			return new AddressNull();
		}
		
	}

	@Override
	public List<Address> getAddresses() {

		return addressRepository.findAll();
	}

	@Override
	public Address getAddress(Long id) {

		try {

			return this.addressRepository.findById(id).get();

		} catch (Exception e) {

			return new AddressNull();

		}
	}

	@Override
	public Address searchAddressById(Long id) {
		
		try {
			
			return this.addressRepository.queryAddressById(id);
			
		} catch (Exception e) {
			
			return new AddressNull();
		}
	}
	
	@Override
	public Address searchAddressById(Long id, Address address) {

		Boolean objectAddress = this.addressRepository.existsByAddress(address.getAddress());
		Boolean addressId = this.addressRepository.existsById(id);

		try {

			if (objectAddress && addressId == true) {

				return this.addressRepository.findById(id).get();

			} else {

				return new AddressNull();
			}

		} catch (Exception e) {

			return new AddressNull();
		}
	}

	@Override
	public Address searchAddressById(Long id, String address) {

		Boolean objectAddress = this.addressRepository.existsByAddress(address);
		Boolean addressId = this.addressRepository.existsById(id);

		try {

			if (objectAddress && addressId == true) {

				return this.addressRepository.findById(id).get();

			} else {

				return new AddressNull();
			}

		} catch (Exception e) {

			return new AddressNull();
		}
	}

	@Override
	public Address searchAddressByName(Address address) {

		try {

			return this.addressRepository.queryAddressByName(address.getAddress());

		} catch (Exception e) {

			return new AddressNull();
		}
	}

	@Override
	public Address searchAddressByName(String address) {

		try {

			return this.addressRepository.queryAddressByName(address);

		} catch (Exception e) {

			return new AddressNull();
		}
	}


	@Override
	@Transactional
	@SuppressWarnings("static-access")
	public Address deleteAddress(Long id) {
		
		try {
			
			if(this.addressRepository.findById(id) == null) {
				
				return new Address().builder().address("id not found").build();
				
			} else {
				
				this.addressRepository.deleteById(id);
				
				return new Address().builder().address("Address Deleted").build();
			}
			
		} catch (IllegalArgumentException e) {
			
			return new AddressNull();
		}
	}
	
	@Override
	@Transactional
	@SuppressWarnings("static-access")
	public Address deleteAddress(Long id, Address address) {
				
		try {
			
			Boolean objectAddress = this.addressRepository.existsByAddress(address.getAddress());
			Boolean addressId = this.addressRepository.existsById(id);
			
			if (objectAddress && addressId == true) {
				
				this.addressRepository.deleteById(id);
				
				return new Address().builder().address("Address Deleted").status(false).build();
				
			} else {
				
				return new Address().builder().address("Not deleted").build();
			}
			
		} catch (IllegalArgumentException e) {
			
			return new AddressNull();
		}
	}
	
	@Override
	public Address updateAddress(Address address) {
		
		try {
			
			Address objectAddress = new Address();
			
			Address entityAddress = this.addressRepository.queryAddressByIdNameStatus(objectAddress.getId(), objectAddress.getAddress(), objectAddress.getStatus());
			
			return address.equals(entityAddress) ? this.addressRepository.saveAndFlush(address) : new Address();			
			
		} catch (IllegalArgumentException e) {
			
			return new AddressNull();
		}
	}

	@Override
	public Address updateAddress(Long id, Address address) {
		
		try {
			
			Address entityAddress = this.addressRepository.queryAddressById(id);
			
			return address.equals(entityAddress) ? this.addressRepository.saveAndFlush(address) : new Address(); 
			
		} catch (IllegalArgumentException e) {
			
			return new AddressNull();
		}
	}	
	
}
