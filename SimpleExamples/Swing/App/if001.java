package Swing.App;

import javax.swing.*;

public class if001{
	public static void main(String[] args){
		int x = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um valor entre 1 e 10."));
		int y = 11;
		
		if(x < y){
			JOptionPane.showMessageDialog(null, "O número digitado foi: " + x);
		}
		else 
			if(x > y){
				JOptionPane.showMessageDialog(null, "Número maior que 10.");
			}
	}
}