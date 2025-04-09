package examen2.clases;

/**
 * Clase hija de mando que implementa la interfaz velocidad y que hace uso de
 * sus métodos mediante overriding.
 */
public class MandoAspiradora extends Mando implements Velocidad {

	/**
	 * Atributo que hace referencia a la velocidad de aspiración que marca el mando
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
	public MandoAspiradora(String modelo, double anchura, double altura, double precio) throws ModeloNombreException {
		super(modelo, anchura, altura, precio);
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
	 * volumen hasta un límite establecido (3)
	 */
	@Override
	public void subirVelocidad() {
		if (velocidad < 3) {
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
		return super.toString() + "\nMANDO DE ASPIRADORA |" + " Velocidad: " + velocidad;
	}

}
