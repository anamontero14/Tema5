package boletin1.ejer1;

public class HoraExacta extends Hora {
	int segundos;

	HoraExacta(int hora, int minuto, int segundos) {

		// llamo al constructor de hora
		super(hora, minuto);

		if (segundos >= 0 && segundos <= 59) {
			this.segundos = segundos;
		}
	}

	/**
	 * Asigna, si está comprendido entre 0 y 59, el valor indicado a los segundos
	 * 
	 * @param segundos
	 * @return la validez de la operacion
	 */
	public boolean setSegundo(int segundos) {

		boolean validez = false;

		if (segundos >= 0 && segundos <= 59) {
			this.segundos = segundos;
		}

		return validez;

	}

	/**
	 * incrementa la hora en un segundo. Hará uso del método inc() de la superclase.
	 * 03:05:59 → 03:06:00
	 */
	public void incrementoSegundos() {

		// compruebo los segundos
		if (segundos == 59) {
			segundos = 0;
			minuto++;
		}

		if (minuto >= 59) {
			// llamo a la funcion de la superclase
			incremento();
		}
	}

	/**
	 * devuelve un String con la representación de la hora: hora:minutos:segundos.
	 * Ejemplo: 03:05:58
	 */
	public String toString() {
		String segundosCadena = "0";
		String horaMinutos = super.toString();

		String devuelve = "";

		if (segundos < 10) {
			segundosCadena += segundos;
			devuelve = horaMinutos + ":" + segundosCadena;
		} else {
			devuelve = horaMinutos + ":" + segundos;
		}

		return devuelve;
	}
}
