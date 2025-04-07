package boletin4.ejer3;

import java.util.List;

public class CuentaAhorro extends CuentaBancaria {

	private List<Transaccion> transacciones;
	private double cuotaMantenimiento;
	private double interesAnual;

	CuentaAhorro(String numCuenta, double saldo, double cuotaMantenimiento, double interesAnual) throws SaldoExcepcion {
		super(numCuenta, saldo);

		if (cuotaMantenimiento >= 0) {
			this.cuotaMantenimiento = cuotaMantenimiento;
		}

		if (interesAnual >= 0) {
			this.interesAnual = interesAnual;
		}
	}

	public double getCuotaMantenimiento() {
		return cuotaMantenimiento;
	}

	public void setCuotaMantenimiento(double cuotaMantenimiento) {
		this.cuotaMantenimiento = cuotaMantenimiento;
	}

	public double getInteresAnual() {
		return interesAnual;
	}

	public void setInteresAnual(double interesAnual) {
		this.interesAnual = interesAnual;
	}

	public List<Transaccion> getTransacciones() {
		return transacciones;
	}

	public void setTransacciones(List<Transaccion> transacciones) {
		this.transacciones = transacciones;
	}

	public boolean realizarTransaccion(Transaccion t) {

		return false;
	}

}
