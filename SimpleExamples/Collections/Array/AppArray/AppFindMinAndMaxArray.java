package Collections.Array.AppArray;

import javax.swing.JOptionPane;
import Collections.Array.ClassArray.ClassJavaMaxMinNumber;

public class AppFindMinAndMaxArray {
    
    public static void main(String[] args) {
		
    	int[] arrayFill = ClassJavaMaxMinNumber.arrayFilled();
    	int min = ClassJavaMaxMinNumber.findMin(arrayFill);
    	int max = ClassJavaMaxMinNumber.findMax(arrayFill);
    	
    	JOptionPane.showMessageDialog(null, "Maior número: " + max + "\nMenor número: " + min);
	}
}
