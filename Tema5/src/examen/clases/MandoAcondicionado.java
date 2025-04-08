package examen.clases;

/**
 * Clase MandoAcondicionado que es hija de "MandoADistancia" e implementa la
 * interfaz velocidad, gestionando asi a los mandos de aire acondicionado
 */
public class MandoAcondicionado extends MandoADistancia implements Velocidad {

	/**
	 * Modos en los que puede estar el mando del aire
	 */
	enum ModoAire {
		FRIO, CALOR
	};

	/**
	 * Atributo que almacena el modo del mando del aire
	 */
	private ModoAire modo = ModoAire.FRIO;

	/**
	 * Atributo que almacena la velocidad actual, por defecto está en 0
	 */
	private int velocidadAire = 0;

	/**
	 * Atributo que representa la temperatura actual, que por
	 */
	private int temperatura = 0;

	/**
	 * Constructor que hereda del padre
	 * 
	 * @param modelo - Modelo del mando
	 * @param altura - Altura del mando
	 * @param precio - Precio del mando
	 */
	public MandoAcondicionado(String modelo, double altura, double precio) {
		super(modelo, altura, precio);
	}

	/**
	 * Método get que devuelve el modo del aire
	 * 
	 * @return String que hace referencia al modo del mando
	 */
	public ModoAire getModo() {
		return modo;
	}

	/**
	 * Método set que se encarga de actualizar el modo del mando
	 * 
	 * @param modo - Modo del aire acondicionado (FRIO/CALOR)
	 */
	public void setModo(String modo) {
		switch (modo) {
		case "FRIO" -> {
			this.modo = ModoAire.FRIO;
		}
		case "CALOR" -> {
			this.modo = ModoAire.CALOR;
		}
		}
	}

	/**
	 * Método get que recoge la velocidad actual de la aspiradora
	 * 
	 * @return un número que representa la velocidad actual de la aspiradora
	 */
	public int getVelocidad() {
		return velocidadAire;
	}

	/**
	 * Método set que actualiza la velocidad actual de la aspiradora
	 * 
	 * @param velocidadAspiracion - Velocidad nueva
	 */
	public void setVelocidad(int velocidad) {
		this.velocidadAire = velocidad;
	}

	/**
	 * Método get que devuelve la temperatura actual que tiene el mando
	 * 
	 * @return número que hace referencia a la temperatura que tiene el mando
	 */
	public int getTemperatura() {
		return temperatura;
	}

	/**
	 * Método que actualiza la temperatura del mando
	 * 
	 * @param temperatura - Temperatura nueva del mando
	 */
	public void setTemperatura(int temperatura) {
		this.temperatura = temperatura;
	}

	/**
	 * Sube la velocidad de la aspiradora MIENTRAS que esta sea menor que 5, es
	 * decir que si la velocidad es 5 no la subirá más
	 */
	@Override
	public void subirVelocidad() {
		if (velocidadAire < 5) {
			velocidadAire++;
		}
	}

	/**
	 * Baja la velocidad de la aspiradora MIENTRAS que esta sea mayor que 0, es
	 * decir que si la velocidad es 0 no la bajará más
	 */
	@Override
	public void bajarVelocidad() {
		if (velocidadAire > 0) {
			velocidadAire--;
		}
	}

	/**
	 * Método toString de la clase hija "MandoAcondicionado" el cual llama al
	 * toString del padre y también muestra los atributos de su propia clase
	 */
	@Override
	public String toString() {
		return super.toString() + " - Acondicionado" + "\nModo: " + modo + "\nVelocidad: " + velocidadAire
				+ "\nTemperatura" + temperatura;
	}
}
