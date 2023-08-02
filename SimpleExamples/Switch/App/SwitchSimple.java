package Switch.App;

import javax.swing.JOptionPane;

public class SwitchSimple {

	public static void main(String[] args) {

		int option = Integer.parseInt(JOptionPane.showInputDialog(
				"Digite: " + "\n1 - Mostrar mensagem de Boas Vindas! " + "\n2 - Digite seu nome: " + "\n3 - Sair: "));

		switch (option) {
		case 1:

			JOptionPane.showMessageDialog(null, "Welcome to the jungle!");
			break;

		case 2:

			String name = JOptionPane.showInputDialog("Digite o seu nome: ");
			JOptionPane.showMessageDialog(null, "Bem vindo " + name + "!");
			break;

		default:
			JOptionPane.showMessageDialog(null, "Saindo...");
			break;

		}

	}
}
