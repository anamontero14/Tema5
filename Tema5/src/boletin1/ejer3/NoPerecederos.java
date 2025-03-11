package boletin1.ejer3;

public class NoPerecederos extends Productos {

	/**
	 * Atributo que almacena el tipo del producto
	 */
	private String tipo;

	/**
	 * Constructor con herencia de la superclase
	 * 
	 * @param nombre
	 * @param precio
	 * @param tipo
	 */
	NoPerecederos(String nombre, double precio, String tipo) {
		super(nombre, precio);

		if (tipo != null) {
			this.tipo = tipo;
		}
	}

	/**
	 * Hace lo mismo que en la sper clase
	 */
	public double calcular(double cantidad) {
		return super.calcular(cantidad);
	}
}
