package boletin3.ejer3;

/**
 * Clase que administra los animales domesticos y que implementa la interfaz de
 * animales
 */
public abstract class AnimalDomestico implements Animal {

	/**
	 * Atributo privado que hace referencia al nombre del animal
	 */
	private String nombre;

	/**
	 * Atributo privado que hace referencia a la raza del animal
	 */
	private String raza;

	/**
	 * Atributo privado que hace referencia al peso del animal
	 */
	private double peso;

	/**
	 * Atributo privado que hace referencia al color del animal
	 */
	private String color;

	/**
	 * Constructor solo con el parámetro que identifica al animal
	 * 
	 * @param nombre - Nombre del animal
	 */
	AnimalDomestico(String nombre) {
		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}
	}

	/**
	 * Constructor de un animal con todos los parámetros que puede tener este
	 * 
	 * @param nombre - Nombre del animal
	 * @param raza   - Raza del animal
	 * @param peso   - Peso del animal
	 * @param color  - Color del animal
	 */
	AnimalDomestico(String nombre, String raza, double peso, String color) {
		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}

		if (raza != null && !raza.isBlank()) {
			this.raza = raza;
		}

		if (peso > 0) {
			this.peso = peso;
		}

		if (color != null && !color.isBlank()) {
			this.color = color;
		}
	}

	/**
	 * Método get que obtiene el nombre del animal
	 * 
	 * @return una cadena con el nombre del animal
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Método set que actualiza el nombre del animal siempre que sea posible
	 * 
	 * @param nombre - Nombre
	 */
	public void setNombre(String nombre) {
		if (nombre != null && !nombre.isBlank())
			this.nombre = nombre;
	}

	/**
	 * Método get que obtiene la raza del animal
	 * 
	 * @return una cadena con la raza del animal
	 */
	public String getRaza() {
		return raza;
	}

	/**
	 * Método get que obtiene el peso del animal
	 * 
	 * @return un nº decimal con el peso del animal
	 */
	public double getPeso() {
		return peso;
	}

	/**
	 * Método set que actualiza el peso del animal
	 * 
	 * @param peso - Peso del animal
	 */
	public void setPeso(double peso) {
		this.peso = peso;
	}

	/**
	 * Método get que obtiene el color del animal
	 * 
	 * @return obtiene una cadena con el color del animal
	 */
	public String getColor() {
		return color;
	}

	/**
	 * Método set que actualiza el color del animal
	 * 
	 * @param color - Color del animal
	 */
	public void setColor(String color) {
		this.color = color;
	}

	public void comer() {
		System.out.println("El animal come.");
	}

	public void dormir() {
		System.out.println("El animal duerme");
	}

	public abstract void hacerRuido();

	public static void vacunar() {
		System.out.println("El animal se vacuna");
	}

	public abstract boolean hacerCaso();

}
