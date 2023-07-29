package classnull.models.subclass;

import jakarta.servlet.http.HttpServletRequest;

public class CookieFactory {

	public static Car createShoppingCar(HttpServletRequest request) {

		if (request == null) {

			return new CarNull();
		} else {

			return new Car();
		}
	}
}
