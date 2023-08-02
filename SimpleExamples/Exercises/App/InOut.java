package Exercises.App;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class InOut {

	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {

			int numeroInteiro = 0;
			double numeroReal = 0.0;
			String literal = " ";

			System.out.print("\nDigite um número: ");
			numeroInteiro = scanner.nextInt();
			
			System.out.print("\nDigite uma palavra: ");
			literal = scanner.next();
			System.out.print("\n");

			System.out.println("Inteiro = " + numeroInteiro);
			System.out.println("Real = " + numeroReal);
			System.out.println("Literal / String: " + literal);

		} catch (Exception e) {

			JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
		}
	}
}
