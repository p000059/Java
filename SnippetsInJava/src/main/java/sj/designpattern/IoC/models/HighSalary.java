package sj.designpattern.IoC.models;

import sj.designpattern.IoC.interfaces.Increase;

public class HighSalary implements Increase {

	@Override
	public double increase(double amount) {
		
		amount = amount + 70.0;
		return amount;
	}

}
