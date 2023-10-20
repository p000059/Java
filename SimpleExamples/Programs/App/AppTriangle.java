package Programs.App;

import javax.swing.JOptionPane;

import Programs.Class.Triangle;

public class AppTriangle {

	public static void main(String[] args) {

		Triangle triangle = new Triangle();

		Boolean ifTriangle = triangle.checkIfTriangle(6, 7, 10);
		String result = triangle.defineTheSides(5, 4, 3);

		JOptionPane.showMessageDialog(null, "Triângulo: " + ifTriangle + "\nTriângulo: " + result);
	}
}
