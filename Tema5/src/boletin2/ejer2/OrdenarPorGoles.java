package boletin2.ejer2;

import java.util.Comparator;

public class OrdenarPorGoles implements Comparator<Futbolista> {

	/**
	 * Ordenar por goles de manera ascendente
	 */
	@Override
	public int compare(Futbolista o1, Futbolista o2) {
		return o2.getNumGoles() - o1.getNumGoles();
	}
}
