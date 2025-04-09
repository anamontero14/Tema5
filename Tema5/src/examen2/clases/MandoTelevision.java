package examen2.clases;

/**
 * Clase que extiende de la clase Mando y que a su vez implementa la interfaz
 * volumen. Mando es su padre
 */
public class MandoTelevision extends Mando implements Volumen {

	/**
	 * Atributo que hace referencia al volumen que marca el mando de la television y
	 * que por defecto está a 0
	 */
	private int volumen = 0;

	/**
	 * Atributo que hace referencia al canal del mando de la television y que por
	 * defecto está en el canal 1
	 */
	private int canal = 1;

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
	public MandoTelevision(String modelo, double anchura, double altura, double precio) throws ModeloNombreException {
		super(modelo, anchura, altura, precio);
	}

	/**
	 * Método que sirve para obtener el volumen que tiene actualmente el mando
	 * 
	 * @return un nº entero el cual hace referencia al volumen del mando
	 */
	public int getVolumen() {
		return volumen;
	}

	/**
	 * Método que sirve para obtener el canal en el que está el mando actualmente
	 * 
	 * @return un nº entero que hace referencia al canal
	 */
	public int getCanal() {
		return canal;
	}

	/**
	 * Método que sirve para cambiar el canal por el que se le pase por parámetro.
	 * Si el canal que se le pasa es mayor que 0 significa que es un canal posible y
	 * por lo tanto le asigna el nuevo valor al atributo
	 * 
	 * @param canalNuevo Nº entero que hace referencia al canal nuevo
	 */
	public void cambiarCanal(int canalNuevo) {
		if (canalNuevo > 0) {
			this.canal = canalNuevo;
		}
	}

	/**
	 * Método que incrementa el volumen por 5 cada vez que se le llama
	 */
	@Override
	public void subirVolumen() {
		volumen += 5;
	}

	/**
	 * Método que decrementa el volumen por 5 cada vez que se le llama comprobando
	 * siempre que el volumen no sea 0 ya que si el volumen fuera 0 y se baja
	 * entonces el volumen sería un nº negativo
	 */
	@Override
	public void bajarVolumen() {
		if (volumen > 0) {
			volumen -= 5;
		}
	}

	/**
	 * Método toString de la clase hija MandoTelevision que llama al toString del
	 * padre y que a su vez añade sus propios atributos
	 */
	@Override
	public String toString() {
		return super.toString() + "\nMANDO DE TELEVISIÓN |" + " Volumen: " + volumen + "\tCanal: " + canal;
	}

}
