package IfElse.App;
import javax.swing.*;

import IfElse.Service.GenderService;
import Math.Class.Numbers;

public class AssessGender {
	public static void main(String[] args)
	{
		GenderService genderService = new GenderService();
		Numbers numbers = new Numbers(Integer.parseInt(JOptionPane.showInputDialog("Enter Gender 1, 2, 3: ")));
		
		String result = genderService.readGender(numbers.getNumber());
		
		JOptionPane.showMessageDialog(null, "Gender: " + result);
	}
}
