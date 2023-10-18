package sj.ifelse.app;
import javax.swing.*;

import sj.ifelse.services.NumberService;
import sj.math.models.Numbers;

public class TernaryConditional
{
	public static void main(String[] args)
	{
		NumberService numberService = new NumberService();
		Numbers numbers = new Numbers(Integer.parseInt(JOptionPane.showInputDialog("Enter a number: ")));
		
		String result = (numbers.getNumber() != 0) ? numberService.evenOrOdd(numbers.getNumber()) : "Number Invalid";
		
		JOptionPane.showMessageDialog(null, result);
	}
}
