package Dates.App;

import java.time.ZonedDateTime;

import javax.swing.JOptionPane;

public class CZonedDateTime {

	public static void main(String[] args) {
		// É a união entre LocalDateTime e TimeZone
		
		ZonedDateTime zonedDateTime = ZonedDateTime.now();
		
		JOptionPane.showMessageDialog(null, "Data: " + zonedDateTime);

	}

}
