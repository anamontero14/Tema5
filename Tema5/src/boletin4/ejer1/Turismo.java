package boletin4.ejer1;

public class Turismo extends Vehiculo {
	public enum TipoUso {
		PROFESIONAL, PARTICULAR
	};

	private TipoUso uso = TipoUso.PARTICULAR;

	private int numPlaz;

	Turismo(String matricula, String marca, String modelo, String color, int numPlazas, String tipo) {
		super(matricula, marca, modelo, color);

		if (numPlazas > 0) {
			this.numPlaz = numPlazas;
		}

		switch (tipo) {
		case "PROFESIONAL" -> this.uso = TipoUso.PROFESIONAL;
		}
	}

	public TipoUso getUso() {
		return uso;
	}

	public void setUso(String uso) {
		switch (uso) {
		case "PROFESIONAL" -> this.uso = TipoUso.PROFESIONAL;
		}
	}

	public int getNumPlaz() {
		return numPlaz;
	}

}
