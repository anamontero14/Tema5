package boletin1.ejer2;

public class Oficial extends Operario {

	/**
	 * Constructor heredado de la clase Operario
	 * 
	 * @param nombre
	 */
	Oficial(String nombre) {
		super(nombre);
	}

	/**
	 * Método toString heredado de la clase Operario
	 */
	public String toString() {
		return super.toString() + " -> Oficial";
	}

}
