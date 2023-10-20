package DesignPattern.Singleton.App;

import DesignPattern.Singleton.Services.PFactory;

public class AppSingletonLazy {
	
	public static void main(String[] args) {
		
		PFactory.getInstace().newProduct(1);
		PFactory.getInstace().newProduct(2);
		
	}
}
