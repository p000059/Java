package DesignPattern.IoC.Class;

import DesignPattern.IoC.Interface.Increase;

public class LowSalary implements Increase {

	@Override
	public double increase(double amount) {
		
		amount = amount + 200.0;
		return amount;
	}

}
