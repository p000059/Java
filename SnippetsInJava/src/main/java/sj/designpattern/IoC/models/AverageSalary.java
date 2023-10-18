package sj.designpattern.IoC.models;

import sj.designpattern.IoC.interfaces.Increase;

public class AverageSalary implements Increase {

	@Override
	public double increase(double amount) {
		
		amount = amount + 100.0;
		return amount;
	}	
}
