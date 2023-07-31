package ss.models.subclass.nullable;

import lombok.Getter;
import ss.models.subclass.entity.Email;

@Getter
public class EmailNull extends Email {

	private static final long serialVersionUID = 1L;

	public String getAddress() {
		return "Email not valid or already registered.";
	}
	
	public boolean isStatus() {
		return false;
	}
			
}
