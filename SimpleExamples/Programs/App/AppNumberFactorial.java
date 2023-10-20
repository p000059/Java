package Programs.App;

import javax.swing.JOptionPane;

import Programs.Class.NumberFactorial;

public class AppNumberFactorial {

	public static void main(String[] args) {

		NumberFactorial numberFactorial = new NumberFactorial();

		int number = numberFactorial.numberFactor(3);

		JOptionPane.showMessageDialog(null, "Factorial Numbers: " + number);
	}
}
