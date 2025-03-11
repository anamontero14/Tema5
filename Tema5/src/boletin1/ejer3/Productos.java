package boletin1.ejer3;

public class Productos {

	/**
	 * Atributo del nombre del producto
	 */
	private String nombre;

	/**
	 * Atributo del precio del producto
	 */
	private double precio;

	/**
	 * Constructor del producto
	 * 
	 * @param nombre
	 * @param precio
	 */
	Productos(String nombre, double precio) {
		if (nombre != null) {
			this.nombre = nombre;
		}

		if (precio <= 0) {
			this.precio = precio;
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	/**
	 * Simplemente sería multiplicar el precio por la cantidad de productos pasados
	 * y devolverá el resultado
	 * 
	 * @param cantidad
	 * @return
	 */
	public double calcular(double cantidad) {
		double calculo = precio * cantidad;
		return calculo;
	}

}
