package POO.Class;

import java.util.Objects;

public abstract class Figures {

	private String name;
	private String type;

	public Figures() {

	}

	public Figures(String name, String type) {
		super();
		this.name = name;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Figures other = (Figures) obj;
		return Objects.equals(name, other.name) && Objects.equals(type, other.type);
	}

	@Override
	public String toString() {
		return "[" + name + ", " + type + "]";
	}

	//Overloaded methods applied with polymorphism.
	public Double calculateArea(Double sideOne) {
		
		return 0.0;
	}

	public Double calculateArea(Double sideOne, Double sideTwo) {

		return 0.0;
	}

	public Double calculateArea(Double sideOne, Double sideTwo, Double sideThree) {

		return 0.0;
	}

	public Double calculateArea(Double sideOne, Double sideTwo, Double sideThree, Double sideFour) {

		return 0.0;
	}
	
	public Double calculateArea(Double sideOne, Double sideTwo, Double sideThree, Double sideFour, Double sideFive) {

		return 0.0;
	}

}
