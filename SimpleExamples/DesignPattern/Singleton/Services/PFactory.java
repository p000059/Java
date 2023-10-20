package DesignPattern.Singleton.Services;

import DesignPattern.Singleton.Class.ProductOne;
import DesignPattern.Singleton.Class.ProductThree;
import DesignPattern.Singleton.Class.ProductTwo;
import DesignPattern.Singleton.Interface.Products;

public class PFactory {

	private static PFactory instance;
	
	private PFactory() {
		
	}
	
	public static PFactory getInstace() {
		
		if(instance == null) {
			
			instance = new PFactory();
		}
		
		return instance;
	}
	
	public Products newProduct(int typeProduct) {
		
		switch (typeProduct) {
		
		case 1:			
			return new ProductOne();
			
		case 2:
			return new ProductTwo();
			
		case 3:
			return new ProductThree();
			
		default:
			return (Products) new IllegalArgumentException();
		}
	}
}
