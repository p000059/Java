package String.App;

import javax.swing.JOptionPane;

public class StringConcat {


	public static void main(String[] args) {
		
		String firstName = "John ";
        String lastName = "Doe";
        JOptionPane.showMessageDialog(null, firstName.concat(lastName));
	}
}
