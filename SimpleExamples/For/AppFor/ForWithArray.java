package For.AppFor;

import javax.swing.JOptionPane;

public class ForWithArray {

	public static void main(String[] args) {

		int size = 10;

		int[] vector = new int[size];
		
		for(
				int i = 0; //1ªInstrução 
				i < size; //2ª Instrução
				i++ //3ª Instrução
		) {
			//O loop vai determinar que na posição de execução do laço,
			//seja atribuido o valor de i * 2.
			vector[i] = i * 2;
		}
		
		for(int i = 0; i < size; i++) {
			
			JOptionPane.showMessageDialog(null, "Array = " + vector[i]);
		}

	}
}
