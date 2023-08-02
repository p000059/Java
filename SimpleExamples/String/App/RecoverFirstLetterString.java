package String.App;

import javax.swing.JOptionPane;

public class RecoverFirstLetterString {

	public static void main(String[] args) {

		String option = JOptionPane.showInputDialog("Digite: SIM ou NAO");

		if (option.charAt(0) == 'S') {

			JOptionPane.showMessageDialog(null, "Você digitou: " + option);
		} else {

			JOptionPane.showMessageDialog(null, "Você digitou: " + option);
		}
	}
}
