package Math.AppMath;

import javax.swing.JOptionPane;

public class CalcMath {

	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "Potência 10 = " + Math.pow(10.0, 2));
		JOptionPane.showMessageDialog(null, "Arredondamento de 4.49 = " + Math.round(4.49));
		JOptionPane.showMessageDialog(null, "Arredondamento de 4.5 = " + Math.round(4.5));
		JOptionPane.showMessageDialog(null, "Arredondamento de 4.51 = " + Math.round(4.51));
		JOptionPane.showMessageDialog(null, "Número Randônico de 0 a 100 = " + Math.round(Math.random() * 100));
	}
}
