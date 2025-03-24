package boletin2.ejer2;

/**
 * Clase que gestionará la a los futbolistas
 */
public class Futbolista {

	/**
	 * Atributo privado que representará el nº del jugador
	 */
	private int numCamiseta;

	/**
	 * Atributo privado que representará el nombre del jugador
	 */
	private String nombreJugador;

	/**
	 * Atributo privado que representará la edad del jugador
	 */
	private int edadJugador;

	/**
	 * Atributo privado que representará nº de goles
	 */
	private int numGoles;

	/**
	 * Constructor con todos los parámetros
	 * 
	 * @param numCamiseta   - El nº de la camiseta
	 * @param nombreJugador - El nombre del jugador
	 * @param edadJugador   - La edad del jugador
	 * @param numGoles      - El nº de goles que ha marcado el jugador
	 */
	Futbolista(int numCamiseta, String nombreJugador, int edadJugador, int numGoles) {

		if (numCamiseta > 0) {
			this.numCamiseta = numCamiseta;
		}

		if (nombreJugador != null && !nombreJugador.isBlank()) {
			this.nombreJugador = nombreJugador;
		}

		if (numGoles >= 0) {
			this.numGoles = numGoles;
		}

	}

	/**
	 * Método get que obtiene el nº de la camiseta del jugador
	 * 
	 * @return un nº que corresponde con el nº de la camiseta del jugador
	 */
	public int getNumCamiseta() {
		return numCamiseta;
	}

	/**
	 * Método que actualiza el nº de la camiseta del jugador siempre y cuando sea
	 * posible
	 * 
	 * @param numCamiseta - El nº de camiseta del jugador
	 */
	public void setNumCamiseta(int numCamiseta) {
		if (numCamiseta > 0) {
			this.numCamiseta = numCamiseta;
		}
	}

	/**
	 * Método get que obtiene el nombre del jugador
	 * 
	 * @return una cadena que hace referencia al nombre del jugador
	 */
	public String getNombreJugador() {
		return nombreJugador;
	}

	/**
	 * Método set que actualiza el nombre del jugador siempre que sea posible
	 * 
	 * @param nombreJugador - Nombre del jugador
	 */
	public void setNombreJugador(String nombreJugador) {
		if (nombreJugador != null && !nombreJugador.isBlank()) {
			this.nombreJugador = nombreJugador;
		}
	}

	/**
	 * Método get que obtiene la edad del jugador
	 * 
	 * @return un int que hace referencia a la edad del jugador
	 */
	public int getEdadJugador() {
		return edadJugador;
	}

	/**
	 * Método set que actualiza la edad del jugador siempre que sea posible
	 * 
	 * @param edadJugador - Edad del jugador
	 */
	public void setEdadJugador(int edadJugador) {
		if (edadJugador > 0) {
			this.edadJugador = edadJugador;
		}
	}

	/**
	 * Método get que obtiene el nº de goles del jugador
	 * 
	 * @return un int que hace referencia al nº de goles que ha metido el jugador
	 */
	public int getNumGoles() {
		return numGoles;
	}

	/**
	 * Método set que actualiza el nº de goles que ha metido el jugador siempre que
	 * sea posible
	 * 
	 * @param numGoles - Nº de goles que ha metido el jugador
	 */
	public void setNumGoles(int numGoles) {
		if (numGoles >= 0) {
			this.numGoles = numGoles;
		}
	}

	/**
	 * Método toString que pasa los datos del futbolista a una cadena
	 */
	@Override
	public String toString() {
		return "FUTBOLISTA \nNº de camiseta: " + numCamiseta + "\nNombre: " + nombreJugador + "\nEdad: " + edadJugador
				+ "\nNº de goles que ha marcado: " + numGoles;
	}

	/**
	 * Método equals que comprueba si dos futbolistas son iguales o no. Considera
	 * que dos futbolistas son iguales cuando su nº de camiseta y su nombre es el
	 * mismo
	 */
	@Override
	public boolean equals(Object obj) {
		boolean sonIguales = false;

		Futbolista futb = (Futbolista) obj;

		if (this.numCamiseta == futb.numCamiseta && this.nombreJugador.equalsIgnoreCase(futb.nombreJugador)) {
			sonIguales = true;
		}

		return sonIguales;
	}

	/**
	 * Método compareTo que compara dos objetos por el nº de camiseta y el nombre
	 * 
	 * @param obj - Objeto que entra por parámetro de entrada
	 * @return un int. Si es 0 es que ha habido un error, si es -1 es porque son
	 *         iguales y si es 1 es porque NO son iguales
	 */
	public int compareTo(Object obj) {
		int res = 0;

		Futbolista futb = (Futbolista) obj;

		if (this.numCamiseta > futb.numCamiseta) {
			res = 1;
		} else if (this.numCamiseta > futb.numCamiseta) {
			res = -1;
		} else {
			res = this.nombreJugador.compareTo(futb.nombreJugador);
		}

		return res;
	}

}
