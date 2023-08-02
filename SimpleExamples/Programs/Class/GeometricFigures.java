package Programs.Class;

public class GeometricFigures {

	private int lados;
	private double medidas;

	public int getLados() {
		return lados;
	}

	public void setLados(int lados) {
		this.lados = lados;
	}

	public double getMedidas() {
		return medidas;
	}

	public void setMedidas(double medidas) {
		this.medidas = medidas;
	}

	public double calculaTriangulo(double base, double altura) {
		return (base * altura) / 2;
	}

	public String verificaPoligono() {

		if (this.lados == 3) {
			return "TRIÂNGULO";
		} else if (this.lados == 4) {
			return "QUADRADO";
		} else if (this.lados == 5) {
			return "PENTÁGONO";
		} else if (this.lados < 3) {
			return "NÃO É POLIGONO";
		} else {
			return null;
		}
	}
}
