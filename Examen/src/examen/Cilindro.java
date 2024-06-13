package examen;

public class Cilindro {
	private double radio;
	private double altura;

	public Cilindro(double radio, double altura) {
		this.radio=radio;
		this.altura=altura;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double calcularVolumen() {
		return Math.PI*Math.pow(radio, 2)*altura;
	}
}
