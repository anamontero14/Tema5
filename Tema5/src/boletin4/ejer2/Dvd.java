package boletin4.ejer2;

public class Dvd extends Ficha {

	enum Tipo {
		PELICULA, DOCUMENTAL, SERIE
	};

	private String director;
	private int año;
	private Tipo tipoDvd = Tipo.PELICULA;

	Dvd(int num, String titulo, String director, int año, String tipoDvd) {
		super(num, titulo);

		if (año > 0) {
			this.año = año;
		}

		comprobarTipo(tipoDvd);

	};

	public String getDirector() {
		return director;
	};

	public int getAño() {
		return año;
	};

	public Tipo getTipoDvd() {
		return tipoDvd;
	};

	public void comprobarTipo(String tipoDvd) {
		if (tipoDvd != null) {
			switch (tipoDvd) {
			case "PELICULA", "DOCUMENTAL", "SERIE" -> this.tipoDvd = Tipo.valueOf(tipoDvd);
			}
		}
	}

	@Override
	public boolean prestar(int tiempoAPrestar) {
		boolean sePresta = false;

		if (tiempoAPrestar <= 5) {
			sePresta = true;
		}

		return sePresta;
	}

}
