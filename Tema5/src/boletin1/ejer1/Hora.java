package boletin1.ejer1;

public class Hora {

	/**
	 * Atributo que representa la hora
	 */
	int hora;

	/**
	 * Atributo que representa los minutos
	 */
	int minuto;

	/**
	 * Construye un objeto con los datos pasados como parámetros. Comprueba que los
	 * valores sean correctos
	 * 
	 * @param hora
	 * @param minuto
	 */
	Hora(int hora, int minuto) {

		if (hora >= 0 && hora <= 23) {
			this.hora = hora;
		}

		if (minuto >= 0 && minuto <= 59) {
			this.minuto = minuto;
		}
	}

	/**
	 * incrementa la hora en un minuto
	 */
	public void incremento() {
		int increMin;

		increMin = minuto++;

		if (increMin >= 60) {
			this.minuto = 0;
			this.hora++;
		}
	}

	/**
	 * Asigna un valor, si es válido, a los minutos. Devuelve true o false según
	 * haya sido posible modificar los minutos o no
	 * 
	 * @param valor
	 * @return true o false dependiendo de la valiez de la operación
	 */
	public boolean setMinutos(int valor) {

		boolean validez = false;

		if (valor >= 0 && valor <= 59) {
			this.minuto = valor;
			validez = true;
		}

		return validez;
	}

	/**
	 * Asigna un valor, si está comprendido entre 0 y 23, a la hora. Devuelve true o
	 * false según haya sido posible cambiar la hora o no
	 * 
	 * @param valor
	 * @return true o false dependiendo de la valiez de la operación
	 */
	public boolean setHora(int valor) {

		boolean validez = false;

		if (valor >= 0 && valor <= 23) {
			this.hora = valor;
			validez = true;
		}

		return validez;
	}

	@Override
	public String toString() {
		String minutosCadena = "0";

		String devolver;

		if (minuto < 10) {
			minutosCadena += minuto;
			devolver = hora + ":" + minutosCadena;
		} else {
			devolver = hora + ":" + minuto;
		}

		return devolver;
	}

}
