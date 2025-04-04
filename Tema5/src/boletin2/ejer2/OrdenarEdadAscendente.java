package boletin2.ejer2;

import java.util.Comparator;

public class OrdenarEdadAscendente implements Comparator<Futbolista> {

	/**
	 * Ordenar por la edad del jugador de forma ascendente
	 */
	@Override
	public int compare(Futbolista o1, Futbolista o2) {
		return o1.getEdadJugador() - o2.getEdadJugador();
	}

}
