package String.App;

import javax.swing.JOptionPane;

public class ConvertString {

	public static void main(String[] args) {
		
		int date = 20221001;
		String convertedDate = Integer.toString(date);
		
		String dateNasc = "19900228";
		int convertedDateToInt = Integer.parseInt(dateNasc);
		
		
		JOptionPane.showMessageDialog(null, 
				"Dates in Integer: " + date 
				+ "\nDate from integer to String: " + convertedDate
				+ "\nDate in String: " + dateNasc
				+"\nDate to Integer: " + convertedDateToInt
		);
	}
}
