package Math.AppMath;

import javax.swing.JOptionPane;

import Math.Class.Fatorial;

public class AppFatorial {

	public static void main(String[] args) {

		Fatorial fatorial = new Fatorial();

		do {

			try {
				
				fatorial.insertNumber();

			}
			catch(NumberFormatException e) {
				
				JOptionPane.showMessageDialog(null, "Numero inválido, tente novamente!");
				fatorial.insertNumber();
			}

		}while(fatorial.getNumber() > 0);
		
	}

}
