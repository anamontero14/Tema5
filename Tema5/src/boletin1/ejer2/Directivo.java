package boletin1.ejer2;

public class Directivo extends Empleado {

	/**
	 * Constructor heredado de la clase Empleado
	 * 
	 * @param nombre
	 */
	Directivo(String nombre) {
		super(nombre);
	}

	/**
	 * Método toString con herencia del de la clase Empleado
	 */
	public String toString() {
		return super.toString() + " -> Directivo";
	}

}
