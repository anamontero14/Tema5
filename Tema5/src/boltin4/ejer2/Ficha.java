package boltin4.ejer2;

/**
 * Clase abstracta que gestiona los objetos de una libreria
 */
public abstract class Ficha {

	/**
	 * Atributo que almacena el nº del objeto
	 */
	private int num;

	/**
	 * Atributo que almacena el título del objeto
	 */
	private String titulo;

	/**
	 * Constructor padre de la ficha
	 * 
	 * @param num    - Numero de la ficha
	 * @param titulo - titulo del objeto
	 */
	Ficha(int num, String titulo) {
		if (num > 0) {
			this.num = num;
		}

		if (titulo != null && !titulo.isBlank()) {
			this.titulo = titulo;
		}
	};

	public int getNum() {
		return num;
	}

	public String getTitulo() {
		return titulo;
	}

	/**
	 * Clase abstracta porque va a variar dependiendo de si es un libro, una revista
	 * o un dvd
	 */
	public abstract boolean prestar(int tiempoAPrestar);

}
