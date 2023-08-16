package Persistence.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Persistence.models.entities.Address;
import Persistence.services.interfaces.IAddressService;

@RequestMapping(value = "/api")
@RestController
@CrossOrigin(value = "*", maxAge = 3600)
public class AddressController {
	
	@Autowired
	private IAddressService iAddressService;
	
	@PostMapping(value = "/saveaddress")
	public Address saveAddress(@RequestBody Address address) {
		
		return iAddressService.saveAddress(address);
	}
	
	@GetMapping(value = "/getadresses")
	public ResponseEntity<List<Address>> getAdresses(){
		
		return ResponseEntity.status(HttpStatus.FOUND).body(this.iAddressService.getAddresses());
	}
	
	@PostMapping(value = "/saveaddressobject")
	public ResponseEntity<Address> saveAddressController(@RequestBody Address address){
		
		return ResponseEntity.status(HttpStatus.CREATED).body(this.iAddressService.saveAddress(address));
	}
	
	@PutMapping(value = "updateaddress")
	public ResponseEntity<Address> updateAddress(@RequestBody Address address){
		
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(this.iAddressService.updateAddress(address));
	}
}
