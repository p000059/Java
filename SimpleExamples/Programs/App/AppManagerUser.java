package Programs.App;

import javax.swing.JOptionPane;

import Programs.Class.ManagerUser;

public class AppManagerUser {

	public static void main(String[] args) {

		ManagerUser managerUser = new ManagerUser();

		managerUser.createPassword(JOptionPane.showInputDialog("Register a password: "));
		managerUser.createUser(JOptionPane.showInputDialog("Register a User: "));

		try {

			String typedPassword = JOptionPane.showInputDialog("Enter the Password: ");

			if (managerUser.checkPassword(typedPassword) == true) {

				JOptionPane.showMessageDialog(null, "Access Accepted");
			} else {

				JOptionPane.showMessageDialog(null, "Access Denied, try again: ");

				for (int i = 1; i < 5; i++) {

					if (managerUser.checkPassword(
							JOptionPane.showInputDialog("Try - " + i + "\nEnter the password: ")) == true) {

						JOptionPane.showMessageDialog(null, "Access Accepted");
						break;// Stop loop in true condition.
					}
				}
			}

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}
}
