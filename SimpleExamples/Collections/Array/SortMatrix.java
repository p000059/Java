package Collections.Array;

import java.util.Random;

import javax.swing.JOptionPane;

public class SortMatrix {

	public static void main(String[] args) {

		int size = 10;
		
		getArray(orderedArray(fillArray(size)));
		
	}

	public static Integer[] fillArray(int size) {

		Integer[] arrayNumber = new Integer[size];
		Random random = new Random();

		for(int i = 0; i < size; i++) {
			
			arrayNumber[i] = random.nextInt(20); 
		}

		return arrayNumber;
	}
	
	public static Integer[] orderedArray(Integer[] array) {
		
		int aux = 0;
		
		for(int i = 0; i < array.length; i++) {
			
			for(int j = 0; j < array.length; j++) {
				
				if(array[j] > array[i]) {
					
					aux = array[i];
					array[i] = array[j];
					array[j] = aux;
				}
			}
		}
		
		return array;
	}
	
	public static void getArray(Integer[] array) {
		
		for(int i: array) {
			
			JOptionPane.showMessageDialog(null, "\nOrdem: " + i);
			System.out.print("\nOrdem: " + i);
		}
	}
}
