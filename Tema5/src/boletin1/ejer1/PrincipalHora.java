package boletin1.ejer1;

import java.util.Scanner;

public class PrincipalHora {

	static Scanner leer = new Scanner(System.in);

	public static void main(String[] args) {

		// valores que hacen referencia a los atributos de la clase
		int hora;
		int minutos;

		// creacion del objeto
		Hora horaObj;

		// bucle para mostrar el menu
		

	}

	/**
	 * Función de menú
	 * 
	 * @return la opción escogida
	 */
	public int menu() {

		int opcion;

		System.out.println("SELECCIONA UNA OPCIÓN:\n=============");
		System.out.println("\t1. Insertar hora");
		System.out.println("\t2. Incrementar minutos");
		System.out.println("\t3. Cambiar minutos");
		System.out.println("\t4. Cambiar hora");
		System.out.println("\t5. Salir");

		System.out.print("Opción: ");
		opcion = leer.nextInt();

		return opcion;

	}

}
