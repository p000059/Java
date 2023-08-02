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

import collections.DTO.CarDTO;
import collections.models.interfaces.validations.ICarValidation;
import collections.models.subclass.entities.Car;

@RequestMapping(value = "/api")
@RestController
@CrossOrigin(value = "*", maxAge = 3600)
public class CarController {

	@Autowired
	private ICarValidation icarListValidation;
	
	@PostMapping(value = "/savecarlist")
	public ResponseEntity<Car> createCarList(@RequestBody CarDTO CarListDTO) {

		return ResponseEntity.status(HttpStatus.ACCEPTED).body(icarListValidation.validateCarList(CarListDTO));
	}

	@GetMapping(value = "/carlist")
	public ResponseEntity<Car> getCarList(@RequestParam(value = "id", required = true) Long id) {

		return ResponseEntity.status(HttpStatus.FOUND).body(icarListValidation.getValidateCarList(id));
	}

	@GetMapping(value = "/carlists")
	public ResponseEntity<List<Car>> getCarLists() {

		return ResponseEntity.status(HttpStatus.FOUND).body(icarListValidation.getValidateCarLists());
	}

	@GetMapping(value = "/carlistspagination")
	public ResponseEntity<Page<Car>> getCarLists(
			@PageableDefault(page = 0, size = 10, sort = "id", direction = Direction.DESC) Pageable pageable) {

		return ResponseEntity.status(HttpStatus.FOUND).body(icarListValidation.getValidateCarLists(pageable));
	}
	
	@PutMapping(value = "/updatecarlist")
	public ResponseEntity<Car> updateCarList(@RequestParam(value = "id", required = true) Long id, @RequestBody CarDTO CarListDTO){
		
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(icarListValidation.updateValidadeCarList(id, CarListDTO));
	}
	
	@DeleteMapping(value = "/deletecarlist")
	public ResponseEntity<Car> deleteCarList(@RequestParam(value = "id", required = true) Long id){
		
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(icarListValidation.deleteValidadeCarList(id));
	}
}
