package boletin4.ejer1;

public class Vehiculo{

	private String marca;
	private String modelo;
	private String color;
	private String matricula;

	private boolean motor;
	private int marcha;
	private int velocidad;

	Vehiculo(String matricula) {
		if (matricula != null && !matricula.isBlank()) {
			this.matricula = matricula;
		}
	}

	Vehiculo(String matricula, String marca, String modelo, String color, boolean motor, int marcha, int velocidad) {
		if (matricula != null && !matricula.isBlank()) {
			this.matricula = matricula;
		}

		if (marca != null && !marca.isBlank()) {
			this.marca = marca;
		}

		if (modelo != null && !modelo.isBlank()) {
			this.modelo = modelo;
		}

		if (color != null && !color.isBlank()) {
			this.color = color;
		}

		if (motor == true || motor == false) {
			this.motor = motor;
		}

		if (marcha <= 5) {
			this.marcha = marcha;
		}

		if (velocidad >= 0) {
			this.velocidad = velocidad;
		}
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMatricula() {
		return matricula;
	}

	public boolean getMotor() {
		return motor;
	}

	public void setMotor(boolean motor) {
		this.motor = motor;
	}

	public int getMarcha() {
		return marcha;
	}

	public void setMarcha(int marcha) {
		this.marcha = marcha;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public void parar() {
		motor = false;
		velocidad = 0;
		marcha = 0;
	}

	public void arrancar() {
		motor = true;
		velocidad = 0;
		marcha = 1;
	}

	public int subirMarcha() {
		int marchaActual;

		marchaActual = marcha + 1;

		if (marchaActual > 5) {
			marchaActual = 5;
		}

		return marchaActual;
	};

	public int bajarMarcha() {
		int marchaActual;

		marchaActual = marcha - 1;

		if (marchaActual < 0) {
			marchaActual = 0;
		}

		return marchaActual;
	};

	public int velocidadALlegar(int velocidad) {
		int velocidadALlegar = 0;

		if (velocidad >= 0) {
			velocidadALlegar = velocidad;
		}

		return velocidadALlegar;
	}

}
