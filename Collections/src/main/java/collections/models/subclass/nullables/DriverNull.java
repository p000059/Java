package collections.models.subclass.nullables;

import collections.models.subclass.entities.Driver;

public class DriverNull extends Driver {

	private static final long serialVersionUID = 1L;

	public String getName() {
		
		return "Invalid or already registered driver!";
	}
	
	public boolean isStatus() {
		
		return false;
	}
}
