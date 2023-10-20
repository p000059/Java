package Dates.App;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

import javax.swing.JOptionPane;

public class CDateTimeFormat {

	public static void main(String[] args) {

		// The date and time type is defined as an example.
		LocalDateTime localDateTime = LocalDateTime.now();
		ZonedDateTime zonedDateTime = ZonedDateTime.now();
		Locale.setDefault(Locale.getDefault());
		
		// Instances are created to receive the formatting type.
		DateTimeFormatter dateTimeFormatter_DateTime = DateTimeFormatter.ISO_DATE_TIME;
		DateTimeFormatter dateTimeFormatter_Date = DateTimeFormatter.ISO_DATE;
		DateTimeFormatter dateTimeFormatter_Time = DateTimeFormatter.ISO_TIME;
		DateTimeFormatter dateTimeFormatter_FormatStyle_SHORT = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
		DateTimeFormatter dateTimeFormatter_FormatStyle_MEDIUM = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
		DateTimeFormatter dateTimeFormatter_FormatStyle_LONG = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG);
		DateTimeFormatter dateTimeFormatter_FormatStyle_FULL = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL);
		DateTimeFormatter dateTimeFormatter_Pattern = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss a");
		
		
		// A String is created to receive:
		// 1 - The instance of the DateTimeFormmatter class;
		// 2 - The .format() method of the DateTimeFormatter class receives an example, which can be LocalDateTime or ZonedDateTime.		
		String dateFormated_DateTime = dateTimeFormatter_DateTime.format(localDateTime);
		String dateFormated_Date = dateTimeFormatter_Date.format(localDateTime);
		String dateFormated_Time = dateTimeFormatter_Time.format(localDateTime);
		String dateFormated_FormatStyle_SHORT = dateTimeFormatter_FormatStyle_SHORT.format(localDateTime);
		String dateFormated_FormatStyle_MEDIUM = dateTimeFormatter_FormatStyle_MEDIUM.format(localDateTime);
		String dateFormated_FormatStyle_LONG = dateTimeFormatter_FormatStyle_LONG.format(zonedDateTime);
		String dateFormated_FormatStyle_FULL = dateTimeFormatter_FormatStyle_FULL.format(zonedDateTime);
		String dateFormated_Pattern = dateTimeFormatter_Pattern.format(localDateTime);
		
		JOptionPane.showMessageDialog(null,
				"\nLocalDateTime: " + localDateTime 
				+ "\nZonedDateTime: " + zonedDateTime
				+ "\nData e Hora: " + dateFormated_DateTime 
				+ "\nData: " + dateFormated_Date 
				+ "\nHora: " + dateFormated_Time 
				+ "\nFormato Curto: " + dateFormated_FormatStyle_SHORT
				+ "\nFormato Médio: " + dateFormated_FormatStyle_MEDIUM
				+ "\nFormato Longo: " + dateFormated_FormatStyle_LONG
				+ "\nFormato Completo: " + dateFormated_FormatStyle_FULL
				+ "\nFormato Definido: " + dateFormated_Pattern);
	}

}
