package Swing.App;

import javax.swing.*;

public class forJP004{
	public static void main(String args[]){
		int sum = 0, i;
		for(i = 0; i <=5; sum += i++ * 3);
		
		JOptionPane.showMessageDialog(null, "Sum is: "+ sum);
	}
}