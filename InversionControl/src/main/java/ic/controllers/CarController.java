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
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import ic.controllers.interfaces.IcarController;
import ic.dto.CarDTO;
import ic.model.Car;
import ic.model.Tax;
import ic.service.interfaces.IcarService;

@RequestMapping(value = "/")
@RestController
@CrossOrigin(value = "*", maxAge = 3600)
public class CarController implements IcarController {

	@Autowired
	private IcarService icarService;

	@Override
	@PostMapping(value = "insertcar")
	@ResponseBody
	public ResponseEntity<Car> insertCar(@RequestBody CarDTO carDTO) {
		
		Car objectCar = new Car();
		
		Tax objectTax = new Tax();
		
		BeanUtils.copyProperties(carDTO.getTax(), objectTax);
		
		BeanUtils.copyProperties(carDTO, objectCar);
		
		objectCar.setTax(objectTax);
		
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(this.icarService.insert(objectCar));
	}

	@Override
	public ResponseEntity<Car> readCar(CarDTO carDTO) {
		
		return null;
	}

	@Override
	public ResponseEntity<List<Car>> readAllCars() {
		
		return null;
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
	public ResponseEntity<Car> deleteCar(CarDTO carDTO) {
		
		return null;
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
