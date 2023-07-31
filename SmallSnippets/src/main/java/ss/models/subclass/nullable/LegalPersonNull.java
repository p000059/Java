package ss.models.subclass.nullable;

import ss.models.subclass.entity.LegalPerson;

public class LegalPersonNull extends LegalPerson {

	private static final long serialVersionUID = 1L;

public String getName(){
		
		return "Name Fantasy not valid or already registered.";
	}
	
	public String getCorporateName() {
		
		return "Corporate Name not valid or already registered.";
	}
	
	public boolean isStatus() {
		
		return false;
	}
}
