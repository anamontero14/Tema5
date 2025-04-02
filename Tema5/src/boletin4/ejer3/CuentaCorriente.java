package boletin4.ejer3;

import java.util.List;

public class CuentaCorriente extends CuentaBancaria {

	private List<Transaccion> transaccion;

	private double porcentaje;

	CuentaCorriente(String numCuenta, double saldo, double porcentaje) {
		super(numCuenta, saldo);

		if (porcentaje >= 0) {
			this.porcentaje = porcentaje;
		}
	}

	public List<Transaccion> getTransaccion() {
		return transaccion;
	}

	public void setTransaccion(List<Transaccion> transaccion) {
		this.transaccion = transaccion;
	}

	public double getPorcentaje() {
		return porcentaje;
	}

	public void setPorcentaje(double porcentaje) {
		this.porcentaje = porcentaje;
	}

}
