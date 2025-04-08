package examen.clases;

/**
 * Clase hija de MandoADistancia que gestiona todos los mandos de television e a
 * su vez implementa la interfaz de volumen
 */
public class MandoTelevision extends MandoADistancia implements Volumen {

	/**
	 * Atributo que corresponde al volumen actual del mando el cual estará por
	 * defecto a 0
	 */
	private int volumen = 0;

	/**
	 * Atributo que corresponde al canal actual del mando el cual estará por defecto
	 * a 1
	 */
	private int canal = 1;

	/**
	 * Constructor con todos los parámetros, heredados del padre y propios de la
	 * clase
	 * 
	 * @param modelo - Modelo del mando
	 * @param altura - Altura del mando
	 * @param precio - Precio del mando
	 */
	public MandoTelevision(String modelo, double altura, double precio) {
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
	 * Método get de canal el cual coge el canal en el que está el mando actualmente
	 * 
	 * @return un número que corresponde al canal actual
	 */
	public int getCanal() {
		return canal;
	}

	/**
	 * Método set que actualiza el canal en el que está el mando
	 * 
	 * @param canal - Canal del mando
	 */
	public void setCanal(int canal) {
		this.canal = canal;
	}

	/**
	 * Método que usa de la interfaz volumen el cual sube el volumen de 5 en 5
	 */
	@Override
	public void subirVolumen() {
		this.volumen += 5;
	}

	/**
	 * Método que usa de la interfaz volumen el cual baja el volumen de 5 en 5
	 */
	@Override
	public void bajarVolumen() {
		this.volumen -= 5;
	}

	/*
	 * public void cambiarCanal(int canalNuevo) { if (canalNuevo > 0) { this.canal =
	 * canalNuevo; } }
	 */

	/**
	 * Método toString de la clase hija "MandoMinicadena" el cual llama al toString
	 * del padre y también muestra los atributos de su propia clase
	 */
	@Override
	public String toString() {
		return super.toString() + " - Television" + "\nVolumen: " + volumen + "\nCanal: " + canal;
	}

}
