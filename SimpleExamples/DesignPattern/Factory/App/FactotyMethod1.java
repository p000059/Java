package DesignPattern.Factory.App;

import javax.swing.JOptionPane;

import DesignPattern.Factory.Class.Digital;
import DesignPattern.Factory.Interface.Category;
import DesignPattern.Factory.Interface.Product;

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
