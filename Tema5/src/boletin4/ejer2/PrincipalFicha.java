package boletin4.ejer2;

import java.util.Scanner;

public class PrincipalFicha {

	static Scanner leer = new Scanner(System.in);

	public static void main(String[] args) {

		Ficha obj;

		String tipo = "";
		int tiempoPrestado;

		System.out.print("¿Qué va a querer almacenar? (libro/revista/dvd): ");
		tipo = leer.nextLine().toUpperCase();

		obj = crearObj(tipo);

		System.out.print("¿Cuánto tiempo quiere tomar prestado el " + tipo + "?: ");
		tiempoPrestado = leer.nextInt();
		// limpiar buffer

		if (obj.prestar(tiempoPrestado)) {
			System.out.println("El " + tipo + " se pudo prestar durante " + tiempoPrestado + " días");
		} else {
			System.err.println("El " + tipo + " no se pudo prestar");
		}

		leer.nextLine();

		leer.close();
	}

	public static Ficha crearObj(String tipo) {
		int num;
		String titulo;

		// atributos de libro
		String autor;
		String editorial;

		// atributos de revista
		int numRevista;
		int añoPublicacion;

		// atributos de dvd
		String director;
		int año;
		String tipoDvd;

		// creo el objeto
		Ficha obj = null;

		System.out.println("INTRODUZCA LOS DATOS DEL" + tipo);

		System.out.print("Número: ");
		num = leer.nextInt();
		// limpiar buffer
		leer.nextLine();

		System.out.print("Título: ");
		titulo = leer.nextLine();

		switch (tipo) {
		case "LIBRO" -> {

			System.out.print("Autor: ");
			autor = leer.nextLine();

			System.out.print("Editorial: ");
			editorial = leer.nextLine();

			obj = new Libro(num, titulo, autor, editorial);
		}
		case "REVISTA" -> {

			System.out.print("Número de revista: ");
			numRevista = leer.nextInt();
			// limpiar el buffer
			leer.nextLine();
			System.out.print("Año de publicación: ");
			añoPublicacion = leer.nextInt();
			// limpiar el buffer
			leer.nextLine();

			obj = new Revista(num, titulo, numRevista, añoPublicacion);
		}
		case "DVD" -> {

			System.out.print("Director: ");
			director = leer.nextLine();
			System.out.print("Año: ");
			año = leer.nextInt();
			// limpiar el buffer
			leer.nextLine();
			System.out.print("Tipo del DVD (PELICULA/DOCUMENTAL/SERIE): ");
			tipoDvd = leer.nextLine().toUpperCase();

			obj = new Dvd(num, titulo, director, año, tipoDvd);
		}
		}

		return obj;
	}

}
