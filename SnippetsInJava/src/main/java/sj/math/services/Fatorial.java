package sj.math.services;

import org.springframework.stereotype.Service;

@Service
public class Fatorial {

	public int fatorialNumber(int number) {

		int fatorial = 1;

		for (int i = 1; i <= number; i++) {
			fatorial = fatorial * i;
		}

		return fatorial;
	}
}
