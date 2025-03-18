package boletin1.ejer5;

import java.util.Scanner;

public class PrincipalPoligono {

	static Scanner leer = new Scanner(System.in);

	public static void main(String[] args) {

		int opcion;

		Rectangulo rectan;
		Triangulo trian;

		do {

			menu();
			System.out.print("Opción: ");
			opcion = leer.nextInt();
			// limpiar buffer
			leer.nextLine();

			switch (opcion) {
			case 1 -> {
				trian = crearTriangulo();

				if (CrudPoligono.crearTriangulo(trian)) {
					System.out.println();
					System.out.println("\tEl triángulo se pudo añadir");
				} else {
					System.out.println();
					System.err.println("\tEl triángulo no se pudo añadir");
				}
			}
			case 2 -> {

				rectan = crearRectangulo();

				if (CrudPoligono.crearRectangulo(rectan)) {
					System.out.println();
					System.out.println("\tEl rectángulo se pudo añadir");
				} else {
					System.out.println();
					System.err.println("\tEl rectángulo no se pudo añadir");
				}
			}
			case 3 -> {
				System.out.println();
				System.out.println("MOSTRAR POLÍGONOS");

				CrudPoligono.mostrarPoligonos();
			}
			default -> {
				System.err.println("Opción no válida");
			}
			}

		} while (opcion <= 3 || opcion >= 1);

		// cerrar scanner
		leer.close();

	}

	private static void menu() {
		System.out.println();
		System.out.println("Menú: ");
		System.out.println("\t1. Introducir triángulo");
		System.out.println("\t2. Introducir rectángulo");
		System.out.println("\t3. Mostrar polígono");
	}

	private static Triangulo crearTriangulo() {
		double lado1;
		double lado2;
		double lado3;

		Triangulo trian;

		System.out.println("CREAR TRIÁNGULO");
		System.out.println();
		lado1 = pedirLado();
		lado2 = pedirLado();
		lado3 = pedirLado();

		trian = new Triangulo(lado1, lado2, lado3);
		return trian;
	}

	private static Rectangulo crearRectangulo() {
		double lado1;
		double lado2;

		Rectangulo rectang;

		System.out.println("CREAR TRIÁNGULO");
		System.out.println();
		lado1 = pedirLado();
		lado2 = pedirLado();

		rectang = new Rectangulo(lado1, lado2);
		return rectang;
	}

	private static double pedirLado() {
		double lado;

		System.out.print("Introduce el lado: ");
		lado = leer.nextDouble();

		return lado;
	}

}
