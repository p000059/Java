package Whiles.App;
import javax.swing.JOptionPane;

import Math.Class.Numbers;

public class WhileOption {

	public static void main(String[] args) {

		Numbers numbers = new Numbers();
		int number = 0;

		while (!(number == 3)) {

			numbers.setNumber(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número ou 3 para sair: ")));

			if(numbers.getNumber() !=3) {
				
				JOptionPane.showMessageDialog(null, "O número digitado foi: " + numbers.getNumber());
			} else {
				
				break;
			}
		}
	}
}
