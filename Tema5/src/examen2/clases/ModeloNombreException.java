package examen2.clases;

/**
 * Clase la cual su función es crear una excepción cuando el nombre del modelo
 * del mando se introduzca erróneamente. Ya sea porque ha introducido espacios
 * en blanco o porque no se ha escrito nada
 */
public class ModeloNombreException extends Exception {

	/**
	 * Método toString de la clase el cual devuelve una cadena con el problema que
	 * ha provocado la excepcion
	 */
	public String toString() {
		return "El nombre del modelo no puede estar vacío";
	}

	/**
	 * Método toString de la clase el cual devuelve una cadena con el problema que
	 * ha provocado la excepcion
	 */
	public String getMessage() {
		return "El nombre del modelo no puede estar vacío";
	}

}
