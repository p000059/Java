package sj.enums.enums;

import javax.swing.JOptionPane;

public class SimpleEnumerable {

	public static void main(String[] args) {

		JOptionPane.showMessageDialog(null, StatusInt.ACTIVE.getValue() + " - Ativo \n" + StatusInt.INACTIVE.getValue() + " - Inativo \n"
				+ StatusInt.EMPTY.getValue() + " - Empty ");
	}

}
