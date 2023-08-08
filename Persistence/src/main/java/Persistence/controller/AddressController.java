package Persistence.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Persistence.models.entities.Address;
import Persistence.services.AddressService;

@RequestMapping(value = "/api")
@RestController
@CrossOrigin(value = "*", maxAge = 3600)
public class AddressController {

	@Autowired
	private AddressService addressService;
	
	@PostMapping(value = "/saveaddress")
	public Address saveAddress(@RequestBody Address address) {
		
		return addressService.saveAddress(address);
	}
	
	@GetMapping(value = "/getadresses")
	public List<Address> getAdresses(){
		
		return addressService.getAddress();
	}
}
