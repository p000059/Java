package ic.model.nullable;

import ic.model.Fuel;

public class FuelNull extends Fuel {

	private static final long serialVersionUID = 1L;

	@Override
	public String getType() {
		
		return "not registered";
	}
}
