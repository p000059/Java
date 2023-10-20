package DesignPattern.Factory.Class;

import DesignPattern.Factory.Interface.Product3;

public class Category3 {
	
	public Product3 newProduct(int typeProduct) {
		
		switch (typeProduct) {
		
		case 1:			
			return new StandartProduct3();

		case 2:
			return new DigitalProduct3();
		
		case 3:
			return new PhysicalProduct3();
			
		default:
			throw new IllegalArgumentException();
		}
	}
}
