package Dates.App;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.swing.JOptionPane;

public class CDateDefault {

	public static void main(String[] args) {
		
		LocalDate localDate = LocalDate.now();
		JOptionPane.showMessageDialog(null, localDate);
		
		localDate = LocalDate.of(2022, 07, 31);
		JOptionPane.showMessageDialog(null, localDate);
		
		localDate = LocalDate.parse("2022-07-31");
		JOptionPane.showMessageDialog(null, localDate);
		
		LocalTime localTime = LocalTime.now();
		JOptionPane.showMessageDialog(null, "LocalTime " + localTime);

	}

}
