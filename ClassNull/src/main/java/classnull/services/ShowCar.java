package classnull.services;

import org.springframework.stereotype.Service;

import classnull.models.subclass.Car;
import classnull.models.subclass.CarNull;
import classnull.models.subclass.CookieFactory;
import jakarta.servlet.http.HttpServletRequest;

@Service
public class ShowCar {

public void serviceCar(HttpServletRequest request) {
		
		Car shoppingCar = CookieFactory.createShoppingCar(request);
		
		request.setAttribute("value", shoppingCar.getValue());
		request.setAttribute("size", shoppingCar.getSize());
		
		if(request.getAttribute("user") != null) {
			
			request.setAttribute("user", shoppingCar.getUser());
			
		} else {
			
			request.setAttribute("userShoppingCAr", CarNull.builder()
					.user(null)
					.build());
			
		}
	}
}
