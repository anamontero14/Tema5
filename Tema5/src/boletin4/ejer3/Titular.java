package boletin4.ejer3;

public class Titular implements Comparable<Titular> {

	private String dni;
	private String nombre;
	private String apellido;
	private long telefono;

	Titular(String dni, String nombre, String apellido, long telefono) {
		if (dni != null && !dni.isBlank()) {
			this.dni = dni;
		}

		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}

		if (apellido != null && !apellido.isBlank()) {
			this.apellido = apellido;
		}

		if (telefono >= 100000000) {
			this.telefono = telefono;
		}
	}

	public String getDni() {
		return dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public long getTelefono() {
		return telefono;
	}

	public void setTelefono(long telefono) {
		this.telefono = telefono;
	}

	@Override
	public int compareTo(Titular o) {

		return this.dni.compareTo(o.dni);
	}

}
