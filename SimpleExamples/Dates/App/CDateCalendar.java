package Dates.App;

import java.util.Calendar;

import javax.swing.JOptionPane;

public class CDateCalendar {

	public static void main(String[] args) {
		
		Calendar today = Calendar.getInstance();

		JOptionPane.showMessageDialog(null, "Ano: " + today.get(Calendar.YEAR));
		JOptionPane.showMessageDialog(null, "Mês: " + today.get(Calendar.MONTH));
		JOptionPane.showMessageDialog(null, "Dia do Mês: " + today.get(Calendar.DAY_OF_MONTH));
		JOptionPane.showMessageDialog(null, "Hora do dia: " + today.get(Calendar.HOUR_OF_DAY));
		JOptionPane.showMessageDialog(null, "Minutos: " + today.get(Calendar.MINUTE));
		JOptionPane.showMessageDialog(null, "Segundos: " + today.get(Calendar.SECOND));
	}

}
