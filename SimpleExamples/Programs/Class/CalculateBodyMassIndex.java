package Programs.Class;

public class CalculateBodyMassIndex {

	private Double kilogram;
	private Double height;

	public Double getKilogram() {
		return kilogram;
	}

	public void setKilogram(Double kilogram) {
		this.kilogram = kilogram;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	public Double calculateBMI() {

		return this.getKilogram() / (this.getHeight() * this.getHeight());
	}

	public String diagnosis(Double height) {

		if ((height >= 18.5) && (height <= 24.9)) {
			return "Normal";
		} else if ((height >= 25.0) && (height <= 29.9)) {
			return "OverWeight";
		} else if ((height >= 30.0) && (height <= 40.0)) {
			return "Obesity";
		} else {
			return "Morbid obesity";
		}
	}	
}
