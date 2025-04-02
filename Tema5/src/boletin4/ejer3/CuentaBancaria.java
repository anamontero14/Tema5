package boletin4.ejer3;

import java.util.TreeSet;

public class CuentaBancaria {

	private String numCuenta;
	private double saldo;

	private TreeSet<Titular> titulares = new TreeSet<Titular>();

	public CuentaBancaria(Titular t) {
		if (t != null) {
			titulares.add(t);
		}
	}

	public CuentaBancaria(String numCuenta, double saldo) {
		if (saldo >= 0) {
			this.saldo = saldo;
		}

		if (numCuenta != null && !numCuenta.isBlank()) {
			this.numCuenta = numCuenta;
		}
	}

	// private TreeSet<Titular> (mín: 1, máx: 3) {};

	public String getNumCuenta() {
		return numCuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * Método para ingresar dinero en la cuenta (añadir dinero al saldo el cual le
	 * llega por parámetros)
	 * 
	 * @param dineroIngreso - El dinero que se va a ingresar
	 */
	public void ingresar(double dineroIngreso) {
		if (dineroIngreso > 0) {
			this.saldo += dineroIngreso;
		}
	}

	/**
	 * Método que retira el dinero que le entra por parámetro al saldo de la cuenta
	 * 
	 * @param dineroRetirar - El dinero que se retirará del saldo
	 */
	public void retirar(double dineroRetirar) {
		if (dineroRetirar > 0) {
			this.saldo -= dineroRetirar;
		}
	}

	/**
	 * Método que añade un titular a la lista de los titulares
	 * 
	 * @param t - Objeto de un titular con todos los datos que le corresponden
	 * @return devuelve un booleano dependiendo de cómo haya salido la operación de
	 *         añadir a la lista de titulares. Si se pudo añadir devolverá true y si
	 *         no devolverá false
	 */
	public boolean añadirTitular(Titular t) {
		boolean sePuede = false;

		if (t != null) {
			sePuede = titulares.add(t);
		}

		return sePuede;
	}

	/**
	 * Método que se encarga de eliminar el titular que le llega por parámetro
	 * 
	 * @param t - Titular que se eliminará
	 * @return devuelve un booleano dependiendo de cómo haya salido la operación de
	 *         eliminar de la lista de titulares. Si se pudo eliminar devolverá true
	 *         y si no devolverá false
	 */
	public boolean eliminarTitular(Titular t) {

		boolean sePuede = false;

		if (t != null) {
			sePuede = titulares.remove(t);
		}

		return sePuede;

	}

}
