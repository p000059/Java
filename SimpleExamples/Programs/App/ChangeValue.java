package Programs.App;

import javax.swing.JOptionPane;

public class ChangeValue {

	public static void main(String[] args) {

		int x = 10;
		int y = 30;
		int auxiliary = 0;

		JOptionPane.showMessageDialog(null, "\nAuxiliary: " + auxiliary + "\nVariable X: " + x + "\nVariable Y: " + y);

		JOptionPane.showMessageDialog(null, "\nValue of the variable X: " + x);
		auxiliary = x;
		JOptionPane.showMessageDialog(null, "\nThe variable 'auxiliary' receives the value of the variable 'x': " + auxiliary);

		x = y;
		JOptionPane.showMessageDialog(null, "\nVariable 'x' receives the value of variable 'y': " + x);

		y = auxiliary;
		JOptionPane.showMessageDialog(null, "\nVariable 'y' receives the value of variable 'auxiliary': " + y);

		JOptionPane.showMessageDialog(null, "\nAuxiliary: " + auxiliary + "\nVariable X: " + x + "\nVariable Y: " + y);

	}
}
