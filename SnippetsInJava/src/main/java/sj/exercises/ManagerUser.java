package sj.exercises;

import javax.swing.*;

import sj.model.SubClass.User;

public class ManagerUser {
	
	public static void main(String[] args) {

		User user = new User();
		
		user.setUser(JOptionPane.showInputDialog("Register a User: "));
		user.setPassword(JOptionPane.showInputDialog("Register a Password: "));
		
		try {

			String typedPassword = JOptionPane.showInputDialog("Enter the Password: ");

			if (user.getPassword() == typedPassword) {
				
				JOptionPane.showMessageDialog(null, "Access Accepted");
				
			} else {
				
				JOptionPane.showMessageDialog(null, "Access Denied, try again: ");
				
				for (int i = 1; i < 5; i++) {
					
					typedPassword = JOptionPane.showInputDialog("Try - " + i + "\nEnter the password: " ); 
					
					if (typedPassword == user.getPassword()) {
																
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
