package boletin4.ejer4;

import java.util.Scanner;

public class PrincipalCuenta {

	static Scanner leer = new Scanner(System.in);

	public static void main(String[] args) {

		// opcion del menu
		int opcion;

		// tipo del contacto
		String tipo;

		// nuevo contacto
		Contacto contacto;

		System.out.println("ADMINISTRAR CONTACTOS");

		do {

			menu();
			System.out.print("Opción: ");
			opcion = leer.nextInt();
			// limpiar el buffer
			leer.nextLine();

			switch (opcion) {

			case 1 -> {
				System.out.println("AÑADIR UN CONTACTO");
				System.out.println();

				System.out.print("¿Va a almacenar una persona o una empresa?: ");
				tipo = leer.nextLine().toUpperCase();

				contacto = recogerContacto(tipo);
			}

			}

		} while (opcion <= 4 && opcion >= 1);

	}

	private static void menu() {
		System.out.println("\t1. Añadir un contacto nuevo");
		System.out.println("\t2. Modificar un contacto");
		System.out.println("\t3. Borrar un contacto");
		System.out.println("\t4. Salir");
	}

	private static Contacto recogerContacto(String tipo) {
		Contacto contacto2 = null;

		// atributos
		String nombre;
		int numero;

		// de persona
		String cumpleaños;

		// de empresa
		String paginaWeb;

		System.out.print("Introduzca el nombre del contacto: ");
		nombre = leer.nextLine();

		System.out.print("Introduzca el número del contacto: ");
		numero = leer.nextInt();

		switch (tipo) {
		case "PERSONA" -> {
			System.out.print("Fecha de cumpleaños (xx/xx/xxxx): ");
			cumpleaños = leer.nextLine();

			contacto2 = new Persona(nombre, numero, cumpleaños);
		}
		case "EMPRESA" -> {
			System.out.print("Nombre de la página web: ");
			paginaWeb = leer.nextLine();

			contacto2 = new Empresa(nombre, numero, paginaWeb);
		}
		}

		return contacto2;
	}

}
