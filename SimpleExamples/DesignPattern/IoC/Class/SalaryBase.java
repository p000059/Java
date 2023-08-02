package DesignPattern.IoC.Class;

import DesignPattern.IoC.Interface.Increase;

public class SalaryBase implements Increase{

	@Override
	public double increase(double amount) {
		
		amount = amount + 150.0;
		return amount;
	}	
}
