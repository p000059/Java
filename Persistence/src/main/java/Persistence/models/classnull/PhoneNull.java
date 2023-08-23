package Persistence.models.classnull;

import Persistence.models.entities.Phone;

public class PhoneNull extends Phone {

	private static final long serialVersionUID = 1L;

	@Override
	public String getNumber() {
		
		return "phone already registered or non-existent, check data";
	}
	
	@Override
	public Boolean getStatus() {
		
		return false;
	}
}
