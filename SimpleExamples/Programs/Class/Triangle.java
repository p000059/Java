package Programs.Class;

public class Triangle {

	private int angleOne;
	private int angleTwo;
	private int angleThree;
	private int sideOne;
	private int sideTwo;
	private int sideThree;

	public Triangle() {
		
	}

	public Triangle(int angleOne, int angleTwo, int angleThree, int sideOne, int sideTwo, int sideThree) {
		
		this.angleOne = angleOne;
		this.angleTwo = angleTwo;
		this.angleThree = angleThree;
		this.sideOne = sideOne;
		this.sideTwo = sideTwo;
		this.sideThree = sideThree;
	}

	public int getAngleOne() {
		return angleOne;
	}

	public void setAngleOne(int angleOne) {
		this.angleOne = angleOne;
	}

	public int getAngleTwo() {
		return angleTwo;
	}

	public void setAngleTwo(int angleTwo) {
		this.angleTwo = angleTwo;
	}

	public int getAngleThree() {
		return angleThree;
	}

	public void setAngleThree(int angleThree) {
		this.angleThree = angleThree;
	}

	public int getSideOne() {
		return sideOne;
	}

	public void setSideOne(int sideOne) {
		this.sideOne = sideOne;
	}

	public int getSideTwo() {
		return sideTwo;
	}

	public void setSideTwo(int sideTwo) {
		this.sideTwo = sideTwo;
	}

	public int getSideThree() {
		return sideThree;
	}

	public void setSideThree(int sideThree) {
		this.sideThree = sideThree;
	}

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

	public String defineTheAngle(int angleOne, int angleTwo, int angleThree) {

		if ((this.angleOne < 90) && (this.angleTwo < 90) && (this.angleThree < 90)) {
			return "Triangulo Acutângulo";
		} else if (((this.angleOne < 90) && (this.angleTwo == 90)) || ((this.angleTwo < 90) && (this.angleThree == 90))
				|| ((this.angleThree < 90) && (this.angleOne == 90))) {
			return "Triangulo Retângulo";
		} else if (((this.angleOne > 90) && (this.angleTwo == 90)) || ((this.angleTwo > 90) && (this.angleThree == 90))
				|| ((this.angleThree > 90) && (this.angleOne == 90))) {
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
