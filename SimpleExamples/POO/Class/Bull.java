package POO.Class;

public class Bull extends Animal {

	private String weight;
	
	public Bull() {
		
	}
	
	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	@Override
	public String animalSoud() {
		
		String sound = "Muuu!";
		return sound;
	}

	@Override
	public String toString() {
		return "\n\n     BULL    "
				+ "\nNome: " + getName()
				+ "\nCor: " + getColor()
				+ "\nPeso: " + getWeight()
				+ "\nSom: " + this.animalSoud()
				+ "\nStatus: " + this.getaStatus();
	}
}
