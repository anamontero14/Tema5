package examen2.clases;

/**
 * Interfaz que sirve para la implementación de los métodos de subir la
 * velocidad y bajar la velocidad los cuales son implementables
 */
public interface Velocidad {

	/**
	 * Método para hacer overriding el cual cambiará dependiendo de la clase donde
	 * sea implementado. Este sirve para subir la velocidad
	 */
	public void subirVelocidad();

	/**
	 * Método para hacer overriding el cual cambiará dependiendo de la clase donde
	 * sea implementado. Este sirve para bajar la velocidad
	 */
	public void bajarVelocidad();

}
