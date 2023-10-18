package sj.ifelse.app;
import javax.swing.*;

import sj.ifelse.services.NumberService;
import sj.math.models.Numbers;

public class EvenOddNumber
{
	public static void main(String[] args)
	{
		
		NumberService numberService = new NumberService();
		Numbers number = new Numbers(Integer.parseInt(JOptionPane.showInputDialog("Enter a number: ")));
		
		String result = numberService.evenOrOdd(number.getNumber()); 
		
		JOptionPane.showMessageDialog(null, "Number: " + result);
	}
}
