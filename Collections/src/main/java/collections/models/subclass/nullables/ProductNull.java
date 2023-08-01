package collections.models.subclass.nullables;

import collections.models.subclass.entities.Product;

public class ProductNull extends Product {

	private static final long serialVersionUID = 1L;

	public String getCode() {
		
		return "Code not found or invalid record";
	}
	
	public String getName() {
		
		return "Name not found or invalid record";
	}	
}
