package ic.controllers;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ic.model.Car;
import ic.model.Tax;
import ic.service.interfaces.IcarService;
import ic.service.interfaces.ItaxService;

@RequestMapping(value = "/")
@RestController
@CrossOrigin(value = "*", maxAge = 3600)
public class HomeController {

	@Autowired
	private ItaxService itaxService;
	
	@Autowired
	private IcarService icarService;
	
	@GetMapping(value = "showword")
	public String showWord(Model model) {
		
	Car car = new Car();
		
		@SuppressWarnings("static-access")
		Tax objTax = this.itaxService.insert(new Tax().builder().type("Fuel").tax(20.3).status(true).build());
		
		car.setName("Fusca");
		car.setStatus(true);
		car.setTax(objTax);
		
		this.icarService.insert(car);
		
		model.addAllAttributes((Collection<?>) model.getAttribute(model.toString()));
		return "../index.html";
	}
	
	@GetMapping(value = "taxrecord")
	public Tax insertTax(Tax tax) {
		
		@SuppressWarnings("static-access")
		Tax objTax = new Tax().builder().type("Fuel").tax(20.3).status(true).build();
		
		
		return this.itaxService.insert(objTax);		
		
	}
	
}
