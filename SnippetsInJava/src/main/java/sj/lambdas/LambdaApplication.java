package sj.lambdas;

import javax.swing.JOptionPane;

import sj.lambdas.interfaces.NoParameter;
import sj.lambdas.interfaces.OneParameter;
import sj.lambdas.interfaces.TwoParameter;

import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class LambdaApplication {

	public static void main(String[] args) {

		UnaryOperator<Double> doubleUnaryOperator = (n) -> { return 98.5 - n; };
		JOptionPane.showMessageDialog(null, "Valor Unary: " + doubleUnaryOperator.apply(1.5));

		Predicate<Integer> even = value -> value % 2 == 0;
		JOptionPane.showMessageDialog(null, "Valor do número: " + even.test(10));
		
		NoParameter<Double> iFunctionalMethodNoParameter = () -> 98.5;
		JOptionPane.showMessageDialog(null, iFunctionalMethodNoParameter.getValue());
		
		OneParameter<Double> oneParameter = (n) -> 1.0 / n;
		JOptionPane.showMessageDialog(null, "Result = " + oneParameter.getValue(4.0));
		
		TwoParameter<Double> toParameter = (Double n, Double m) -> n * m;
		JOptionPane.showMessageDialog(null, toParameter.getValue(10.0, 5.0));
	}
}
