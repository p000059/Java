package Dates.App;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import javax.swing.JOptionPane;

public class InOutDateTime {

	public static void main(String[] args) {
		
		//Dates
		String birthDate = "01082022";//This information(String) comes from the front-end.
		DateTimeFormatter dateTimeFormatter_PatternDate = DateTimeFormatter.ofPattern("ddMMyyyy");
		LocalDate localDate = LocalDate.parse(birthDate, dateTimeFormatter_PatternDate);
		
		//Hour
		String birthHour = "143015"; //This information(String) comes from the front-end.		
		DateTimeFormatter dateTimeFormatter_PatternHour = DateTimeFormatter.ofPattern("HHmmss");
		LocalTime localTime = LocalTime.parse(birthHour, dateTimeFormatter_PatternHour);
		
		//Dates and Hour
		String birthDateHour = "20160304113015"; //This information(String) comes from the front-end.
		DateTimeFormatter dateTimeFormatter_PatternDateHour = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
		LocalDateTime localDateTime = LocalDateTime.parse(birthDateHour, dateTimeFormatter_PatternDateHour);
		
		//Out
		JOptionPane.showMessageDialog(null, "De String para LocalDateTime\n" 
				+ "\nData: " + localDate 
				+ "\nHora: " + localTime 
				+ "\nData e Hora: " + localDateTime); //The instances is sent to the database.
				
		
		//Sending a database as String.		
		DateTimeFormatter dateTimeFormatterDate = DateTimeFormatter.ofPattern("yyyyMMdd");
		DateTimeFormatter dateTimeFormatterTime = DateTimeFormatter.ofPattern("HHmmss");
		DateTimeFormatter dateTimeFormatterDateTime = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
		String objDate = localDate.format(dateTimeFormatterDate);
		String objTime = localTime.format(dateTimeFormatterTime);
		String objDateTime = localDateTime.format(dateTimeFormatterDateTime);
		
		JOptionPane.showMessageDialog(null, "De LocalDateTime para String\n" 
				+ "\nData em String: " + objDate 
				+ "\nHora em String: " + objTime
				+ "\nData e Hora em String: " + objDateTime);
		
	}

}
