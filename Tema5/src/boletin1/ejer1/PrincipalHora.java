package boletin1.ejer1;

import java.util.Scanner;

public class PrincipalHora {

	static Scanner leer = new Scanner(System.in);

	public static void main(String[] args) {

		// valores que hacen referencia a los atributos de la clase
		int hora;
		int minutos;
		int segundos;

		// creacion del objeto
		HoraExacta horaObj;

		// variable para guardar la opcion del menu
		int opcionMenu;

		// primero obligaré a que me introduzca una hora
		System.out.println("INSERTAR LA HORA\n==========");

		System.out.print("Segundos: ");
		segundos = leer.nextInt();
		// limpiar el buffer
		leer.nextLine();

		System.out.print("Minutos: ");
		minutos = leer.nextInt();
		// limpiar el buffer
		leer.nextLine();

		System.out.print("Hora: ");
		hora = leer.nextInt();
		// limpiar el buffer
		leer.nextLine();

		// hacer el constructor
		horaObj = new HoraExacta(hora, minutos, segundos);

		System.out.println(horaObj);
		System.out.println();

		// bucle para mostrar el menu
		do {

			// almacenar la respuesta de la opcion en la variable
			switch (opcionMenu = menu()) {
			case 1 -> {
				System.out.println("INCREMENTAR 1 MINUTO\n=====");
				// muestro la hora actual
				System.out.print("Hora: ");
				// la muestro por pantalla
				System.out.println(horaObj);

				// incremento 1 minuto
				horaObj.incremento();

				// muestro la hora incrementada
				System.out.println();
				System.out.print("Hora incrementada: ");
				System.out.println(horaObj);
			}

			case 2 -> {
				System.out.println("INCREMENTAR 1 SEGUNDO\n=====");
				// muestro la hora actual
				System.out.print("Hora: ");
				// la muestro por pantalla
				System.out.println(horaObj);

				// incremento 1 segundo
				horaObj.incrementoSegundos();

				// muestro la hora incrementada
				System.out.println();
				System.out.print("Hora incrementada: ");
				System.out.println(horaObj);
			}

			case 3 -> {
				System.out.println("CAMBIAR SEGUNDOS\n======");
				System.out.println("Hora: " + horaObj);
				System.out.print("Segundos nuevos: ");
				minutos = leer.nextInt();

				// le asigno los nuevos minutos
				horaObj.setSegundo(segundos);
				System.out.println("Hora nueva: " + horaObj);
			}

			case 4 -> {

				System.out.println("CAMBIAR MINUTOS\n======");
				System.out.println("Hora: " + horaObj);
				System.out.print("Minutos nuevos: ");
				minutos = leer.nextInt();

				// le asigno los nuevos minutos
				horaObj.setMinutos(minutos);
				System.out.println("Hora nueva: " + horaObj);

			}

			case 5 -> {
				System.out.println("CAMBIAR HORA\n======");
				System.out.println("Hora: " + horaObj);
				System.out.print("Hora nueva: ");
				hora = leer.nextInt();

				// le asigno la nueva hora
				horaObj.setHora(hora);
				System.out.println("Hora nueva: " + horaObj);
			}

			}

		} while (opcionMenu != 6);

		System.out.println("Fin del programa");

	}

	/**
	 * Función de menú
	 * 
	 * @return la opción escogida
	 */
	public static int menu() {

		int opcion;

		System.out.println();
		System.out.println("SELECCIONA UNA OPCIÓN:\n=============");
		System.out.println("\t1. Incrementar minutos");
		System.out.println("\t2. Incrementar segundos");
		System.out.println("\t3. Cambiar segundos");
		System.out.println("\t4. Cambiar minutos");
		System.out.println("\t5. Cambiar hora");
		System.out.println("\t6. Salir");

		System.out.print("Opción: ");
		opcion = leer.nextInt();
		System.out.println();

		return opcion;

	}

}
