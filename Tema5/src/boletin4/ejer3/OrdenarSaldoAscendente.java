package boletin4.ejer3;

import java.util.Comparator;

public class OrdenarSaldoAscendente implements Comparator<CuentaBancaria> {

	@Override
	public int compare(CuentaBancaria o1, CuentaBancaria o2) {

		int saldo1 = (int) o1.getSaldo();
		int saldo2 = (int) o2.getSaldo();

		return saldo1 - saldo2;
	}

}
