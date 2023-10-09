package ic.controllers;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import ic.dto.TaxDTO;
import ic.model.Car;
import ic.model.Fuel;
import ic.model.Tax;
import ic.service.interfaces.IcarService;
import ic.service.interfaces.IfuelService;
import ic.service.interfaces.ItaxService;

@RequestMapping(value = "/")
@RestController
@CrossOrigin(value = "*", maxAge = 3600)
public class HomeController {

	@Autowired
	private ItaxService itaxService;

	@Autowired
	private IcarService icarService;

	@Autowired
	private IfuelService ifuelService;

	@PostMapping(value = "insertcarfull")
	@ResponseBody
	@SuppressWarnings("static-access")
	public Car insertCar(@RequestBody Car car) {

		Car objectCar = this.icarService
				.insert(new Car().builder().name(car.getName()).status(true).build());

		

		return objectCar;
	}


	@GetMapping(value = "listcar")
	public List<Car> readCar() {
		
		return this.icarService.listCar();
	}


	@GetMapping(value = "insertFuel/{type}")
	public Fuel insertFuel(@PathVariable String type) {

		@SuppressWarnings("static-access")
		Fuel objectFuel = new Fuel().builder().type(type).status(true).build();

		return this.ifuelService.insert(objectFuel);
	}

	@GetMapping(value = "listfuel")
	public List<Fuel> listFuel() {

		return this.ifuelService.listFuel();
	}

	@GetMapping(value = "deletecar/{id}")
	public Car deleteCar(@PathVariable Long id) {

		return this.icarService.deleteCar(id);
	}
}
