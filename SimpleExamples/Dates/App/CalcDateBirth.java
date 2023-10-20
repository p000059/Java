package Dates.App;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

public class CalcDateBirth {

	public static void main(String[] args) {

		// Current system date converted to integer.
		LocalDate objLocalDate = LocalDate.now();
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("ddMMyyyy");
		int current_date = Integer.parseInt(dateTimeFormatter.format(objLocalDate));

		// Dates of birth converted to integer.
		// This information(String) comes from the front-end.
		String birth_date = "15041982";
		LocalDate localDateBirth = LocalDate.parse(birth_date, dateTimeFormatter);
		int birthDate = Integer.parseInt(dateTimeFormatter.format(localDateBirth));

		// Calculate Age
		int age = current_date - birthDate;

		// Convert Age to LocalDate
		String sAge = Integer.toString(age);
		LocalDate objDateBirth = LocalDate.parse(sAge, dateTimeFormatter);

		// Deliver the age in string format
		String objDate = objDateBirth.format(dateTimeFormatter);
		String s1 = String.format("%1$ty", objDateBirth);

		//Convert LocalDate to String
		String localDateString = dateTimeFormatter.format(objLocalDate);
		
		JOptionPane.showMessageDialog(null,
				"\nType format: " + dateTimeFormatter 
				+ "\nCurrent date in LocalDate: " + objLocalDate
				+ "\nBirth date in LocalDate: " + localDateBirth
				+ "\nAge in LocalDate: " + objDateBirth
				+ "\n\nCurrent date in String: " + localDateString
				+ "\nBirth date in String: " + birth_date
				+ "\nAge in String: " + sAge
				+ "\nOnly age in String: " + s1
				+ "\n\nCurrent date in Integer: " + current_date
				+ "\nBirth date in Integer: " + birthDate
				+ "\nAge in Integer: " + age
				+ "\n\nNo format age in String: " + objDate
		);

	}

}

