package examen.clases;

/**
 * Clase padre que gestionará toda clase de mandos a distancia
 */
public class MandoADistancia implements Comparable<MandoADistancia> {

	/**
	 * Modelo del mando
	 */
	private String modelo;

	/**
	 * Altura del mando
	 */
	private double altura;

	/**
	 * Precio del mando
	 */
	private double precio;

	/**
	 * Si el mando está encendido o apagado, por defecto el mando estará apagado
	 */
	private boolean botonEncendido = false;

	/**
	 * Constructor del objeto con todos los parametros menos con el estado de el
	 * mando (encendido o apagado)
	 * 
	 * @param modelo - Modelo del mando
	 * @param altura - Altura del mando
	 * @param precio - Precio del mando
	 */
	public MandoADistancia(String modelo, double altura, double precio) {
		if (modelo != null && !modelo.isBlank()) {
			this.modelo = modelo;
		}

		if (altura > 0) {
			this.altura = altura;
		}

		if (precio > 0) {
			this.precio = precio;
		}
	}

	/**
	 * Método get que coge el modelo del mando
	 * 
	 * @return Un string con el modelo que ha obtenido
	 */
	public String getModelo() {
		return modelo;
	}

	/**
	 * Método set que actualiza el modelo del mando
	 * 
	 * @param modelo - Modelo del mando
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	/**
	 * Método get que coge la altura del mando
	 * 
	 * @return Un double con la altura que ha obtenido
	 */
	public double getAltura() {
		return altura;
	}

	/**
	 * Método set que actualiza la altura del mando
	 * 
	 * @param altura - Altura del mando
	 */
	public void setAltura(double altura) {
		this.altura = altura;
	}

	/**
	 * Método get que coge el precio del mando
	 * 
	 * @return Un double con el precio que ha obtenido
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * Método set que actualiza el precio del mando
	 * 
	 * @param precio - Precio del mando
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	/**
	 * Método "get" que coge el estado del mando
	 * 
	 * @return Un boolean que será true si está encendido y false si está apagado;
	 */
	public boolean isBotonEncendido() {
		return botonEncendido;
	}

	/**
	 * Método set que actualiza el estado del mando
	 * 
	 * @param botonEncendido - Estado del mando
	 */
	public void setBotonEncendido(boolean botonEncendido) {
		this.botonEncendido = botonEncendido;
	}

	/**
	 * Método que sirve para encender el mando (pone el atributo a true)
	 */
	public void encenderMando() {
		this.botonEncendido = true;
	}

	/**
	 * Método que sirve para apagar el mando (pone el atributo a false)
	 */
	public void apagarMando() {
		this.botonEncendido = false;
	}

	/**
	 * Método equals que designa que un mando es igual a otro si tienen el mismo
	 * modelo
	 */
	@Override
	public boolean equals(Object obj) {
		boolean sonIguales = false;

		MandoADistancia mando = (MandoADistancia) obj;
		// si tienen el mismo modelo
		if (this.modelo.equalsIgnoreCase(mando.modelo)) {
			sonIguales = true;
		}

		return sonIguales;
	}

	/**
	 * Método toString que muestra toda la información del objeto que lo llame
	 */
	@Override
	public String toString() {
		return "MANDO A DISTANCIA\n Modelo: " + modelo + "\nAltura: " + altura + "\nPrecio: " + precio + "\nEncendido: "
				+ botonEncendido;
	}

	/**
	 * Ordena de manera predeterminada por el nombre del modelo del mando
	 * alfabéticamente
	 */
	@Override
	public int compareTo(MandoADistancia o) {
		return this.modelo.compareTo(o.modelo);
	}

}
