package ic.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import ic.model.dto.CarFuelDTO;
import ic.model.entity.CarFuel;
import ic.validation.CarFuelValidation;

@RequestMapping(value = "/")
@RestController
@CrossOrigin(value = "*", maxAge = 3600)
public class CarFuelController {

	@Autowired
	private CarFuelValidation carFuelValidation;
	
	@PostMapping(value = "insertcarfuel")
	@ResponseBody
	public ResponseEntity<CarFuel> insertCarFuel(@RequestBody CarFuelDTO carFuelDTO) {
		
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(this.carFuelValidation.insertValidation(carFuelDTO));
	}
}
