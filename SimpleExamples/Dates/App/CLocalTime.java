package Dates.App;

import java.time.LocalTime;

import javax.swing.JOptionPane;

public class CLocalTime {

	public static void main(String[] args) {
		// Representa uma Hora
		
		LocalTime localTime = LocalTime.now();
		
		JOptionPane.showMessageDialog(null, 
				"Hora Atual: " + localTime
				+ "\nInserção Manual: " + localTime.of(12, 30, 25)
				+ "\nHora: " + localTime.getHour()
				+ "\nMinuto: " + localTime.getMinute()
				+ "\nSegundo: " + localTime.getSecond());

	}

}
