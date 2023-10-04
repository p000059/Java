package ic.controllers;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
	
	@GetMapping(value = "showword")
	@SuppressWarnings("static-access")
	public Car insertCar(Model model) {
		
	Car car = new Car();

		Tax objectTax = this.itaxService.insert(new Tax().builder().type("Fuel").tax(8.3).status(true).build());
		
		Fuel objectFuel = this.ifuelService.insert(new Fuel().builder().type("Gasolina").status(true).build());
		
		car.setName("Opala");
		car.setStatus(true);
		car.setTax(objectTax);
		
		this.icarService.insert(car);
		
		return null;
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
}
