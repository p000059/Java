package Programs.App;

import javax.swing.JOptionPane;

import Programs.Class.CalculateBodyMassIndex;

public class AppCalculateBody {

	public static void main(String[] args) {

		CalculateBodyMassIndex calculateBodyMassIndex = new CalculateBodyMassIndex();

		calculateBodyMassIndex.setKilogram(Double.parseDouble(JOptionPane.showInputDialog("Enter a weight: ")));
		calculateBodyMassIndex.setHeight(Double.parseDouble(JOptionPane.showInputDialog("Enter a Height")));

		Double BMI = calculateBodyMassIndex.calculateBMI();

		JOptionPane.showMessageDialog(null,
				"Diagnosis:  " + "\n\nBMI: " + BMI + "\n" + calculateBodyMassIndex.diagnosis(BMI));
	}
}
