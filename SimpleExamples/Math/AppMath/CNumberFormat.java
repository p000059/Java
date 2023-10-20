package Math.AppMath;

import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Locale;

import javax.swing.JOptionPane;

public class CNumberFormat {

	public static void main(String[] args) {
		
		//Numbers
		Locale locale = new Locale("en", "United States");
		NumberFormat numberFormat = NumberFormat.getInstance(locale);
		String sNumber = numberFormat.format(1121100.99);
		JOptionPane.showMessageDialog(null, "Numero USA: " + sNumber);
		
		
		locale = new Locale("pt", "Brazil");
		numberFormat = NumberFormat.getInstance(locale);
		String sNumber1 = numberFormat.format(1121100.99);
		JOptionPane.showMessageDialog(null, "Numero BRA: " + sNumber1);
		

		//Coin
		locale = new Locale("en" , "United States");
		NumberFormat numFormatCoin = NumberFormat.getCurrencyInstance(locale);
		String sValue = numFormatCoin.format(Float.parseFloat("100.99"));
		JOptionPane.showMessageDialog(null, "Moeda Dolar: " + sValue);
		
		locale = new Locale("pt", "Brazil");
		numFormatCoin = NumberFormat.getCurrencyInstance(locale);
		sValue = numFormatCoin.format(100.99);
		JOptionPane.showMessageDialog(null, "Moeda Brasil: " + sValue);
		
		
		//Percentage
		NumberFormat numFormatPercentage = NumberFormat.getPercentInstance();
		numFormatPercentage.setMinimumFractionDigits(2);
		String sPercentage = numFormatPercentage.format(99.9872);
		JOptionPane.showMessageDialog(null, "99,98 / 100 = " + sPercentage);
		
		//Rounding
		numberFormat = NumberFormat.getInstance();
		numberFormat.setRoundingMode(RoundingMode.HALF_UP);
		JOptionPane.showMessageDialog(null, "Arredondamento: " + numberFormat.format(100.98752));
	}

}
