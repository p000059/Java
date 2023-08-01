package ss.controllers;

import ss.validation.EmailValidation;
import ss.DTO.EmailDTO;
import ss.models.subclass.entity.BeanTest;
import ss.models.subclass.entity.Email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "/api")
@RestController
@CrossOrigin(value = "*", maxAge = 3600)
@PropertySource("classpath:configuration.properties")
public class EmailController<T> {

	@Autowired
	private EmailValidation emailValidation;
	
	@Autowired
	private BeanTest beanTest;
	
	@Value("${app.name}")
	private String appName;
	
	@GetMapping(value = "/emails")
	public ResponseEntity<Page<Email>> getEmails(@PageableDefault(page = 0, size = 10, sort = "id", direction = Direction.ASC) Pageable pageable){
		
		beanTest.boxMessage();
		System.out.println("\nName app: " + this.appName + "\n");
		return ResponseEntity.status(HttpStatus.OK).body(emailValidation.getValidateEmails(pageable));
	}
	
	@GetMapping(value = "/email/{id}")
	public ResponseEntity<Email> getEmail(@PathVariable(value = "id") Long id){
		
		return ResponseEntity.status(HttpStatus.FOUND).body(emailValidation.getValidateEmail(id));			
		
	}
	
	@GetMapping(value = "/param")
	public ResponseEntity<Email> getEmailParam(@RequestParam(value = "id", required = true) Long id){
		
		return ResponseEntity.status(HttpStatus.FOUND).body(emailValidation.getValidateEmail(id));			
		
	}
	
	@PostMapping(value = "/create")
	public ResponseEntity<Email> saveEmail(@RequestBody EmailDTO emailDTO){
		
		return ResponseEntity.status(HttpStatus.CREATED).body(emailValidation.validateEmail(emailDTO));
	}
	
	@PutMapping(value = "/update/{id}")
	public ResponseEntity<Email> updateEmail(@PathVariable(value = "id") Long id, @RequestBody EmailDTO emailDTO){
		
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(emailValidation.updateValidateEmail(id, emailDTO));
	}
	
	@DeleteMapping(value = "/delete/{id}")
	public ResponseEntity<Email> deleteEmail(@PathVariable(value = "id") Long id){
		
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(emailValidation.deleteEmail(id));
	}
}
