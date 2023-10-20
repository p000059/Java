package DesignPattern.IoC.App;

import javax.swing.JOptionPane;
import DesignPattern.IoC.Class.HighSalary;
import DesignPattern.IoC.Class.LowSalary;
import DesignPattern.IoC.Service.Payment;

public class App {

	public static void main(String[] args) {
		
		Payment payment = new Payment(new LowSalary());
		
		double tax = payment.increaseSalary(600.0);
		
		JOptionPane.showMessageDialog(null, tax);
	}
}
