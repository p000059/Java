package Collections.Array;
import javax.swing.JOptionPane;


public class SumArrayElements {
    
    public static int[] fillArray(int size) {
    	
    	int[] array = new int[size];
    	
    	for(int i = 0; i < size; i++) {
    		
    		array[i] = i * 10; 
    	}
    	
    	return array;
    }
    
    public static int sumArrayElements(int size, int[] array) {
    	
    	int sum = 0;
    	
    	for(int i = 0; i < array.length; i++) {
    		sum += array[i];
    	}
    	
    	return sum;
    }
    
    public static void main(String[] args) {
    	
    	int size = 10; 
    	int[] array = fillArray(size);
    	
    	JOptionPane.showMessageDialog(null, "Total: " + sumArrayElements(size, array));
    }
}
