package boletin4.ejer2;

public class Libro extends Ficha {

	private String autor;
	private String editorial;

	Libro(int num, String titulo, String autor, String editorial) {
		super(num, titulo);

		if (autor != null && !autor.isBlank()) {
			this.autor = autor;
		}

		if (editorial != null && !editorial.isBlank()) {
			this.editorial = editorial;
		}
	}

	public String getAutor() {
		return autor;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	/**
	 * Método heredado de la clase ficha el cuál varía, en caso de Libro solo puede
	 * ser prestado durante 15 días
	 * 
	 * @return devuelve un valor booleano, true si el tiempo a prestar es menor o
	 *         igual a 15 días y por ende se puede prestar o false si el tiempo a
	 *         prestar excede los 15 días
	 */
	@Override
	public boolean prestar(int tiempoAPrestar) {

		boolean sePresta = false;

		if (tiempoAPrestar <= 15) {
			sePresta = true;
		}

		return sePresta;
	};

}
