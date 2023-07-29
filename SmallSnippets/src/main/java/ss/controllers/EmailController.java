package ss.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import ss.DTO.EmailDTO;
import ss.services.EmailServices;
import ss.validation.EmailValidation;

@AllArgsConstructor
@NoArgsConstructor
@RequestMapping(value = "/api")
@RestController
@CrossOrigin(value = "*", maxAge = 3600)
public class EmailController<T> {

	@Autowired
	private EmailValidation emailValidation;
	
	@Autowired
	private EmailServices emailServices;
	
	@GetMapping(value = "/readEmail")
	public ResponseEntity<Object> getEmails(){
		
		return ResponseEntity.status(HttpStatus.OK).body(emailServices.getEmails());
	}
	
	@PostMapping(value = "/create")
	public ResponseEntity<Object> saveEmail(@RequestBody EmailDTO emailDTO){
		
		return ResponseEntity.status(HttpStatus.OK).body(emailValidation.validateEmail(emailDTO));
	}
}
