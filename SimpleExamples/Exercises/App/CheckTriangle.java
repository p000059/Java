package Exercises.App;

import javax.swing.JOptionPane;

import Class.SubClass.Triangle;
import Math.Services.DefineTriangle;

public class CheckTriangle {

	public static void main(String[] args) {

		Triangle triangle = new Triangle();
		DefineTriangle defineTriangle = new DefineTriangle();
		
		triangle.setSideOne(1);
		triangle.setSideTwo(1);
		triangle.setSideThree(6);

		Boolean verified = defineTriangle.checkIfTriangle(triangle.getSideOne(), triangle.getSideTwo(), triangle.getSideThree());
		
		if(verified == true) {
			
			String typeTriangle = defineTriangle.defineTheSides(triangle.getSideOne(), triangle.getSideTwo(), triangle.getSideThree());
			
			JOptionPane.showMessageDialog(null, typeTriangle);
		}
	}
}
