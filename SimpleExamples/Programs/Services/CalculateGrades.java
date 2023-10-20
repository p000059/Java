package Programs.Services;

public class CalculateGrades {

	public double receivesMultipleTestNotes(double[] sourceNote) {

		double average = 0.0;

		for (int i = 0; i < sourceNote.length; i++) {

			average = average + sourceNote[i];
		}

		return average / sourceNote.length;
	}

	public String finalResult(double sourceAverage, int requiredAverage) {

		if (sourceAverage >= requiredAverage) {

			return "Approved Student!";
		} else if (sourceAverage < requiredAverage) {

			return "Faleid Student!";
		} else {
			return "Invalid Exam Grade";
		}
	}

	public double calculateTwoGrades(int noteOne, int noteTwo) {

		return ((noteOne + noteTwo) / 2);
	}
}
