package sj.breaks.App;

import java.util.Scanner;

public class LoopAndBreak {
	public static void main(String args[]) {

		int i = 0;

		try (Scanner sc = new Scanner(System.in)) {

			System.out.println("Digite 7: ");
			i = sc.nextInt();

		}

		for (int j = 0; j < 30; j++) {
			
			if (j == i) {
				
				System.out.println("Numero " + i + " digitado.");
				break;
			}

			System.out.println("Valor: " + j);
		}
	}
}
