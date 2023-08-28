package collections.controllers;

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
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import collections.DTO.entities.DriverDTO;
import collections.controllers.interfaces.IDriverController;
import collections.models.subclass.entities.Driver;
import collections.validations.interfaces.IDriverValidation;

@RequestMapping(value = "/api")
@RestController
@CrossOrigin(value = "*", maxAge = 3600)
public class DriverController implements IDriverController {

	@Autowired
	private IDriverValidation iDriverValidation;
	
	@Override
	@GetMapping(value = "/getdrivers")
	public ResponseEntity<Page<Driver>> readDriver(@PageableDefault(page = 0, size = 10, sort = "id", direction = Direction.DESC) Pageable pageable) {
	
		try {
			
			return ResponseEntity.status(HttpStatus.ACCEPTED).body(iDriverValidation.getValidateDriver(pageable));			
			
		} catch (Exception e) {

			return ResponseEntity.status(HttpStatus.NO_CONTENT).body(Page.empty());
		}
		
	}
	
	@Override
	@SuppressWarnings("static-access")
	@PostMapping(value = "/savedriver")
	public ResponseEntity<Driver> saveDriver(@RequestBody DriverDTO driverDTO) {
		
		try {
			
			return ResponseEntity.status(HttpStatus.ACCEPTED).body(iDriverValidation.validateDriver(driverDTO));			
			
		} catch (Exception e) {

			return ResponseEntity.status(HttpStatus.NO_CONTENT).body(new Driver().builder().name("invalid object").build());
		}		
	}
	
	@Override
	@SuppressWarnings("static-access")
	@PutMapping(value = "/updatedriver/{id}")
	public ResponseEntity<Driver> updateDriver(@PathVariable(value = "id") Long id, @RequestBody DriverDTO driverDTO){
		
		try {
			
			return ResponseEntity.status(HttpStatus.ACCEPTED).body(iDriverValidation.updateValidadeDriver(id, driverDTO));
			
		} catch (Exception e) {

			return ResponseEntity.status(HttpStatus.NO_CONTENT).body(new Driver().builder().name("invalid object").build());
		}		
	}
	
	@Override
	@SuppressWarnings("static-access")
	@DeleteMapping(value = "/deletedriver/{id}")
	public ResponseEntity<Driver> deleteDriver(@PathVariable(value = "id") Long id, @RequestBody DriverDTO driverDto){
		
		try {
			
			return ResponseEntity.status(HttpStatus.ACCEPTED).body(iDriverValidation.deleteValidadeDriver(id, driverDto));
			
		} catch (Exception e) {

			return ResponseEntity.status(HttpStatus.NO_CONTENT).body(new Driver().builder().name("invalid object").build());
		}
		
	}
}
