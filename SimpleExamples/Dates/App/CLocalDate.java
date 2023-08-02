package Dates.App;

import java.time.LocalDate;
import java.time.Month;

import javax.swing.JOptionPane;

public class CLocalDate {

	public static void main(String[] args) {
		// A classe LocalDate representa uma data -> 31-07-2022
		
		LocalDate localDate = LocalDate.now();
		
		JOptionPane.showMessageDialog(null, "Data Atual: " + localDate
				+ "\nInserção Manual: " + localDate.of(1982, Month.APRIL, 15) 
				+ "\nAno: " + localDate.getYear()
				+ "\nMês: " + localDate.getMonth()
				+ "\nNº Mês: " + localDate.getMonthValue()
				+ "\nDia: " + localDate.getDayOfMonth());
		
		

	}

}
