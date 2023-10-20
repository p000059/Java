package Dates.App;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.JOptionPane;

public class CGregorianCalendar {

	public static void main(String[] args) {
		
		Calendar today = Calendar.getInstance();
		
		GregorianCalendar gregorianCalendar = new GregorianCalendar();
		
		printDate(gregorianCalendar);

	}
	
	private static void printDate(Calendar today) {
		
		int year = today.get(Calendar.YEAR);
		int month = today.get(Calendar.MONTH);
		int day = today.get(Calendar.DAY_OF_MONTH);
		int hour = today.get(Calendar.HOUR);
		int minutes = today.get(Calendar.MINUTE);
		int second = today.get(Calendar.SECOND);
		
		JOptionPane.showMessageDialog(null, "Data: " + year + "/" + month + "/" + day + " " + hour + ":" + minutes + ":" + second);
	}

}
