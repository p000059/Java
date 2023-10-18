package sj.datesapp;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.swing.JOptionPane;

public class CLocale {

	public static void main(String[] args) {
				
		Date today = new Date();
		
		JOptionPane.showMessageDialog(null, Locale.getDefault());
		
		Locale.setDefault(new Locale("pt", "Brazil"));
		
		String todayFormated = DateFormat.getInstance().format(today);
		
		JOptionPane.showMessageDialog(null, "Dia e Hora: " + todayFormated);
		
		todayFormated = DateFormat.getTimeInstance().format(today);
		
		JOptionPane.showMessageDialog(null, "Horas: " + todayFormated);
		
		todayFormated = DateFormat.getDateInstance().format(today);
		
		JOptionPane.showMessageDialog(null, "Padrão Data pt-BR: " + todayFormated);
		
		todayFormated = DateFormat.getDateTimeInstance().format(today);
		
		JOptionPane.showMessageDialog(null, "Dia/Hora = " + todayFormated);

	}

}
