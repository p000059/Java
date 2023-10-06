package ic.controllers;

import java.util.List;

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

import ic.model.Car;
import ic.model.CarFuels;
import ic.model.Fuel;
import ic.model.Tax;
import ic.model.embeddables.CarFuelFK;
import ic.repositories.ICarFuelRepository;
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

	@Autowired
	private ICarFuelRepository iCarFuelRepository;

	@PostMapping(value = "insertcarfull")
	@ResponseBody
	@SuppressWarnings("static-access")
	public Car insertCar(@RequestBody Car car, @RequestBody Tax tax, @RequestBody Fuel fuel) {

		Tax objectTax = this.itaxService
				.insert(new Tax().builder().type(tax.getType()).tax(tax.getTax()).status(true).build());

		Car objectCar = this.icarService
				.insert(new Car().builder().name(car.getName()).tax(objectTax).status(true).build());

		Fuel objectFuel = this.ifuelService.insert(new Fuel().builder().type(fuel.getType()).status(true).build());

		CarFuelFK objectCarFuelFK = new CarFuelFK().builder().fuelId(objectFuel.getId()).carId(objectCar.getId())
				.build();

		CarFuels objectCarFuels = new CarFuels().builder().carFuelFK(objectCarFuelFK).build();

		this.iCarFuelRepository.save(objectCarFuels);

		return objectCar;
	}

	@PostMapping(value = "insertcar")
	@ResponseBody
	@SuppressWarnings("static-access")
	public ResponseEntity<Car> insertCar(@RequestBody Car car) {

		Car objectCar = new Car();
		Tax objectTax = new Tax();

		this.icarService.insert(new Car().builder().name(car.getName())
				.tax(new Tax().builder().type(objectTax.getType()).tax(objectTax.getTax()).status(true).build()).status(true)
				.build());

		return ResponseEntity.status(HttpStatus.ACCEPTED).body(objectCar);
	}

	@GetMapping(value = "listcar")
	public List<Car> readCar() {
		
		return this.icarService.listCar();
	}
	
	@GetMapping(value = "taxrecord")
	public Tax insertTax(Tax tax) {

		@SuppressWarnings("static-access")
		Tax objTax = new Tax().builder().type("Compression").tax(20.3).status(true).build();

		return this.itaxService.insert(objTax);

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
