package Generics.App;

import javax.swing.JOptionPane;

import Generics.Class.TwoGenericTypes;

public class AppGeneric {

    public static void main(String[] args) {
		
    	TwoGenericTypes<Integer, String> twoGenericTypes = new TwoGenericTypes<>(1,"Hello Girls!");
    	
    	JOptionPane.showMessageDialog(null, 
    			"Type: " + twoGenericTypes.readTypeT() 
    			+ "\nValue: " + twoGenericTypes.getObjectT()
    			+ "\n\nType: " + twoGenericTypes.readTypeV()
    			+ "\nValue: " + twoGenericTypes.getObjectV()
    	);
	}
}
