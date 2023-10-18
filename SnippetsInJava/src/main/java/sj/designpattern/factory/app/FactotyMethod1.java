package sj.designpattern.factory.app;

import javax.swing.JOptionPane;

import sj.designpattern.factory.interfaces.Product;
import sj.designpattern.factory.models.Digital;
import sj.designpattern.factory.interfaces.Category;

public class FactotyMethod1 {

	//Abstract Create
	//Abstract ProductOne
	//Concrete Create
	//Concrete ProductOne
	
	public static void main(String[] args) {
		
		Category category = new Digital();
		Product product = category.newProduct();
		
		JOptionPane.showMessageDialog(null, product.toString());
	}
}
