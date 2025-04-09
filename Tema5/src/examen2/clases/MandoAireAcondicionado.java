package examen2.clases;

/**
 * Clase que hereda de mando e implementa Velocidad. Sirve para gestionar
 * aquellos objetos de clase MandoAireAcondicionado
 */
public class MandoAireAcondicionado extends Mando implements Velocidad {

	/**
	 * Enumerado con todos los tipos posibles en los que puede estar el mando del
	 * aire
	 */
	enum Modo {
		FRIO, CALOR
	};

	/**
	 * Atributo que almacena el modo que marca el mando del aire acondicionado
	 */
	Modo modoAire = Modo.FRIO;

	/**
	 * Atributo que marca la temperatura el cual por defecto se establece a 20
	 * grados.
	 */
	int temperatura = 20;

	/**
	 * Atributo que hace referencia a la velocidad del aire acondicionado que se
	 * marque en el mando
	 */
	private int velocidad = 0;

	/**
	 * Constructor con todos los parámetros de su clase padre
	 * 
	 * @param modelo  Modelo del mando
	 * @param anchura Anchura del mando
	 * @param altura  Altura del mando
	 * @param precio  Precio del mando
	 * @throws ModeloNombreException Excepción que ocurre si se introduce
	 *                               incorrectamente el modelo
	 */
	public MandoAireAcondicionado(String modelo, double anchura, double altura, double precio)
			throws ModeloNombreException {
		super(modelo, anchura, altura, precio);
	}

	/**
	 * Método que sirve para obtener el modo en el que está actualmente el mando del
	 * aire acondicionado
	 * 
	 * @return un modo del enumerado (FRIO/CALOR)
	 */
	public Modo getModoAire() {
		return modoAire;
	}

	/**
	 * Método que actualiza el modo en el que se encuentra el aire
	 * 
	 * @param modoAire Modo del aire acondicionado
	 */
	public void setModoAire(String modoAire) {
		switch (modoAire) {
		case "CALOR" -> {
			this.modoAire = Modo.CALOR;
		}
		case "FRIO" -> {
			this.modoAire = Modo.FRIO;
		}
		}
	}

	/**
	 * Método que se encarga de obtener la temperatura actual en la que se encuentra
	 * el mando del aire
	 * 
	 * @return un int que representa el nº de grados
	 */
	public int getTemperatura() {
		return temperatura;
	}

	/**
	 * Método que actualiza la temperatura en la que se encuentra el mando del aire
	 * acondicionado. No existe ninguna comprobación porque la temperatura puede ser
	 * un valor negativo y un valor positivo
	 * 
	 * @param temperatura La temperatura nueva que tendrá el aire
	 */
	public void setTemperatura(int temperatura) {
		this.temperatura = temperatura;
	}

	/**
	 * Método que obtiene la velocidad actual que marca el mando
	 * 
	 * @return nº entero que representa la velocidad
	 */
	public int getVelocidad() {
		return velocidad;
	}

	/**
	 * Método implementado de la interfaz Velocidad el cual sirve para subir el
	 * volumen hasta un límite establecido (5)
	 */
	@Override
	public void subirVelocidad() {
		if (velocidad < 5) {
			velocidad++;
		}
	}

	/**
	 * Método implementado de la interfaz Velocidad el cual sirve para bajar el
	 * volumen hasta un límite establecido (0)
	 */
	@Override
	public void bajarVelocidad() {
		if (velocidad > 0) {
			velocidad--;
		}
	}

	/**
	 * Método toString heredado de la clase padre que devuelve un String con todos
	 * los datos importantes tanto de la clase padre como de esta
	 */
	@Override
	public String toString() {
		return super.toString() + "\nMANDO DE AIRE ACONDICIONADO |" + " Velocidad: " + velocidad + "\tModo: " + modoAire
				+ "\tTemperatura: " + temperatura;
	}
}
