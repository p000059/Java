package IfElse.App;
import javax.swing.*;

import IfElse.Service.NumberService;
import Math.Class.Numbers;

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
