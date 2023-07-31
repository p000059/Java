package ss.models.subclass.nullable;

import ss.models.subclass.entity.NaturalPerson;

public class NaturalPersonNull extends NaturalPerson {

	private static final long serialVersionUID = 1L;

	public String getName(){
		
		return "Name not valid or already registered.";
	}
	
	public String getLastName() {
		
		return "Last name not valid or already registered.";
	}
	
	public boolean isStatus() {
		
		return false;
	}
}
