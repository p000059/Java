package Swing.App;

import javax.swing.JOptionPane;

public class EntradaSaida{
    
	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog(null, "Digite as pessoas: ");
		int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a idade deles: "));
		
		JOptionPane.showMessageDialog(null,"Nome: "+ nome+"\nIdade: "+idade); 
	}
}