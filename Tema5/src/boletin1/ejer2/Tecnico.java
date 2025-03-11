package boletin1.ejer2;

public class Tecnico extends Operario {

	/**
	 * Constructor heredado de la clase Operario
	 * 
	 * @param nombre
	 */
	Tecnico(String nombre) {
		super(nombre);
	}

	/**
	 * Método toString heredado de Operario
	 */
	public String toString() {
		return super.toString() + " ->  Técnico";
	}

}
