package DesignPattern.Factory.Class;

import DesignPattern.Factory.Interface.Product2;

public class DigitalCategory extends Category2{

	public Product2 newProduct() {
		
		return new DigitalProduct2();
	}
}
