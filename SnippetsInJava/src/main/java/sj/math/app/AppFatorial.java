package sj.math.app;

import sj.math.models.Numbers;
import sj.math.services.Fatorial;

public class AppFatorial {

	public static void main(String[] args) {

		Fatorial fatorial = new Fatorial();
		Numbers numbers = new Numbers();

		do {

			try {

				numbers.setNumber(2);

				fatorial.fatorialNumber(numbers.getNumber());

			} catch (NumberFormatException e) {

				e.getMessage();
			}

		} while (numbers.getNumber() > 0);

	}

}
