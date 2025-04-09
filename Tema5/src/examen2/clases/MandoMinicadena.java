package examen2.clases;

/**
 * Clase que hereda de mando e implementa sus propios métodos.
 */
public class MandoMinicadena extends Mando implements Volumen {

	/**
	 * Atributo que hace referencia al volumen que marca el mando de la minicadena y
	 * que por defecto está a 0
	 */
	private int volumen = 0;

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
	public MandoMinicadena(String modelo, double anchura, double altura, double precio) throws ModeloNombreException {
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
	 * Método que incrementa el volumen por 10 cada vez que se le llama
	 */
	@Override
	public void subirVolumen() {
		volumen += 10;
	}

	/**
	 * Método que decrementa el volumen por 10 cada vez que se le llama comprobando
	 * siempre que el volumen no sea 0 ya que si el volumen fuera 0 y se baja
	 * entonces el volumen sería un nº negativo
	 */
	@Override
	public void bajarVolumen() {
		if (volumen > 0) {
			volumen -= 10;
		}
	}

	/**
	 * Método toString de la clase hija MandoTelevision que llama al toString del
	 * padre y que a su vez añade sus propios atributos
	 */
	@Override
	public String toString() {
		return super.toString() + "\nMANDO DE MINICADENA |" + " Volumen: " + volumen;
	}
}
