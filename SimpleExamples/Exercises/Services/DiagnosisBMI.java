package Exercises.Services;

public class DiagnosisBMI {

	public String diagnosisBMI(Double height) {
		
		if ((height >= 18.5) && (height <= 24.9)) {
			
			return "Normal";
			
		} else if ((height >= 25.0) && (height <= 29.9)) {
			
			return "OverWeight";
			
		} else if ((height >= 30.0) && (height <= 40.0)) {
			
			return "Obesity";
			
		} else {
			
			return "Morbid obesity";
		}
	}
}
