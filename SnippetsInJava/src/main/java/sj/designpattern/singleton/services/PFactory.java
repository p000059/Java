package sj.designpattern.singleton.services;

import sj.designpattern.singleton.interfaces.Products;
import sj.designpattern.singleton.models.ProductOne;
import sj.designpattern.singleton.models.ProductThree;
import sj.designpattern.singleton.models.ProductTwo;

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
