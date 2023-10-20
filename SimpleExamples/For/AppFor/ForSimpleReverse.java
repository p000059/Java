package For.AppFor;

import javax.swing.JOptionPane;

public class ForSimpleReverse {
	public static void main(String[] args) {

		// Funcionamento do For explicado linha a linha.

		/*
		 * O comando for possui três instruções entre os parênteses que definem como ele
		 * será executado.
		 * 
		 * A primeira instrução define o valor inicial, a segunda instrução define a
		 * condição, e a terceira evita o loop infinito. Na linha do comando for, a
		 * primeira instrução , (int i = 10; ...) é declara uma variável com do tipo int com o nome "i"
		 * e com o valor inicial de "dez", ou seja, o ponto de partida da
		 * repetição começa com essa declaração.
		 * 
		 * Na segunda instrução do laço for, a mesma variável declarada estabelece a
		 * condição de parada do laço, sem essa condição, o laço de repetição
		 * entraria em loop infinito. A execução dessa condição termina quando o valor
		 * de "i" for maior que 0, ou seja, 1.
		 * 
		 * Na terceira instrução, a variável "i" vai sempre ser subtraida com menos 1, o i--
		 * é o mesmo que i-1, a cada loop a variável tem -1 subtraido do seu valor inicial de 10,
		 * sem essa intrução o laço também entraria em loop infinito.
		 * 
		 * i = i - 1 
		 * i -= 1 
		 * i--
		 */

		for (
				int i = 10; //1ª Instrução 
				i > 0; //2ª Instrução
				i-- //3ª Instrução
		) {

			JOptionPane.showMessageDialog(null, "Valor de 'i' : " + i);
		}
	}
}
