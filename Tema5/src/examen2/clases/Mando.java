package examen2.clases;

/**
 * Clase mando que gestiona a todos los mandos que hereden de ella o a los
 * objetos de la misma. Hace uso de la interfaz comparable para establecer un
 * orden predeterminado
 */
public class Mando implements Comparable<Mando> {

	/**
	 * Atributo que representa el modelo del mando
	 */
	private String modelo;

	/**
	 * Atributo que representa la anchura del mando
	 */
	private double anchura;

	/**
	 * Atributo que representa la altura del mando
	 */
	private double altura;

	/**
	 * Atributo que representa el precio del mando
	 */
	private double precio;

	/**
	 * Atributo que representa el estado del mando (encendido/apagado)
	 */
	private boolean encendidoApagado;

	/**
	 * Constructor del objeto de la clase mando con todos sus parámetros incluyendo
	 * que si se introduce erroneamente el nombre del modelo lanzará una excepción
	 * 
	 * @param modelo  Modelo del mando
	 * @param anchura Anchura del mando
	 * @param altura  Altura del mando
	 * @param precio  Precio del mando
	 */
	public Mando(String modelo, double anchura, double altura, double precio) throws ModeloNombreException {
		if (modelo != null && !modelo.isBlank()) {
			this.modelo = modelo;
		} else {
			throw new ModeloNombreException();
		}

		if (anchura > 0) {
			this.anchura = anchura;
		}

		if (altura > 0) {
			this.altura = altura;
		}

		if (precio > 0) {
			this.precio = precio;
		}
	}

	/**
	 * Método que obtiene el modelo del objeto
	 * 
	 * @return una cadena con el nombre del modelo del mando
	 */
	public String getModelo() {
		return modelo;
	}

	/**
	 * Método que obtiene la anchura del mando
	 * 
	 * @return un nº decimal que es la anchura
	 */
	public double getAnchura() {
		return anchura;
	}

	/**
	 * Método que obtiene la altura del mando
	 * 
	 * @return un nº decimal que es la altura
	 */
	public double getAltura() {
		return altura;
	}

	/**
	 * Método que obtiene el precio del objeto
	 * 
	 * @return un nº decimal que es el precio
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * Método que actualiza el precio del mando
	 * 
	 * @param precio Precio del mando
	 */
	public void setPrecio(double precio) {
		if (precio > 0) {
			this.precio = precio;
		}
	}

	/**
	 * Método que obtiene el estado del objeto
	 * 
	 * @return un valor booleano. True si está encendido el mando y false si está
	 *         apagado
	 */
	public boolean isEncendidoApagado() {
		return encendidoApagado;
	}

	/**
	 * Método que sirve para cambiar el estado del mando. Si el mando ya está
	 * encendido entonces cambiará su estado a apagado y si el mando por el
	 * contrario ya está apagado entonces lo encenderá
	 */
	public void onOff() {
		if (encendidoApagado) {
			encendidoApagado = false;
		} else {
			encendidoApagado = true;
		}
	}

	/**
	 * Método equals que define si dos objetos son iguales cuando el objeto por
	 * parámetro de entrada (casteado a la clase) tiene el mismo nombre de modelo
	 * que el objeto actual
	 */
	@Override
	public boolean equals(Object obj) {
		boolean sonIguales = false;

		// objeto casteado a la clase
		Mando mando = (Mando) obj;

		if (this.modelo.equalsIgnoreCase(mando.modelo)) {
			sonIguales = true;
		}

		return sonIguales;
	}

	/**
	 * Método toString que muestra todos los datos del objeto
	 */
	@Override
	public String toString() {
		String estado = "";

		if (encendidoApagado) {
			estado = "Encendido";
		} else {
			estado = "Apagado";
		}

		return "MANDO\n===========\nModelo:" + modelo + "\tAnchura: " + anchura + "\tAltura: " + altura + "\tPrecio: "
				+ precio + "\tEstado: " + estado;
	}

	/**
	 * Método implementado de la interfaz Comparable que ordena los objetos por el
	 * nombre del modelo alfabéticamente
	 */
	@Override
	public int compareTo(Mando o) {
		return this.modelo.compareTo(o.modelo);
	}

}
