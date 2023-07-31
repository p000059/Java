package ss.controllers;

import ss.validation.EmailValidation;
import ss.DTO.EmailDTO;
import ss.models.subclass.entity.Email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@RequestMapping(value = "/api")
@RestController
@CrossOrigin(value = "*", maxAge = 3600)
public class EmailController<T> {

	@Autowired
	private EmailValidation emailValidation;
	
	@GetMapping(value = "/emails")
	public ResponseEntity<Page<Email>> getEmails(@PageableDefault(page = 0, size = 10, sort = "id", direction = Direction.ASC) Pageable pageable){
		
		return ResponseEntity.status(HttpStatus.OK).body(emailValidation.getValidateEmails(pageable));
	}
	
	@PostMapping(value = "/create")
	public ResponseEntity<Object> saveEmail(@RequestBody EmailDTO emailDTO){
		
		return ResponseEntity.status(HttpStatus.OK).body(emailValidation.validateEmail(emailDTO));
	}
	
	@PutMapping(value = "/update/{id}")
	public ResponseEntity<Object> updateEmail(@PathVariable(value = "id") Long id, @RequestBody EmailDTO emailDTO){
		
		return ResponseEntity.status(HttpStatus.OK).body(emailValidation.updateValidateEmail(id, emailDTO));
	}
}
