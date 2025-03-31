package boletin4.ejer1;

public class Motocicleta extends Vehiculo {

	private int cilindrada;
	private boolean carnet;

	Motocicleta(String matricula, String marca, String modelo, String color, int cilindrada, boolean carnet) {
		super(matricula, marca, modelo, color);

		if (cilindrada > 0) {
			this.cilindrada = cilindrada;
		}

		if (carnet == true || carnet == false) {
			this.carnet = carnet;
		}
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public boolean getCarnet() {
		return carnet;
	}

	public void setCarnet(boolean carnet) {
		if (carnet == true || carnet == false) {
			this.carnet = carnet;
		}
	}

	public void comprobarCarnet() {
		if (cilindrada > 125) {
			carnet = true;
		}
	}
}
