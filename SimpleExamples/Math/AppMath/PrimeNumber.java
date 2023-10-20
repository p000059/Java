package Math.AppMath;

import javax.swing.JOptionPane;

public class PrimeNumber {

	// Prime number is divisible by one or itself.
	public String checkPrimeNumber(int number) {

		if ((number > 2) && (number % 2 == 1) && (number % number == 0)) {
			return "It's primer number.";
		} else {
			return "It's not a prime number.";
		}
	}

	// Prime number is divisible by one or itself.
	// Two, unique even prime number.
	public boolean chechPrimeNumberInLoop(int number) {
		for (int i = 2; i < number; i++) {
			
			// Numbers with division remainder equal to 1 is odd.
			if (number % i == 1) {
									
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		
		PrimeNumber primeNumber = new PrimeNumber();
		
		Boolean check = primeNumber.chechPrimeNumberInLoop(5);
		String result = primeNumber.checkPrimeNumber(5);
		
		JOptionPane.showMessageDialog(null, "True or False: " + check + "\n" + result);
	}
}
