package DesignPattern.Singleton.App;

import DesignPattern.Singleton.Enumerator.EnumFactory;

public class AppSingletonEnum {

	public static void main(String[] args) {
		
		EnumFactory.INSTANCE.newProduct(1);
		EnumFactory.INSTANCE.newProduct(2);
		
	}
}
