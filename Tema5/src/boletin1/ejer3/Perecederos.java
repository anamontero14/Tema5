package boletin1.ejer3;

public class Perecederos extends Productos {

	/**
	 * Atributo que guarda los días en los que caducará el producto
	 */
	private int diasACaducar;

	/**
	 * Constructor con herencia de la superclase y con otro nuevo atributo
	 * 
	 * @param nombre
	 * @param precio
	 * @param diasACaducar
	 */
	Perecederos(String nombre, double precio, int diasACaducar) {
		super(nombre, precio);

		if (diasACaducar > 0) {
			this.diasACaducar = diasACaducar;
		}
	}

	/**
	 * Calcula el precio por la cantidad y le descuenta dependiendo si le quedan
	 * pocos días para que caduque o no
	 */
	public double calcular(double cantidad) {

		// llamo a la funcion calcular de la super clase y lo almaceno en una variable
		double precioFinal = super.calcular(cantidad);

		// si los días a calcular están entre 1 o 3
		if (diasACaducar >= 1 && diasACaducar <= 3) {
			// al precio final se le resta 5 menos los dias por caducar
			precioFinal /= (5 - diasACaducar);
		}

		// devuelve ese precio calculado
		return precioFinal;
	}

}
