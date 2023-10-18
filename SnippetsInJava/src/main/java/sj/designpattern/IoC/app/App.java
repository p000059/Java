package sj.designpattern.IoC.app;

import javax.swing.JOptionPane;

import sj.designpattern.IoC.models.LowSalary;
import sj.designpattern.IoC.models.Payment;

public class App {

	public static void main(String[] args) {
		
		Payment payment = new Payment(new LowSalary());
		
		double tax = payment.increaseSalary(600.0);
		
		JOptionPane.showMessageDialog(null, tax);
	}
}
