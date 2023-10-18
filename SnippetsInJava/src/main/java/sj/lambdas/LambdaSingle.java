package sj.lambdas;

import javax.swing.JOptionPane;

import sj.lambdas.interfaces.NoParameter;
import sj.lambdas.interfaces.OneParameter;

public class LambdaSingle {

	public static void main(String[] args) {

		NoParameter<Double> iNumber;
		OneParameter<Double> iNumberParam;

		iNumber = () -> 100.5;
		iNumberParam = (n) -> 100.5 + n;

		JOptionPane.showMessageDialog(null, "Lambda sem Parâmetro: " + iNumber.getValue() + "\nLambda com Parâmetro: "
				+ iNumberParam.getValue(50.0));

	}
}
