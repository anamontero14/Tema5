package boletin1.ejer4;

public class Television extends Electrodomestico {

	/**
	 * Atributo que representa las resolucion de la tele
	 */
	double resolucion = 20;

	/**
	 * Atributo que determina si tiene esa caracteristica o no
	 */
	boolean sintonizacionTDT = false;

	/**
	 * Constructor heredado de la superclase
	 * 
	 * @param precio
	 * @param peso
	 */
	Television(double precio, double peso) {
		super(precio, peso);
	}

	/**
	 * Constructor con atributos heredados y además los propios de la clase
	 * 
	 * @param precio
	 * @param peso
	 * @param color
	 * @param consumo
	 * @param resolucion
	 * @param sintonizacion
	 */
	Television(double precio, double peso, String color, char consumo, double resolucion, boolean sintonizacion) {
		super(precio, color, consumo, peso);

		if (resolucion >= 0) {
			this.resolucion = resolucion;
		}

		this.sintonizacionTDT = sintonizacion;
	}

	public double getResolucion() {
		return resolucion;
	}

	public boolean isSintonizacionTDT() {
		return sintonizacionTDT;
	}

	/**
	 * Si tiene una resolución mayor de 40 pulgadas, se incrementará el precio un
	 * 30% y si tiene un sintonizador TDT incorporado, aumentará 50 €. Además de las
	 * condiciones de la superclase
	 */
	public void precioFinal() {
		if (resolucion > 40) {
			precioBase *= 1.30;
		}

		if (sintonizacionTDT) {
			precioBase += 50;
		}

		super.precioFinal();
	}

	@Override
	public String toString() {

		String tieneONo = "";

		if (sintonizacionTDT) {
			tieneONo = "con sintonización TDT";
		} else {
			tieneONo = "sin sintonización TDT";
		}

		return super.toString() + ", " + resolucion + " pulgadas , " + tieneONo;
	}

}
