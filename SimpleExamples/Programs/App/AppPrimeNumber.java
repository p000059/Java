package Programs.App;

import javax.swing.JOptionPane;

import Programs.Class.PrimeNumber;

public class AppPrimeNumber {

	public static void main(String[] args) {

		PrimeNumber primeNumber = new PrimeNumber();

		Boolean check = primeNumber.chechPrimeNumberInLoop(5);
		String result = primeNumber.checkPrimeNumber(5);

		JOptionPane.showMessageDialog(null, "True or False: " + check + "\n" + result);
	}
}
