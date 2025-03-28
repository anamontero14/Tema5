package boletin4.ejer1;

public class Camion extends Vehiculo {

	private double pesoMax;
	private boolean mercanciaPeligrosa;

	Camion(String matricula, String marca, String modelo, String color, boolean motor, double pesoMax,
			boolean mercanciaPeligrosa) {
		super(matricula, marca, modelo, color, motor);

		if (pesoMax > 0) {
			this.pesoMax = pesoMax;
		}

		if (mercanciaPeligrosa == true || mercanciaPeligrosa == false) {
			this.mercanciaPeligrosa = mercanciaPeligrosa;
		}
	}

	public double getPesoMax() {
		return pesoMax;
	}

	public boolean isMercanciaPeligrosa() {
		return mercanciaPeligrosa;
	}

}
