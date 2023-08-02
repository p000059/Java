package IfElse.App;
import javax.swing.JOptionPane;

public class FindNumber {

	public static void main(String[] args) {

		int i = 0;
		int size = 10;
		int[] arrayChar = new int[size];

		arrayChar[0] = 3;
		arrayChar[1] = 8;
		arrayChar[2] = 1;
		arrayChar[3] = 2;
		arrayChar[4] = 9;
		arrayChar[5] = 6;
		arrayChar[6] = 4;
		arrayChar[7] = 7;
		arrayChar[8] = 5;

		int in = Integer.parseInt(JOptionPane.showInputDialog("Digite um número no teclado entre 1 e 50: "));

		while (i < arrayChar.length) {

			if (arrayChar[i] == in) {

				JOptionPane.showMessageDialog(null, "Número = " + in);
				break;
			}

			i++;
		}
	}
}
