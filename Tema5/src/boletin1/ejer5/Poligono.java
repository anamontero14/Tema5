package boletin1.ejer5;

public abstract class Poligono {

	/**
	 * Atributo que hace referencia al numero de lados de los poligonos
	 */
	protected int numLados;

	/**
	 * Constructor con el atributo protejido
	 * 
	 * @param numLados El nº de lados del objeto
	 */
	Poligono(int numLados) {
		if (numLados > 2) {
			this.numLados = numLados;
		}
	}

	/**
	 * Método get que devuelve el nº de lados del polígono
	 * 
	 * @return un nº entero que hace referencia al nº de lados
	 */
	public int getNumLados() {
		return numLados;
	}

	/**
	 * Método abstracto que devuelve el área del polígono
	 * 
	 * @return un nº decimal que es el área del polígono
	 */
	public abstract double area();

	/**
	 * Metodo toString que devuelve el nº de lados del polígono
	 */
	public String toString() {
		return "Nº de lados: " + numLados + " ";
	};

}
