package sj.datesapp;

import java.util.TimeZone;

import javax.swing.JOptionPane;

public class CTimeZone {

	public static void main(String[] args) {
		// Data com zona de tempo do fuso horário:
		
		TimeZone timeZone = TimeZone.getDefault();
		
		JOptionPane.showMessageDialog(null, "\n" + TimeZone.getDefault() 
				+ "\nLongo: " + TimeZone.LONG
				+ "\nCurto: " + TimeZone.SHORT
				+ "\nNome da Zona Local: " + timeZone.getDisplayName()
				+ "\nRetorna ID da Zona Local: " + timeZone.getID()
				+ "\nQuantia de Milisegundos: " + timeZone.getRawOffset());

	}

}
