package collections.controllers;

import java.util.List;

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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import collections.DTO.DriverDTO;
import collections.models.interfaces.validations.IDriverValidation;
import collections.models.subclass.entities.Driver;

@RequestMapping(value = "/api")
@RestController
@CrossOrigin(value = "*", maxAge = 3600)
public class DriverController {

	@Autowired
	private IDriverValidation iDriverValidation;

	@PostMapping(value = "/savedriver")
	public ResponseEntity<Driver> createDriver(@RequestBody DriverDTO driverDTO) {

		return ResponseEntity.status(HttpStatus.ACCEPTED).body(iDriverValidation.validateDriver(driverDTO));
	}

	@GetMapping(value = "/driver")
	public ResponseEntity<Driver> getDriver(@RequestParam(value = "id", required = true) Long id) {

		return ResponseEntity.status(HttpStatus.FOUND).body(iDriverValidation.getValidateDriver(id));
	}

	@GetMapping(value = "/drivers")
	public ResponseEntity<List<Driver>> getDrivers() {

		return ResponseEntity.status(HttpStatus.FOUND).body(iDriverValidation.getValidateDriver());
	}

	@GetMapping(value = "/driverspagination")
	public ResponseEntity<Page<Driver>> getDrivers(
			@PageableDefault(page = 0, size = 10, sort = "id", direction = Direction.DESC) Pageable pageable) {

		return ResponseEntity.status(HttpStatus.FOUND).body(iDriverValidation.getValidateDriver(pageable));
	}
	
	@PutMapping(value = "/updatedriver")
	public ResponseEntity<Driver> updateDriver(@RequestParam(value = "id", required = true) Long id, @RequestBody DriverDTO driverDTO){
		
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(iDriverValidation.updateValidadeDriver(id, driverDTO));
	}
	
	@DeleteMapping(value = "/deletedriver")
	public ResponseEntity<Driver> deleteDriver(@RequestParam(value = "id", required = true) Long id){
		
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(iDriverValidation.deleteValidadeDriver(id));
	}
}
