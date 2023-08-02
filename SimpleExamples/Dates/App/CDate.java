package Dates.App;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.TimeZone;

import javax.swing.JOptionPane;

public class CDate {

	public static void main(String[] args) {
		
		Date today = new Date();
		
		JOptionPane.showMessageDialog(null, "\nData Atual: " + today				
		+ "\n" + LocalDate.now()
		+ "\n" + LocalTime.now()
		+ "\n" + LocalDateTime.now()
		+ "\n" + Instant.now()
		+ "\n" + ZonedDateTime.now()
		+ "\n" + TimeZone.LONG);
		
	}

}
