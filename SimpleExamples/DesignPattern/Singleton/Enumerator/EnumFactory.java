package DesignPattern.Singleton.Enumerator;

import DesignPattern.Singleton.Class.ProductOne;
import DesignPattern.Singleton.Class.ProductThree;
import DesignPattern.Singleton.Class.ProductTwo;
import DesignPattern.Singleton.Interface.Products;

public enum EnumFactory {

	INSTANCE;

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
