package Math.AppMath;

import java.math.BigDecimal;

import javax.swing.JOptionPane;

public class CBigDecimal {

	public static void main(String[] args) {
		
		
		double a = 0.04;
		double b = 0.03;
		double c = a - b;
		
		JOptionPane.showMessageDialog(null, "Resultado: " + c);
		
		BigDecimal _a = new BigDecimal("2.09");
		BigDecimal _b = new BigDecimal("1.03");
		BigDecimal _c = _a.subtract(_b);
		BigDecimal _d = _a.add(_b);
		//BigDecimal _e = _a.divide(_b);
		BigDecimal _f = _a.multiply(_b);
		
		BigDecimal A = new BigDecimal(12345.54321);
		BigDecimal B = new BigDecimal(54321.12345);
		
		
		JOptionPane.showMessageDialog(null, "Subtração: " + _c + "\nSoma: " + _d  + "\nMultiplicação: " + _f + "\nSoma 1: " + A.add(B));
		

	}

}
