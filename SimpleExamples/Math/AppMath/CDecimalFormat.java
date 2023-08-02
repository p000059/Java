package Math.AppMath;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

import javax.swing.JOptionPane;

public class CDecimalFormat {

	public static void main(String[] args) {
		
		String cDefault = "###,###.##";
		DecimalFormat decimalFormat = new DecimalFormat(cDefault);		
		JOptionPane.showMessageDialog(null, decimalFormat.format(12345678.101));
		
		DecimalFormatSymbols dfs = new DecimalFormatSymbols(new Locale("pt", "Brazil"));
		dfs.setDecimalSeparator(',');
		dfs.setGroupingSeparator('.');
		
		String cDefault2 = "###,###.##";
		decimalFormat = new DecimalFormat(cDefault2, dfs);
		JOptionPane.showMessageDialog(null, decimalFormat.format(12345678.101));
	}

}
