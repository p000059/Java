package Persistence.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Persistence.DTO.PhoneDTO;
import Persistence.models.entities.Phone;
import Persistence.validation.interfaces.IPhoneValidation;

@RequestMapping(value = "/api")
@RestController
@CrossOrigin(value = "*", maxAge = 3600)
public class PhoneController {

	@Autowired
	private IPhoneValidation iPhoneValidation;
	
	@PostMapping(value = "/savephone")
	public ResponseEntity<Phone> savePhone(@RequestBody PhoneDTO phoneDTO){
		
		return ResponseEntity.status(HttpStatus.CREATED).body(this.iPhoneValidation.save(phoneDTO));
	}
	
	@GetMapping(value = "/getphones")
	public ResponseEntity<Page<Phone>> getPhones(@PageableDefault(page = 0, size = 10, sort = "id", direction = Direction.DESC) Pageable pageable){
		
		return ResponseEntity.status(HttpStatus.FOUND).body(this.iPhoneValidation.pages(pageable));		
	}
	
	@GetMapping(value = "getphone")
	public ResponseEntity<Phone> getPhone(@RequestBody Phone phone){
		
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(this.iPhoneValidation.getPhone(phone));
	}
	
	@PutMapping(value = "/updatephones")
	public ResponseEntity<Phone> updatePhone(@RequestBody PhoneDTO phoneDTO){
		
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(this.iPhoneValidation.update(phoneDTO));
	}
	
	@DeleteMapping(value = "/deletephones")
	public ResponseEntity<Phone> deletePhone(@RequestBody PhoneDTO phoneDTO){
		
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(this.iPhoneValidation.delete(phoneDTO));
	}
}
