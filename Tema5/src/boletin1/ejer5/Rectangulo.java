package boletin1.ejer5;

public class Rectangulo extends Poligono {

	/**
	 * Atributo que representa el lado 1 del rectangulo
	 */
	private double lado1 = 1;

	/**
	 * Atributo que representa el lado 2 del rectangulo
	 */
	private double lado2 = 1;

	/**
	 * Constructor sin parámetros que llama al constructor de la superclase
	 */
	Rectangulo() {
		super(4);
	}

	/**
	 * Constructor del rectangulo con los dos atributos privados
	 * 
	 * @param lado1 Lado 1 del rectángulo
	 * @param lado2 Lado 2 del rectángulo
	 */
	Rectangulo(double lado1, double lado2) {
		super(4);
		if (lado1 > 0) {
			this.lado1 = lado1;
		}

		if (lado2 > 0) {
			this.lado2 = lado2;
		}
	}

	/**
	 * Método get que obtiene el lado 1 del rectángulo
	 * 
	 * @return un nº decimal con lo que mide el lado 1 del rectángulo
	 */
	public double getLado1() {
		return lado1;
	}

	/**
	 * Método set que actualiza el lado 1 del rectángulo
	 * 
	 * @param lado1 Atributo que representa el lado 1 del rectangulo
	 */
	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}

	/**
	 * Método get que obtiene el lado 2 del rectángulo
	 * 
	 * @return un nº decimal con lo que mide el lado 2 del rectángulo
	 */
	public double getLado2() {
		return lado2;
	}

	/**
	 * Método set que actualiza el lado 2 del rectángulo
	 * 
	 * @param lado2 Atributo que representa el lado 2 del rectangulo
	 */
	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}

	/**
	 * Método que haya el área del rectángulo
	 */
	@Override
	public double area() {
		return lado1 * lado2;
	}

	@Override
	public String toString() {
		return super.toString() + "Lados del rectángulo.\nLado1: " + lado1 + "\nLado2: " + lado2 + "\nÁrea: " + area();
	}

}
