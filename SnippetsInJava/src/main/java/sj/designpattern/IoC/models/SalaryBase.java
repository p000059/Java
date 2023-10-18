package sj.designpattern.IoC.models;

import sj.designpattern.IoC.interfaces.Increase;

public class SalaryBase implements Increase{

	@Override
	public double increase(double amount) {
		
		amount = amount + 150.0;
		return amount;
	}	
}
