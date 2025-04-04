package boletin5.ejer1;

import java.util.Comparator;

public class OrdenarNumeros implements Comparator<Integer> {

	/**
	 * Ordena de forma decreciente
	 * 
	 * @return un numero
	 */
	@Override
	public int compare(Integer o1, Integer o2) {
		return o2 - o1;
	}

}
