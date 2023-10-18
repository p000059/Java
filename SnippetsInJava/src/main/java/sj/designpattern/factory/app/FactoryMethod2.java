package sj.designpattern.factory.app;

import javax.swing.JOptionPane;

import sj.designpattern.factory.interfaces.Product2;
import sj.designpattern.factory.models.Category2;

public class FactoryMethod2 {

	//Abstract ProductOne -> Interface: Product2
	//Concrete ProductOne -> Two Class: DigitalProduct2 and PhysicalProduct2
	//Concrete Creator -> Two Class: Category2 and DigitalCategory
	
	public static void main(String[] args) {
		
		Category2 category2 = new Category2();
		Product2 product2 = category2.newProduct();
		
		JOptionPane.showMessageDialog(null, product2.toString());
	}
}
