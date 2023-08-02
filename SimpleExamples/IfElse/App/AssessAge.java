package IfElse.App;
import javax.swing.*;

import IfElse.Class.Age;
import IfElse.Service.AgeService;

public class AssessAge 
{
	public static void main(String[]args)
	{
		Age age = new Age(Integer.parseInt(JOptionPane.showInputDialog("Enter with age: ")));
		AgeService ageService = new AgeService();
		
		String result = ageService.assessAge(age.getAge());
		
		JOptionPane.showMessageDialog(null, "Definition: " + result);
	}
}
