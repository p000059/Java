package For.AppFor;

import javax.swing.JOptionPane;

public class ForSimpleCm{
    
    public static void main(String[] args) {
    	
    	//Funcionamento do For explicado linha a linha.
    	
    	/*
    	 	O comando for possui três instruções entre os parênteses que definem como ele será executado.
    	 	
    	 	* A primeira instrução define o valor inicial, a segunda instrução define a condição, e a terceira evita o loop infinito.
    	 	Na linha do comando for, a primeira instrução , (int i = 0; ...) é declara uma variável de início("i") com o valor "zero",
    	 	isso será o valor inicial, ou seja, o ponto de partida da repetição começa com essa declaração.
    	 	
    	 	* Na segunda instrução do laço for, a mesma variável declarada estabelece a condição de parada do laço for que, 
    	 	sem essa condição, o laço de repetição entraria em loop infinito. 
    	 	A execução dessa condição termina quando o valor de "i" for menor que 10, ou seja, 9.
    	 	
    	 	* Na terceira instrução, a variável "i" vai sempre ser somada com mais 1, o i++ é o mesmo que i+1,
    	 	a cada volta do loop a variável recebe a soma o que vai fazer com que ela chegue até condição de parada
    	 	que é o total de 9 finalizando o loop for, sem essa intrução o laço for entraria em loop infinito.
    	 	
    	 	i = 0
    	 	
    	 	i = i + 1
    	 	i += 1
    	 	i++ 
    	*/
    	for(
    			int i = 0; //1ª Instrução 
    			i < 10; //2ª Instrução
    			i++ //3ª Instrução
    	) {
    		
    		/*
    		 * Na linha abaixo uma mensagem será mostrada com o valor de i a cada volta do laço for.
    		 * Cada volta vai armazenar o valor de "i" e será mostrado na tela esse valor.
    		 * Para isso foi utilizado a biblioteca JOpitonPane de Javax.swing.
    		 * 
    		 */
    		JOptionPane.showMessageDialog(null, "Valor da variável 'i' em cada loop do laço for. \ni = " + i);
    		
    		//Na linha abaixo foi utilizado a saída no terminal, onde a visualização mostrará cada valor e o
    		//fixará na tela do console a cada loop.
    		System.out.print("\nValor de i = " + i);
    	}
	}
}
