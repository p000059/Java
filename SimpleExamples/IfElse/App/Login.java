package IfElse.App;
import javax.swing.*;

import IfElse.Class.UserPassword;

public class Login
{
	public static void main(String[] args)
	{
		UserPassword userpass = new UserPassword();
		
		String name = JOptionPane.showInputDialog("Enter with user: ");
		String password = JOptionPane.showInputDialog("Enter a password: ");
		
		userpass.setName(name);
		userpass.setPassword(password);
		
		if(name.equalsIgnoreCase("Admin") || name.equalsIgnoreCase("Administrator"))
		{
			
			JOptionPane.showMessageDialog(null, "Sucess");
			
		} else {
			
			JOptionPane.showMessageDialog(null, "User Invalid!");
		}
	}
}
