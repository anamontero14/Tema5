package boletin4.ejer1;

public class Vehiculo {

	private String marca;
	private String modelo;
	private String color;
	private String matricula;

	private boolean motor = false;
	private int marcha = 0;
	private int velocidad = 0;

	Vehiculo(String matricula, String marca, String modelo, String color) {
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

	public void subirVelocidad(int velocidadDestino) {

		while (velocidad < velocidadDestino) {
			velocidad++;
			cambiarMarcha(velocidadDestino);
		}
	}

	public void bajarVelocidad() {

		while (velocidad >= 0) {
			velocidad--;
			cambiarMarcha(0);
		}
	}

	public void cambiarMarcha(int velocidadDestino) {
		for (int i = velocidad; i <= velocidadDestino; i++) {

			if (i >= 0 && i <= 30) {
				marcha = 1;
				System.out.println("Se cambió a la marcha: " + marcha);
			} else if (i > 30 && i <= 50) {
				marcha = 2;
				System.out.println("Se cambió a la marcha: " + marcha);
			} else if (i > 50 && i <= 70) {
				marcha = 3;
				System.out.println("Se cambió a la marcha: " + marcha);
			} else if (i > 70 && i <= 100) {
				marcha = 4;
				System.out.println("Se cambió a la marcha: " + marcha);
			} else {
				marcha = 5;
				System.out.println("Se cambió a la marcha: " + marcha);
			}

		}
	}

}
