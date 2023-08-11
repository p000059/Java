package classnull.models.Nulls;

import classnull.models.subclass.Car;

public class CarNull extends Car {

	private static final long serialVersionUID = 1L;

	public Double getValue() {

		return 0.0;
	}

	public Integer getSize() {

		return 0;
	}

	public String getNameUser() {

		return "<a href=login.js>Login</a>";
	}
}
