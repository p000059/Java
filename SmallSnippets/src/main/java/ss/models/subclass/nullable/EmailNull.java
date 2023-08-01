package ss.models.subclass.nullable;

import lombok.Setter;
import ss.models.subclass.entity.Email;

@Setter
public class EmailNull extends Email {

	private static final long serialVersionUID = 1L;
	
	public String getAddress() {
		return "Email not valid or already registered.";
	}
	
	public boolean isStatus() {
		return false;
	}
			
}
