package boletin5.ejer1;

import java.util.Arrays;
import java.util.Random;

public class NumerosOrdenar extends OrdenarNumeros {

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

		// ordenarla dependiendo de lo que se haya especificado en ordenar numeros
		Arrays.sort(listaNumeros, new OrdenarNumeros());
		System.out.println();
		// mostrar la lista ordenada
		System.out.println(Arrays.toString(listaNumeros));

	}

}
