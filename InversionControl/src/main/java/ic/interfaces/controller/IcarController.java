package ic.interfaces.controller;

import java.awt.print.Pageable;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;

import ic.model.dto.CarDTO;
import ic.model.entity.Car;

public interface IcarController {
	
	ResponseEntity<Car> insertCar(CarDTO carDTO);
	
	ResponseEntity<Car> readCar(CarDTO carDTO);
	
	ResponseEntity<List<Car>> readAllCars();
	
	ResponseEntity<Page<Car>> readAllCars(@PageableDefault(page = 0, size = 10, sort = "id", direction = Direction.DESC) Pageable pageable);
	
	ResponseEntity<Car> updateCar(CarDTO carDTO);
	
	ResponseEntity<Car> deleteCar(CarDTO carDTO);
	
	ResponseEntity<List<Car>> updateCars(List<Car> cars);	
	
	ResponseEntity<List<Car>> deleteCars(CarDTO carDTO);
}
