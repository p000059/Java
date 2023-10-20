package DesignPattern.IoC.Class;

import DesignPattern.IoC.Interface.Increase;

public class AverageSalary implements Increase {

	@Override
	public double increase(double amount) {
		
		amount = amount + 100.0;
		return amount;
	}	
}
