package DesignPattern.Factory.App;

import java.text.NumberFormat;
import java.util.Calendar;
import java.util.List;
import java.util.stream.Stream;

import javax.swing.JOptionPane;

public class AppStatic {

	public static void main(String[] args) {
		
		Calendar.getInstance();
		NumberFormat.getInstance();
		Stream.of(1,2,3,4,5,6);
		List.of(1,2,3,4,5,6);
		Integer valueOf = Integer.valueOf("1500");
		JOptionPane.showMessageDialog(null, valueOf);
	}
}
