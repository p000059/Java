package IfElse.App;
import javax.swing.*;

import IfElse.Class.Salary;
import IfElse.Service.SalaryRule;

public class SalaryIncrease 
{
	public static void main(String[] args){
		
		double salaryFinal = 0.0;
		Salary salary = new Salary();
		SalaryRule salaryRule = new SalaryRule();
		
		salary.setSalary(Float.parseFloat(JOptionPane.showInputDialog("Enter the SalaryBase: ")));
		double increase = 50.0;
		
		salaryFinal = salaryRule.salary(salary.getSalary(), increase);
		
		JOptionPane.showMessageDialog(null, "SalaryBase = " + salaryFinal);
	}
}
