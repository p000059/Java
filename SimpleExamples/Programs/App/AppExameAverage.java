package Programs.App;

import javax.swing.JOptionPane;
import Programs.Class.Grades;
import Programs.Services.CalculateGrades;

public class AppExameAverage {

	public static void main(String[] args) {

		Grades grades = new Grades();
		CalculateGrades calculateGrades = new CalculateGrades();
		
		int i = 0;
		int j = 1;
		int quantityTestExam = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of tests: "));
		double[] numberOfNotes = new double[quantityTestExam];
		int requiredNote = 7;
		
		do {

			numberOfNotes[i] = Double.parseDouble(JOptionPane.showInputDialog("Note " + (j++) + ": "));
			i++;

		} while (quantityTestExam < numberOfNotes.length);

		grades.setTestNote(numberOfNotes);
		
		JOptionPane.showMessageDialog(null, "Result: " + calculateGrades.finalResult(calculateGrades.receivesMultipleTestNotes(grades.getTestNote()), requiredNote));
	}
}
