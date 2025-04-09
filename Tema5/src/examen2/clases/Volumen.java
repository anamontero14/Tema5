package examen2.clases;

/**
 * Interfaz que se encarga de subir y bajar el volumen de ciertos dispositivos
 */
public interface Volumen {

	/**
	 * Método vacío para overriding el cual cambiará dependiendo de la clase. Este
	 * sirve para subir el volumen
	 */
	public void subirVolumen();

	/**
	 * Método vacío para overriding el cual cambiará dependiendo de la clase. Este
	 * sirve para bajar el volumen
	 */
	public void bajarVolumen();

}
