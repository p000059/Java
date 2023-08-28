package collections.models.assotiations.nullables;

import collections.models.assotiations.entities.DriverCar;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class DriverCarNull extends DriverCar {

	private static final long serialVersionUID = 1L;

	private String msg;
	
	public String message() {
		
		return "association invalid";
	}
}
