package boletin1.ejer5;

public class Triangulo extends Poligono {

	/**
	 * Atributo que representa el lado 1 del triángulo
	 */
	private double lado1 = 1;

	/**
	 * Atributo que representa el lado 2 del triángulo
	 */
	private double lado2 = 1;

	/**
	 * Atributo que representa el lado 2 del triángulo
	 */
	private double lado3 = 1;

	/**
	 * Constructor sin parámetros que llama al constructor de la superclase
	 */
	Triangulo() {
		super(3);
	}

	/**
	 * Constructor del triángulo con los dos atributos privados
	 * 
	 * @param lado1 Lado 1 del triángulo
	 * @param lado2 Lado 2 del triángulo
	 * @param lado3 Lado 3 del triángulo
	 */
	Triangulo(double lado1, double lado2, double lado3) {
		super(3);

		if (lado1 > 0) {
			this.lado1 = lado1;
		}

		if (lado2 > 0) {
			this.lado2 = lado2;
		}

		if (lado3 > 0) {
			this.lado3 = lado3;
		}
	}

	/**
	 * Método get que obtiene el lado 1 del triángulo
	 * 
	 * @return un nº decimal con lo que mide el lado 1 del triángulo
	 */
	public double getLado1() {
		return lado1;
	}

	/**
	 * Método set que actualiza el lado 1 del triángulo
	 * 
	 * @param lado1 Atributo que representa el lado 1 del triángulo
	 */
	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}

	/**
	 * Método get que obtiene el lado 2 del triángulo
	 * 
	 * @return un nº decimal con lo que mide el lado 2 del triángulo
	 */
	public double getLado2() {
		return lado2;
	}

	/**
	 * Método set que actualiza el lado 2 del triángulo
	 * 
	 * @param lado2 Atributo que representa el lado 2 del triángulo
	 */
	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}

	/**
	 * Método get que obtiene el lado 2 del triángulo
	 * 
	 * @return un nº decimal con lo que mide el lado 2 del triángulo
	 */
	public double getLado3() {
		return lado3;
	}

	/**
	 * Método set que actualiza el lado 3 del triángulo
	 * 
	 * @param lado3 Atributo que representa el lado 3 del triángulo
	 */
	public void setLado3(double lado3) {
		this.lado3 = lado3;
	}

	/**
	 * Método que haya el área del triángulo
	 */
	@Override
	public double area() {

		// semiperímetro
		double semiPerimetro = (lado1 + lado2 + lado3) / 2;

		// hayo el area del triángulo con la fórmula HERON
		double area = Math.sqrt(semiPerimetro * Math.abs(semiPerimetro - lado1) * Math.abs(semiPerimetro - lado2)
				* Math.abs(semiPerimetro - lado3));

		// devuelve el área
		return area;
	}

	@Override
	public String toString() {
		return super.toString() + "Lados del triángulo.\nLado1: " + lado1 + "\nLado2: " + lado2 + "\nLado3: " + lado3
				+ "\nÁrea: " + area();
	}

}
