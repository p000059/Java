package Exercises.App;

import javax.swing.JOptionPane;

import Class.SubClass.Mass;
import Exercises.Services.DiagnosisBMI;

public class CalculateBodyMassIndex {


	public static void main(String[] args) {

		Mass mass = new Mass(); 
		DiagnosisBMI diagnosisBMI = new DiagnosisBMI();

		mass.setKilogram(Double.parseDouble(JOptionPane.showInputDialog("Enter a weight: ")));
		mass.setHeight(Double.parseDouble(JOptionPane.showInputDialog("Enter a Height")));

		Double BMI = mass.calculateBMI();

		JOptionPane.showMessageDialog(null,
				"Diagnosis:  " + "\n\nBMI: " + BMI + "\n" + diagnosisBMI.diagnosisBMI(BMI));
	}
}
