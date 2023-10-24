package ic.controllers;

import java.awt.print.Pageable;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import ic.interfaces.controller.IcarController;
import ic.interfaces.service.IcarService;
import ic.interfaces.validation.IcarValidation;
import ic.model.dto.CarDTO;
import ic.model.entity.Car;

@RequestMapping(value = "/")
@RestController
@CrossOrigin(value = "*", maxAge = 3600)
public class CarController implements IcarController {

	@Autowired
	private IcarService icarService;
	
	@Autowired
	private IcarValidation icarValidation;
	
	private Car convertDTO(CarDTO carDTO) {
		
		Car objectCar = new Car();
		
		BeanUtils.copyProperties(carDTO, objectCar);
		
		return objectCar;
	}
	
	@SuppressWarnings("unused")
	private CarDTO convertObject(Car car) {
		
		CarDTO objectCarDTO = new CarDTO();
		
		BeanUtils.copyProperties(car, objectCarDTO);
		
		return objectCarDTO;
	}
	
	@Override
	@PostMapping(value = "insertcar")
	@ResponseBody
	public ResponseEntity<Car> insertCar(@RequestBody CarDTO carDTO) {
		
		return ResponseEntity.status(HttpStatus.CREATED).body(icarValidation.validateInsertion(carDTO));
	}

	@Override
	@PostMapping(value = "insertlistcar")
	@ResponseBody
	public ResponseEntity<List<Car>> insertCars(@RequestBody List<CarDTO> listCarDTO){
		
		return ResponseEntity.status(HttpStatus.CREATED).body(icarValidation.validateInsertions(listCarDTO));
	}
	
	@Override
	@GetMapping(value = "readcar")
	public ResponseEntity<Car> readCar(CarDTO carDTO) {
		
		return ResponseEntity.status(HttpStatus.OK).body(this.icarValidation.readCar(carDTO));
	}

	@Override
	@GetMapping(value = "listcar")
	@ResponseBody
	public ResponseEntity<List<Car>> readCars() {
		
		return ResponseEntity.status(HttpStatus.OK).body(this.icarService.listCar());
	}

	@Override
	public ResponseEntity<Page<Car>> readAllCars(@PageableDefault(page = 0, size = 10, sort = "id", direction = Direction.DESC) Pageable pageable) {
		
		return null;
	}

	@Override
	public ResponseEntity<Car> updateCar(CarDTO carDTO) {
		
		return null;
	}

	@Override
	@DeleteMapping(value = "deletecar")
	@ResponseBody
	public ResponseEntity<Car> deleteCar(@RequestBody CarDTO carDTO) {
		
		return ResponseEntity.status(HttpStatus.OK).body(this.icarService.deleteCar(this.convertDTO(carDTO)));
	}

	@Override	
	public ResponseEntity<List<Car>> updateCars(List<Car> cars) {
		
		return null;
	}

	@Override
	public ResponseEntity<List<Car>> deleteCars(CarDTO carDTO) {
		
		return null;
	}
}
