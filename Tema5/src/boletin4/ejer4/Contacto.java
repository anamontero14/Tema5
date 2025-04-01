package boletin4.ejer4;

public class Contacto {

	private String nombre;
	private int telefono;

	Contacto(String nombre, int telefono) {
		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}

		if (telefono > 0) {
			this.telefono = telefono;
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	@Override
	public boolean equals(Object obj) {

		boolean sonIguales = false;

		// objeto
		Contacto contacto = (Contacto) obj;

		if (this.nombre.equalsIgnoreCase(contacto.nombre)) {
			sonIguales = true;
		}

		return sonIguales;
	}

}
