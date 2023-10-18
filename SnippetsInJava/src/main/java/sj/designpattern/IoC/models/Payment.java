package sj.designpattern.IoC.models;

import sj.designpattern.IoC.interfaces.Increase;

public class Payment {

	private Increase increase;
	
	public Payment(Increase increase) {
		
		this.increase = increase;
	}
	
	public double increaseSalary(double amount) {
		
		amount = increase.increase(amount);
		return amount;
	}
}
