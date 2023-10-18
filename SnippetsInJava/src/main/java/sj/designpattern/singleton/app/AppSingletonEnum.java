package sj.designpattern.singleton.app;

import sj.designpattern.singleton.enums.EnumFactory;

public class AppSingletonEnum {

	public static void main(String[] args) {
		
		EnumFactory.INSTANCE.newProduct(1);
		EnumFactory.INSTANCE.newProduct(2);
		
	}
}
