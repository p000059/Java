package Collections.Array.AppArray;

import javax.swing.JOptionPane;

public class FillShowArray {

	public static void main(String[] args) {

		int size = 5;
		int[] array = new int[size];

		int i = 0;

		do {

			array[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite valores inteiros para preencher o array: "));
			i++;

		} while (i < size);

		for (int j : array) {

			JOptionPane.showMessageDialog(null, "Array: " + j);

		}
	}
}
