package sj.ifelse.app;
import javax.swing.*;

import sj.ifelse.services.GenderService;
import sj.math.models.Numbers;

public class AssessGender {
	public static void main(String[] args)
	{
		GenderService genderService = new GenderService();
		Numbers numbers = new Numbers(Integer.parseInt(JOptionPane.showInputDialog("Enter Gender 1, 2, 3: ")));
		
		String result = genderService.readGender(numbers.getNumber());
		
		JOptionPane.showMessageDialog(null, "Gender: " + result);
	}
}
