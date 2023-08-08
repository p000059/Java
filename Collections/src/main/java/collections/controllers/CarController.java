package collections.controllers;

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

import collections.DTO.CarDTO;
import collections.models.interfaces.validations.ICarValidation;
import collections.models.subclass.entities.Car;

@RequestMapping(value = "/api")
@RestController
@CrossOrigin(value = "*", maxAge = 3600)
public class CarController {

	@Autowired
	private ICarValidation iCarValidation;
	
	@GetMapping(value = "/readCar")
	public ResponseEntity<Page<Car>> readDriver(@PageableDefault(page = 0, size = 10, sort = "id", direction = Direction.DESC) Pageable pageable) {
		
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(iCarValidation.getValidateCar(pageable));
	}
	
	@PostMapping(value = "/savecar")
	public ResponseEntity<Car> saveDriver(@RequestBody CarDTO carDTO) {
		
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(iCarValidation.validateCar(carDTO));
	}
	
	@PutMapping(value = "/updatecar/{id}")
	public ResponseEntity<Car> updateDriver(@PathVariable(value = "id") Long id, @RequestBody CarDTO carDTO){
		
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(iCarValidation.updateValidadeCar(id, carDTO));
	}
}
