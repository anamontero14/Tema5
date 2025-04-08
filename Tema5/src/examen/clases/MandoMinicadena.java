package examen.clases;

/**
 * Clase hija que hereda de MandoADistancia y que implementa la interfaz de
 * Volumen que gestiona los mandos mini cadena
 */
public class MandoMinicadena extends MandoADistancia implements Volumen {

	/**
	 * Atributo que representa el volumen que estará por defecto a 0
	 */
	private int volumen = 0;

	/**
	 * Constructor con los mismos parámetros que el mando a distancia normal ya que
	 * el volumen ya tiene un valor por defecto
	 * 
	 * @param modelo - Modelo del mando
	 * @param altura - Altura del mando
	 * @param precio - Precio del mando
	 */
	public MandoMinicadena(String modelo, double altura, double precio) {
		super(modelo, altura, precio);
	}

	/**
	 * Método get de volumen el cual coge el volumen actual en el que está el mando
	 * 
	 * @return un número que corresponde con el volumen actual
	 */
	public int getVolumen() {
		return volumen;
	}

	/**
	 * Método set que actualiza el volumen del mando
	 * 
	 * @param volumen - Número que es el volumen del mando
	 */
	public void setVolumen(int volumen) {
		this.volumen = volumen;
	}

	/**
	 * Método que se encarga de subir el volumen de 10 en 10 (sumarle 10 al volumen)
	 */
	@Override
	public void subirVolumen() {
		this.volumen += 10;
	}

	/**
	 * Método que se encarga de bajar el volumen de 10 en 10 (restarle 10 al
	 * volumen)
	 */
	@Override
	public void bajarVolumen() {
		this.volumen -= 10;
	}

	/**
	 * Método toString de la clase hija "MandoMinicadena" el cual llama al toString
	 * del padre y también muestra el atributo de su propia clase
	 */
	@Override
	public String toString() {
		return super.toString() + " - Minicadena" + "\nVolumen: " + volumen;
	}

}
