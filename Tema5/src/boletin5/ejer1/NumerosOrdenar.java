package boletin5.ejer1;

import java.util.Arrays;
import java.util.Random;

public class NumerosOrdenar {

	public static void main(String[] args) {

		// random
		Random rand = new Random();

		// array
		int[] listaNumeros = new int[20];

		for (int i = 0; i < listaNumeros.length; i++) {
			listaNumeros[i] = rand.nextInt(1, 101);
		}

		System.out.println(Arrays.toString(listaNumeros));

	}

}
