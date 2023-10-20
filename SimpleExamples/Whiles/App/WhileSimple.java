package Whiles.App;
import javax.swing.JOptionPane;

public class WhileSimple {
	
	public static void main(String... args){
		
		int i = 0;
		
		while(i < 10){
			
			JOptionPane.showMessageDialog(null, "Loop -> " + i);
			System.out.print("\nValue = " + i);
			i++;
		}
	}
}
