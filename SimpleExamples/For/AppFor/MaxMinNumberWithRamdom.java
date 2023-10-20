package For.AppFor;

import java.util.Random;
import javax.swing.JOptionPane;

public class MaxMinNumberWithRamdom {

    public static void main(String args[]) {

        Random gerador = new Random();
        int size = 10; //Variável que determina o tamanho do array.
        int[] vet = new int[size]; //Declaração do array do tipo inteiro com o seu tamanho determinado pela variável size.
        //Variáveis mim e max vão servir para armazenar os respectivos valores encontrados no vetor gerados pela classe Ramdom.
        int min = 100;
        int max = 0;

        for (int i = 0; i < vet.length; i++) {
            vet[i] = gerador.nextInt(100); //A instância da classe Ramdom vai executar o método nextInt() com o limite até 100.			

            if (vet[i] > max) {
                
            	max = vet[i];
            	
            } else if (vet[i] < min) {
                
            	min = vet[i];
            }
        }

        for (int item : vet) {
            System.out.println("Vetor [ " + item + " ]");
        }

        JOptionPane.showMessageDialog(null, "Maior número: " + max + "\nMenor número: " + min);

    }
}
