package DesignPattern.IoC.Service;

import DesignPattern.IoC.Interface.Increase;

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
