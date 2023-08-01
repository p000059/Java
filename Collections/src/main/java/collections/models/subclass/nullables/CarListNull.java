package collections.models.subclass.nullables;

import collections.models.subclass.entities.CarList;

public class CarListNull extends CarList {

	private static final long serialVersionUID = 1L;

	public String getCar() {
		
		return "Invalid or already registered car";
	}
	
	public boolean isStatus() {
		
		return false;
	}
}
