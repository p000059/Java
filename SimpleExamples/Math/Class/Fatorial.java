package Math.Class;

import javax.swing.JOptionPane;

public class Fatorial {
	
	private int number;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		if(number > 0) {
			this.number = number;
		}
	}

	public void insertNumber() {
		
		this.setNumber(Integer.parseInt(JOptionPane.showInputDialog("Digite um número para o fatorial ou 0(zero) para sair: ")));
		
		JOptionPane.showMessageDialog(null, this.getNumber() + "! => " + this.fatorialNumber());
	}
	
	public int fatorialNumber(){

		int fatorial = 1;
		
		for(int i = 1; i <= this.getNumber() ; i++){
			fatorial = fatorial * i; 
		}

		return fatorial; 

	}
}
