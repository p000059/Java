package POO.Class;

public class Dog extends Animal {

	private String pressionBite;

	public String getPressionBite() {
		return pressionBite;
	}

	public void setPressionBite(String pressionBite) {
		this.pressionBite = pressionBite;
	}

	@Override
	public String animalSoud() {
		
		return "Au, au!";
	}

	@Override
	public String toString() {
		return "\n\n    DOG    "
				+ "\nNome: " + this.getName()
				+ "\nCor: " + this.getColor()
				+ "\nPressão da Mordida: " + this.getPressionBite()
				+ "\nSom: " + this.animalSoud()
				+ "\nStatus: " + this.getaStatus();
	}
}
