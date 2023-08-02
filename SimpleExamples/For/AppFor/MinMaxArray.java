package For.AppFor;

import java.util.Random;

import javax.swing.JOptionPane;

public class MinMaxArray {

    public static void main(String args[]) {

    	int size = 10; //Esta declaração define o tamanho do array.
        int[] array = new int[size]; //Array do tipo inteiro do tamanho definido pela variável "size".        
        //Variáveis mim e max vão servir para armazenar os respectivos valores encontrados no vetor.
        int min = 100; //Essa variável começa com o valor maior pois será atribuido a ela o valor menor encontrado no array.
        int max = 0;
        Random random = new Random(); //Instância da classe Ramdom.

        for (
        		int i = 0; //1ª Instrução - Define a declaração da variável do tipo inteiro com o valor 0 de início. 
        		i < array.length; //2ª Instrução - Define a condição de parada pelo tamanho total do array, pelo comprimento.
        		i++ //3ª Instrução - Define a cada volta do laço de repetição uma soma +1 ao valor dessa mesma variável, i.
        ) {
            
        	//Aqui é usado a classe de número randômico onde a cada volta do laço de repetição,
        	//um número inteiro é gerado entre 0 e 100 de forma aleatória. 
        	array[i] = random.nextInt(100);			

        	//Durante a execução do laço em todas as suas voltas a condição estabelece que:
        	//Caso o valor da posição do array for maior que o valor da variável max, inicializada por 0,
        	//Esse valor encontrado no array será atribuido à variavel max, sendo testado e atribuído ou não
        	//esse valor até o fim do loop.
            if (array[i] > max) {
                
            	max = array[i];
            } 
            //Na condicional de desvio, será estabelecido que:
            //Se o valor de array[i] na posição 'i' for menor que o valor da variável min, que foi atribuido na declaração desta,
            //será a variável min receberá o valor atual da posição do array.
            else if (array[i] < min) {
                
            	min = array[i];
            }
        }

        for (int item : array) {
            System.out.println("Vetor [ " + item + " ]");
        }

        JOptionPane.showMessageDialog(null, "Valor mínimo: " + min + "\nValor máximo: " + max);
    }
}
