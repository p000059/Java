package Swing.App;

import javax.swing.*;

public class forJP002{
	public static void main(String[] args){
		int count = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número entre 1 e 100."));
		int x = 0;
		
		for(int cout=100; count < 5; count++){
			x += count;
			
			JOptionPane.showMessageDialog(null, "Numero: " + x);
		}
	}
}