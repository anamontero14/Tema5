package boletin1.ejer4;

import java.util.LinkedList;

public class Principal {

	public static void main(String[] args) {

		// nueva lista donde guardar los electrodomesticos
		LinkedList<Electrodomestico> listaElectrodomesticos = new LinkedList<Electrodomestico>();

		// suma de todas las lavadoras
		double sumaLavadoras = 0;

		// suma teles
		double sumaTeles = 0;

		// suma de los electrodomesticos
		double sumaElectrodomesticos = 0;

		// objetos creados
		Lavadora lavadora1 = new Lavadora(34.4, 65, "BLANCO", 'A', 23);
		Lavadora lavadora2 = new Lavadora(456.4, 65, "NEGRO", 'D', 50);
		Television tele1 = new Television(145.45, 35, "NEGRO", 'B', 3, true);
		Television tele2 = new Television(678.45, 35, "NEGRO", 'A', 12, true);
		Electrodomestico elec1 = new Electrodomestico(67.45, "ROJO", 'D', 56.56);
		Electrodomestico elec2 = new Electrodomestico(678.32, "VERDE", 'F', 45);

		// añado los objetos
		listaElectrodomesticos.add(lavadora1);
		listaElectrodomesticos.add(lavadora2);
		listaElectrodomesticos.add(tele1);
		listaElectrodomesticos.add(tele2);
		listaElectrodomesticos.add(elec1);
		listaElectrodomesticos.add(elec2);

		// recorro la lista y muestro todos los objetos
		for (Electrodomestico electrodomestico : listaElectrodomesticos) {
			System.out.println(electrodomestico);
			System.out.println();
		}

		lavadora1.precioFinal();
		tele1.precioFinal();
		elec1.precioFinal();

		System.out.println("PRECIO FINAL\n=======================================================");
		for (Electrodomestico electrodomestico : listaElectrodomesticos) {

			if (electrodomestico instanceof Lavadora) {
				sumaLavadoras += electrodomestico.getPrecioBase();
			}

			if (electrodomestico instanceof Television) {
				sumaTeles += electrodomestico.getPrecioBase();
			}

			if (electrodomestico instanceof Electrodomestico) {
				sumaElectrodomesticos += electrodomestico.getPrecioBase();
			}

			System.out.println(electrodomestico);
			System.out.println();
		}

		// muestro las sumas
		System.out.println();
		System.out.println("Suma de las lavadoras: " + sumaLavadoras + " Suma de las teles: " + sumaTeles
				+ " Suma de los electrodomesticos: " + sumaElectrodomesticos);

	}

}
