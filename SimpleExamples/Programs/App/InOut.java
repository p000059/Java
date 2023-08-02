package Programs.App;

import javax.swing.JOptionPane;

public class InOut {

	public static void main(String[] args) {

		try {

			int numberInt = 0;
			double numberDouble = 0.0;
			String word = " ";

			numberInt = Integer.parseInt(JOptionPane.showInputDialog("\nDigite um número inteiro: "));
			numberDouble = Double.parseDouble(JOptionPane.showInputDialog("\nDigite um número Real: "));
			word = JOptionPane.showInputDialog("Digite uma Palavra: ");

			JOptionPane.showMessageDialog(null, "\n\nNumero Inteiro: " + numberInt + "\nNumero Real: " + numberDouble + "\nPalavra: " + word);

		} catch (Exception e) {

			JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
		}
	}
}
