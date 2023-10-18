package sj.designpattern.factory.models;

import sj.designpattern.factory.interfaces.Category;
import sj.designpattern.factory.interfaces.Product;

public class Digital implements Category {

	@Override
	public Product newProduct() {
		
		return new DigitalProduct();
	}	
}
