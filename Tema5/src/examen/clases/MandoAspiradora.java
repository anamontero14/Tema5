package examen.clases;

/**
 * Clase hija de MandoADistancia que implementa la interfaz Velocidad y que
 * gestiona todos los mandos de aspiradora
 */
public class MandoAspiradora extends MandoADistancia implements Velocidad {

	/**
	 * Atributo que representa la velocidad que tiene ahora mismo la aspiradora el
	 * cual por defecto está a 0
	 */
	private int velocidadAspiracion = 0;

	/**
	 * Constructor que llama al constructor del padre
	 * 
	 * @param modelo - Modelo del mando
	 * @param altura - Altura del mando
	 * @param precio - Precio del mando
	 */
	public MandoAspiradora(String modelo, double altura, double precio) {
		super(modelo, altura, precio);
	}

	/**
	 * Método get que recoge la velocidad actual de la aspiradora
	 * 
	 * @return un número que representa la velocidad actual de la aspiradora
	 */
	public int getVelocidadAspiracion() {
		return velocidadAspiracion;
	}

	/**
	 * Método set que actualiza la velocidad actual de la aspiradora
	 * 
	 * @param velocidadAspiracion - Velocidad nueva
	 */
	public void setVelocidadAspiracion(int velocidadAspiracion) {
		this.velocidadAspiracion = velocidadAspiracion;
	}

	/**
	 * Sube la velocidad de la aspiradora MIENTRAS que esta sea menor que 3, es
	 * decir que si la velocidad es 3 no la subirá más
	 */
	@Override
	public void subirVelocidad() {
		if (velocidadAspiracion < 3) {
			velocidadAspiracion++;
		}
	}

	/**
	 * Baja la velocidad de la aspiradora MIENTRAS que esta sea mayor que 0, es
	 * decir que si la velocidad es 0 no la bajará más
	 */
	@Override
	public void bajarVelocidad() {
		if (velocidadAspiracion > 0) {
			velocidadAspiracion--;
		}
	}

	/**
	 * Método toString de la clase hija "MandoAspiradora" el cual llama al toString
	 * del padre y también muestra el atributo de su propia clase
	 */
	@Override
	public String toString() {
		return super.toString() + " - Aspiradora" + "\nVelocidad: " + velocidadAspiracion;
	}

}
