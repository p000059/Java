package sj.designpattern.singleton.app;

import sj.designpattern.singleton.services.PFactory;

public class AppSingletonLazy {
	
	public static void main(String[] args) {
		
		PFactory.getInstace().newProduct(1);
		PFactory.getInstace().newProduct(2);
		
	}
}
