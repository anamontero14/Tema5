package boletin4.ejer3;

public class Transaccion {

	private int dia;
	private int mes;
	private int año;
	private String concepto;
	private int importe;

	Transaccion(int dia, int mes, int año, String concepto, int importe) {
		if (dia > 0) {
			this.dia = dia;
		}

		if (mes > 0 && mes <= 12) {
			this.mes = mes;
		}

		if (año > 0) {
			this.año = año;
		}

		if (concepto != null && !concepto.isBlank()) {
			this.concepto = concepto;
		}

		if (importe >= 0) {
			this.año = importe;
		}
	}

	public int getDia() {
		return dia;
	}

	public int getMes() {
		return mes;
	}

	public int getAño() {
		return año;
	}

	public String getConcepto() {
		return concepto;
	}

	public int getImporte() {
		return importe;
	}
}
