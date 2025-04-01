package boletin4.ejer2;

public class Revista extends Ficha {

	private int numRevista;
	private int añoPublicacion;

	Revista(int num, String titulo, int numRevista, int añoPublicacion) {
		super(num, titulo);

		if (numRevista > 0) {
			this.numRevista = numRevista;
		}

		if (añoPublicacion > 0) {
			this.añoPublicacion = añoPublicacion;
		}

	};

	public int getNumRevista() {
		return numRevista;
	};

	public int getAñoPublicacion() {
		return añoPublicacion;
	}

	@Override
	public boolean prestar(int tiempoAPrestar) {

		boolean sePresta = false;

		if (tiempoAPrestar <= 10) {
			sePresta = true;
		}

		return sePresta;
	};

}
