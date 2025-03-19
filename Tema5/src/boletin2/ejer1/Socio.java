package boletin2.ejer1;

/**
 * Clase que maneja a un socio
 */
public class Socio implements Comparable<Socio> {

	/**
	 * Número identificativo del socio
	 */
	private int id;

	/**
	 * Atributo que guarda el nombre del socio
	 */
	private String nombre;

	/**
	 * Atributo que representa la edad del socio
	 */
	private int edad;

	/**
	 * Constructor del socio con todos los atributos
	 * 
	 * @param id     - el id del socio
	 * @param nombre - el nombre del socio
	 * @param edad   - la edad del socio
	 */
	Socio(int id, String nombre, int edad) {
		if (id >= 0) {
			this.id = id;
		}

		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}

		if (edad > 0) {
			this.edad = edad;
		}
	}

	/**
	 * Método que representa el socio en forma de cadena
	 */
	@Override
	public String toString() {
		return "SOCIO \nID: " + id + "\nNombre: " + nombre + "\nEdad: " + edad;
	}

	/**
	 * Método compareTo para comparar dos objetos
	 */

	/*
	 * public int compareTo(Object o) { int res = 0;
	 * 
	 * Socio soc = (Socio) o;
	 * 
	 * if (this.id < soc.id) { res = -1; } else if (this.id > soc.id) { res = 1; }
	 * 
	 * return res; }
	 */

	@Override
	public int compareTo(Socio o) {
		int res = 0;

		Socio soc = o;

		if (this.id < soc.id) {
			res = -1;
		} else if (this.id > soc.id) {
			res = 1;
		}

		return res;
	}

}
