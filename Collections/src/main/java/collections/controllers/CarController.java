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
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import collections.DTO.entities.CarDTO;
import collections.controllers.interfaces.ICarController;
import collections.models.subclass.entities.Car;
import collections.validations.interfaces.ICarValidation;

@RequestMapping(value = "/car")
@RestController
@CrossOrigin(value = "*", maxAge = 3600)
public class CarController implements ICarController {

	@Autowired
	private ICarValidation iCarValidation;

	@Override
	@GetMapping(value = "/getcars")
	public ResponseEntity<Page<Car>> readCar(@PageableDefault(page = 0, size = 10, sort = "id", direction = Direction.DESC) Pageable pageable) {
		
		try {
			
			return ResponseEntity.status(HttpStatus.ACCEPTED).body(iCarValidation.getValidateCar(pageable));			
			
		} catch (Exception e) {

			return ResponseEntity.status(HttpStatus.NO_CONTENT).body(Page.empty());
		}		
	}

	@Override
	@PostMapping(value = "/savecar")
	@SuppressWarnings("static-access")
	public ResponseEntity<Car> saveCar(CarDTO carDTO) {

		try {
			
			return ResponseEntity.status(HttpStatus.ACCEPTED).body(iCarValidation.validateCar(carDTO));
			
		} catch (Exception e) {

			return ResponseEntity.status(HttpStatus.NO_CONTENT).body(new Car().builder().car("invalid object").build());
		}
	}

	@Override
	@SuppressWarnings("static-access")
	@PutMapping(value = "/updatecar/{id}")
	public ResponseEntity<Car> updateCar(Long id, CarDTO carDTO) {

		try {
			
			return ResponseEntity.status(HttpStatus.ACCEPTED).body(iCarValidation.updateValidadeCar(id, carDTO));
			
		} catch (Exception e) {

			return ResponseEntity.status(HttpStatus.NO_CONTENT).body(new Car().builder().car("invalid object").build());
		}
	}

	@Override
	@SuppressWarnings("static-access")
	@DeleteMapping(value = "/deletecar/{id}")
	public ResponseEntity<Car> deleteCar(Long id, CarDTO carDTO) {

		try {
			
			return ResponseEntity.status(HttpStatus.ACCEPTED).body(iCarValidation.deleteValidateCar(id, carDTO));
			
		} catch (Exception e) {

			return ResponseEntity.status(HttpStatus.NO_CONTENT).body(new Car().builder().car("invalid object").build());
		}
	}
}
