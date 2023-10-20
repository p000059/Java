package DesignPattern.Factory.Class;

import DesignPattern.Factory.Interface.Category;
import DesignPattern.Factory.Interface.Product;

public class Digital implements Category {

	@Override
	public Product newProduct() {
		
		return new DigitalProduct();
	}	
}
