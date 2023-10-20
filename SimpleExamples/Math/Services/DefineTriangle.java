package Math.Services;

public class DefineTriangle {

	public Boolean checkIfTriangle(int sideOne, int sideTwo, int sideThree) {

		if ((sideOne + sideTwo > sideThree) && (sideOne + sideThree > sideTwo) && (sideTwo + sideThree > sideOne)) {

			return true;

		} else {

			return false;
		}
	}

	public String defineTheSides(int sideOne, int sideTwo, int sideThree) {

		if ((sideOne != sideTwo) && (sideOne != sideThree) && (sideTwo != sideThree)) {

			return "Escaleno";

		} else if (((sideOne == sideTwo) && (sideOne != sideThree)) || ((sideTwo == sideThree) && (sideTwo != sideOne))
				|| ((sideThree == sideOne) && (sideThree != sideTwo))) {

			return "Isósceles";

		} else {

			return "Equilátero";
		}
	}

	public String defineAngle(int angleOne, int angleTwo, int angleThree) {

		if ((angleOne < 90) && (angleTwo < 90) && (angleThree < 90)) {

			return "Triangulo Acutângulo";

		} else if (((angleOne < 90) && (angleTwo == 90)) || ((angleTwo < 90) && (angleThree == 90))
				|| ((angleThree < 90) && (angleOne == 90))) {

			return "Triangulo Retângulo";

		} else if (((angleOne > 90) && (angleTwo == 90)) || ((angleTwo > 90) && (angleThree == 90))
				|| ((angleThree > 90) && (angleOne == 90))) {

			return "Triangulo Obtusângulo";

		} else {

			return "Não é triângulo!";
		}
	}

	public double calculateAriaOfTriangle(double base, double height) {

		return ((base * height) / 2);
	}

	public double calculatePerimeterOfTriangle(double sideOne, double sideTwo, double sideThree) {

		return (sideOne + sideTwo + sideThree);
	}
}
