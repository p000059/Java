package Persistence.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Persistence.models.entities.Phone;
import Persistence.services.PhoneService;

@RequestMapping(value = "/api")
@RestController
@CrossOrigin(value = "*", maxAge = 3600)
public class PhoneController {

	@Autowired
	private PhoneService phoneService;
	
	@PostMapping(value = "/savephone")
	public ResponseEntity<Phone> savePhone(@RequestBody Phone phone){
		
		//return ResponseEntity.status(HttpStatus.CREATED).body(this.phoneService.savePhone(phone));
		return null;
	}
	
	@GetMapping(value = "/getphones")
	public ResponseEntity<List<Phone>> getPhones(){
		
		//return ResponseEntity.status(HttpStatus.FOUND).body(this.phoneService.getPhones());
		return null;
	}
}
