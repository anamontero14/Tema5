package boletin2.ejer2;

import java.util.Arrays;

public class PrincipalFutbolista {

	public static void main(String[] args) {

		// ARRAY
		Futbolista[] tablaDeSocios;

		// almacena el resultado del compare to
		int resultado = 0;

		// objetos
		Futbolista fut1 = new Futbolista(4, "Jose Manuel", 23, 45);
		Futbolista fut2 = new Futbolista(6, "Gerard", 16, 35);
		Futbolista fut3 = new Futbolista(13, "James", 30, 46);
		Futbolista fut4 = new Futbolista(4, "Jose Manuel", 26, 26);
		Futbolista fut5 = new Futbolista(8, "Miguel Santos", 34, 55);

		// los meto en un array
		tablaDeSocios = new Futbolista[] { fut1, fut2, fut3, fut4, fut5 };

		// ordeno el array
		Arrays.sort(tablaDeSocios);

		// hago un bucle y comparo
		for (Futbolista fut : tablaDeSocios) {
			System.out.println(fut);
			if (fut.equals(fut2)) {
				System.out.println(fut + " y " + fut2 + " son iguales");
			} else {
				System.out.println(fut + " y " + fut2 + " son diferentes");
			}
			resultado = fut.compareTo(fut3);
			System.out.println(resultado);
			System.out.println();
		}

	}

}
