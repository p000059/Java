package Dates.App;

import java.time.Instant;

import javax.swing.JOptionPane;

public class CInstant {

	public static void main(String[] args) {
		// Instant passa a contar os milisengundos a partir de 30 de Janeiro de 1970.
		
		Instant instant = Instant.now();
		
		JOptionPane.showMessageDialog(null, "Atual: " + instant
				+ "\nSegundo da Época: " + instant.getEpochSecond()
				+ "\nNano Segundo: " + instant.getNano());

	}

}
