package Collections.Array;
import javax.swing.JOptionPane;

public class SumElementsTwoArray {

	
	public static int[] fillArray(int size) {
		
		int[] array = new int[size];
		
		for(int i = 0; i < size; i++) {
			
			array[i] = i * 10;
		}
		
		return array;
	}
	
	public static int sumArray(int[] array) {
		
		int elements = 0;
		
		for(int i = 0; i < array.length; i++) {
			
			elements += array[i];
		}
		
		return elements;
	}
	
	public static int sumTwoArray(int[] arrayOne, int[] arrayTwo) {
		
		int resultSumArrays = 0;
		
		for(int i = 0; i < arrayOne.length; i++) {
			
			for(int j = 0; j < arrayTwo.length; j++) {
				
				resultSumArrays += arrayTwo[j];
			}
			
			resultSumArrays += arrayOne[i];
		}
		
		return resultSumArrays;
	}
	
	public static int[] sumTwoArray(int size, int[] arrayOne, int[] arrayTwo) {
		
		int[] sumArray = new int[size];
		
		for(int i = 0; i < size; i++) {
			
			sumArray[i] = arrayOne[i] + arrayTwo[i];			
		}
		
		return sumArray;
	}
	
	public static void main(String[] args) {
		
		int size = 10;
		int[] arrayOne = fillArray(size);
		int[] arrayTwo = fillArray(size);
		
		for(int i: sumTwoArray(size, arrayOne, arrayTwo)) {
			
			JOptionPane.showMessageDialog(null, "Result: " + i);
		}
		
	}

}
