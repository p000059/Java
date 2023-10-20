package DesignPattern.IoC.Class;

import DesignPattern.IoC.Interface.Increase;

public class HighSalary implements Increase {

	@Override
	public double increase(double amount) {
		
		amount = amount + 70.0;
		return amount;
	}

}
