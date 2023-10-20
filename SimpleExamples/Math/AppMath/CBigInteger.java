package Math.AppMath;

import java.math.BigInteger;
import javax.swing.JOptionPane;

public class CBigInteger {

	public static void main(String[] args) {
		
		BigInteger bigInteger = new BigInteger("100000000000000000");
		BigInteger bigInteger2 = new BigInteger("238509784000000000000");
		
		JOptionPane.showMessageDialog(null, bigInteger2.add(bigInteger));
	}
}
