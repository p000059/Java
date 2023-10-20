package CScanner.App;

import java.util.Scanner;

public class ClassScanner {

	public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);
        int numeroInteiro = 0;
        double numeroReal = 0.0;
        String palavra = " ";
        boolean logico = true;

        System.out.print("Digite um numero inteiro: ");
        numeroInteiro = scanner.nextInt();

        System.out.print("Digite um número real: ");
        numeroReal = scanner.nextDouble();

        System.out.print("Entre com uma palavra: ");
        palavra = scanner.next();

        
        System.out.println();
        System.out.print("\nNumero Inteiro = " + numeroInteiro);
        System.out.print("\nNumero Real = " + numeroReal);
        System.out.print("\nPalavra = " + palavra);
        System.out.println();

	}

}
