package For.AppFor;
import javax.swing.JOptionPane;

public class ForAndForeach {

	public static void main(String[] args) {
		
		int size = 10;
		int[] array = new int[size];
		
		for(int i = 0; i < size; i++) {
			
			array[i] = i * 10;
		}
		
		for(int i: array) {
			
			JOptionPane.showMessageDialog(null, "Array = " + i);
			System.out.print("\nArray = " + i);
		}
	}
}
