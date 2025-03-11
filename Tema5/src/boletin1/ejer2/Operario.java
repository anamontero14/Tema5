package boletin1.ejer2;

public class Operario extends Empleado {

	/**
	 * Constructor heredado de la clase Empleado
	 * 
	 * @param nombre
	 */
	Operario(String nombre) {
		super(nombre);
	}

	public String toString() {
		return super.toString() + " -> Operario";
	}

}
