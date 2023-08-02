package POO.Class;

public class Square extends Figures {
	
	@Override
	public Double calculateArea(Double sideOne) {
		
		Double area = Math.pow(sideOne, 2);

		return area;
	}

	
}
