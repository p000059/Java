package collections.models.subclass.nullables;

import collections.models.subclass.entities.Car;

public class CarNull extends Car {

	private static final long serialVersionUID = 1L;

	public String getCar() {
		
		return "Invalid or already registered car";
	}
	
	public boolean isStatus() {
		
		return false;
	}
}
