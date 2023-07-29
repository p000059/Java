package classnull.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import classnull.services.ShowCar;
import jakarta.servlet.http.HttpServletRequest;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@RequestMapping(value = "/api")
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class CarController<T> {

	@Autowired
	private ShowCar showCar;
	
	public ResponseEntity<Object> showNull(HttpServletRequest request){
		
		showCar.serviceCar(request);
		
		return ResponseEntity.status(HttpStatus.OK).body("request is null");
	}
}
