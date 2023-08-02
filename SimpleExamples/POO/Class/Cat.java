package POO.Class;

public class Cat extends Animal {

	private String breed;
	
	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	@Override
	public String animalSoud() {

		return "Miau!";
	}

	@Override
	public String toString() {
		return "\n\n    CAT    "
				+ "\nNome: " + this.getName()
				+ "\nCor: " + this.getColor()
				+ "\nRaça: " + this.getBreed()
				+ "\nSom: " + this.animalSoud()
				+ "\nStatus: " + this.getaStatus();
	}
	
	
}
