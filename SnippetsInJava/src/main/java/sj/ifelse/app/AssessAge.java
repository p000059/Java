package sj.ifelse.app;
import javax.swing.*;

import sj.ifelse.models.Age;
import sj.ifelse.services.AgeService;

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
