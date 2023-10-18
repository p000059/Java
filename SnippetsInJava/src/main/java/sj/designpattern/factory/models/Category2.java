package sj.designpattern.factory.models;

import sj.designpattern.factory.interfaces.Product2;

public class Category2 {

	public Product2 newProduct() {
		
		return new PhysicalProduct2();
	}
}
