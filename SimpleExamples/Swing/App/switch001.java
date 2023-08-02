package Swing.App;

import javax.swing.*;

public class switch001{
	public static void main(String[] args){
		int x = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um numero entre 1 e 3: "));
		
		switch(x){
			case 1:
				JOptionPane.showMessageDialog(null, "O numero digitado foi: " + x);
			break;
			
			case 2:
				JOptionPane.showMessageDialog(null, "O numero digitado foi: " + x);
			break;
			
			case 3:
				JOptionPane.showMessageDialog(null, "O numero digitado foi: " + x);
			break;
			
			default:
				JOptionPane.showMessageDialog(null, "O numero digitado foi: " + x + ". \nNao ha opcao para esse numero");
			break;
		}
	}
}