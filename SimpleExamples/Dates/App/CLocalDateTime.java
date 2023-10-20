package Dates.App;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import javax.swing.JOptionPane;

public class CLocalDateTime {

	public static void main(String[] args) {
		// Representa Data e Hora: 31/07/2022 14:33:00
		
		LocalDateTime localDateTime = LocalDateTime.now();
		
		LocalDate localDate = LocalDate.now();
		LocalTime localTime = LocalTime.now();
		
		JOptionPane.showMessageDialog(null, "Hora e Data: " + localDateTime
				+ "\nInserção Manual 1: " + localDateTime.of(1982, 04, 15, 12, 30, 25)
				+ "\nInserção Manual 2: " + localDateTime.of(localDate, localTime)
				+ "\nAno: " + localDateTime.getYear()
				+ "\nMês: " + localDateTime.getMonth()
				+ "\nNº Mês: " + localDateTime.getMonthValue()
				+ "\nDia: " + localDateTime.getDayOfMonth()
				+ "\nHora: " + localDateTime.getHour()
				+ "\nMinutos: " + localDateTime.getMinute()
				+ "\nSegundos: " + localDateTime.getSecond());

	}

}
