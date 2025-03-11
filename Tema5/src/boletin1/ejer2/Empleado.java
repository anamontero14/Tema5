package boletin1.ejer2;

public class Empleado {

	/**
	 * Atributo que contiene el nombre del empleado
	 */
	private String nombre;

	/**
	 * Constructor con solo el nombre
	 * 
	 * @param nombre
	 */
	Empleado(String nombre) {
		if (nombre != null) {
			this.nombre = nombre;
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Empleado: " + nombre;
	}
	
	

}
