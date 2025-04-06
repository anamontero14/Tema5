package boletin4.ejer2;

import java.util.Comparator;

public class OrdenarAlfabeticamente implements Comparator<Ficha> {

	@Override
	public int compare(Ficha o1, Ficha o2) {
		return o1.getTitulo().compareTo(o2.getTitulo());
	}

}
