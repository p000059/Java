package Swing.App;

import javax.swing.*;

public class forJP003{
	public static void main(String args[]){
		int x=0, j=0;
		
		for(x = 0, j = 10; x < j; x++, j--){
			JOptionPane.showMessageDialog(null, x + " e " + j);
		}
	}
}