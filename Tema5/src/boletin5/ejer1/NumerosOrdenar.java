package boletin5.ejer1;

import java.util.Arrays;
import java.util.Random;

public class NumerosOrdenar {

	public static void main(String[] args) {

		// random
		Random rand = new Random();

		// array
		Integer[] listaNumeros = new Integer[20];

		for (int i = 0; i < listaNumeros.length; i++) {
			listaNumeros[i] = rand.nextInt(1, 101);
		}

		// mostrar la lista
		System.out.println(Arrays.toString(listaNumeros));

		// ordenar con expresiones lambda
		Arrays.sort(listaNumeros, (o1, o2) -> {
			return o2 - o1;
		});
		System.out.println();
		// mostrar la lista ordenada
		System.out.println(Arrays.toString(listaNumeros));

	}

}
