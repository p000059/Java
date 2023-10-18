package sj.designpattern.IoC.models;

import sj.designpattern.IoC.interfaces.Increase;

public class LowSalary implements Increase {

	@Override
	public double increase(double amount) {
		
		amount = amount + 200.0;
		return amount;
	}

}
