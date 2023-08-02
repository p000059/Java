package IfElse.Service;

public class NumberService {

	public String evenOrOdd(Integer number) {

		if (number % 2 == 0) {

			return "Even";

		} else if (number % 2 == 1) {

			return "Odd";

		} else {

			return "Invalid Numbers!";
		}
	}

	public String evaluatesNumber(Integer number) {

		if (number < 10) {

			return "Numero menor que 10 -> " + number;
			
		} else if (number == 10) {

			return "Número igual a 10.";
			
		} else {
			return "Número digitado maior que 10 -> " + number;
		}
	}
}
