package Collections.Array.ClassArray;

import javax.swing.JOptionPane;

public class MakeInverseArray {

	
	public static Integer[] fillArray(int size) {
		
		Integer[] arrayNumber = new Integer[size];
		
		for(int i = 0; i < size; i++) {
			
			arrayNumber[i] = i * 10;
		}
		
		return arrayNumber;
	}
	
	public static Integer[] copyInverseArray(int size, Integer[] arrayNumber) {
		
		Integer[] inverseArray = new Integer[11];
		int aux = size;
		
		for(int i = 0; i < arrayNumber.length; i++) {			
			
			inverseArray[aux-i] = arrayNumber[i];			
		}
		
		return inverseArray;
	}

	public static void showArray(Integer[] array) {
		
		for(Integer i: array) {
			
			JOptionPane.showMessageDialog(null,"\nOrdem: " + i);
			System.out.print("\nOrdem: " + i);
		}
	}
}
