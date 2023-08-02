package POO.Class;

public class Triangle extends Figures {

	@Override
	public Double calculateArea(Double sideOne, Double sideTwo) {

		Double area = (sideOne*sideTwo) / 2; 
		
		return area;
	}

	
}
