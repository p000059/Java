package classnull.models.Nulls;

import classnull.models.subclass.Phone;

public class PhoneNull extends Phone{

	private static final long serialVersionUID = 1L;

	public String getNumber() {
		
		return "phone does not exist or is invalid";
	}
}
