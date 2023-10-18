package sj.designpattern.factory.app;

import javax.swing.JOptionPane;

import sj.designpattern.factory.interfaces.Product3;
import sj.designpattern.factory.models.Category3;

public class FactoryMethod3 {

	//Concrete Creator With Parameter -> Category3
	//Abstract ProductOne -> Interface: Product3
	//Concrete ProductOne -> StandartProduct3, DigitalProduct3 and PhysicalProduct3
	
	public static void main(String[] args) {
		
		Category3 category3 = new Category3();
		Product3 product3 = category3.newProduct(1);
		
		JOptionPane.showMessageDialog(null, product3.toString());
	}
}
