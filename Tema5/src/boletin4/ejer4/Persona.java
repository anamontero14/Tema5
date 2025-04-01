package boletin4.ejer4;

public class Persona extends Contacto {

	private String cumpleaños;

	Persona(String nombre, int telefono, String cumpleaños) {
		super(nombre, telefono);

		if (cumpleaños != null && !cumpleaños.isBlank()) {
			this.cumpleaños = cumpleaños;
		}
	}

	public String getCumpleaños() {
		return cumpleaños;
	}

}
