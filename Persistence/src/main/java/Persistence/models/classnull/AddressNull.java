package Persistence.models.classnull;

import Persistence.models.entities.Address;

public class AddressNull extends Address {

	private static final long serialVersionUID = 1L;

	@Override
	public String getAddress() {

		return "address already registered or non-existent";
	}

	@Override
	public Boolean getStatus() {

		return null;
	}
}
