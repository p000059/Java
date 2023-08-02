package Swing.App;

import javax.swing.JOptionPane;

public class while001{
	public static void main(String args[]){
		int i = 0;
		
		while(i < 100){
			JOptionPane.showMessageDialog(null, "Numero: " + i);
			i += 5;
		}
	}
}