package boletin4.ejer1;

import java.util.Scanner;

public class PrincipalVehiculo {

	static Scanner leer = new Scanner(System.in);

	public static void main(String[] args) {

		// objeto
		Vehiculo vehi;

		// opcion del menu
		int opcion;
		// tipo del vehiculo
		String tipoVehiculo;
		// velocidad a llegar
		int velocidadALlegar;
		// tiempo que se quiere mantener a la velocidad
		int tiempoVelocidad;

		System.out.println("¿Qué vehículo tiene? (TURISMO/MOTOCICLETA/CAMIÓN)");
		tipoVehiculo = leer.nextLine().toUpperCase();

		// creo el objeto dependiendo del tipo de vehiculo
		vehi = crearObjeto(tipoVehiculo);

		do {
			menu();
			System.out.print("Opción: ");
			opcion = leer.nextInt();
			// limpiar el buffer
			leer.nextLine();

			switch (opcion) {
			case 1 -> {
				System.out.println("ARRANCAR EL VEHÍCULO");
				vehi.arrancar();

				// si el motor esta a true entonces es que está arrancado
				arrancarMotor(vehi);
			}
			case 2 -> {
				System.out.println("ACELERAR");
				System.out.println("Introduzca la velocidad a alcanzar: ");
				velocidadALlegar = leer.nextInt();
				// limpiar el buffer
				leer.nextLine();

				vehi.subirVelocidad(velocidadALlegar);
			}
			case 3 -> {
				System.out.println("MANTENERSE A UNA VELOCIDAD UN TIEMPO");
				System.out.print("Introduzca el tiempo que desea mantenerse a la misma velocidad: ");
				tiempoVelocidad = leer.nextInt();
				// limpiar el buffer
				leer.nextLine();

				System.out.println(
						"El vehículo se mantuvo a " + vehi.getVelocidad() + " durante " + tiempoVelocidad + " minutos");
			}
			case 4 -> {
				System.out.println("REDUCIR LA VELOCIDAD HASTA PARAR");
				// reducir la velocidad
				vehi.bajarVelocidad();
				System.out.println("Velocidad actual: " + vehi.getVelocidad() + "km/h");
			}
			case 5 -> {
				System.out.println("PARAR EL MOTOR");
				vehi.parar();
				pararMotor(vehi);
			}
			}
		} while (opcion <= 5 && opcion >= 1);

		leer.close();

	}

	private static void menu() {
		System.out.println("MENÚ");
		System.out.println("\t1. Arranca.");
		System.out.println(
				"\t2. Acelera e irá subiendo marchas hasta llegar a una velocidad que se ha pedido por teclado al usuario..");
		System.out.println("\t3. Se mantiene esa velocidad un tiempo que se ha pedido al usuario por teclado.");
		System.out.println("\t4. Se va desacelerando y bajando marchas hasta que el coche se pare.");
		System.out.println("\t5. Punto muerto y paramos el motor.");
	}

	private static Vehiculo crearObjeto(String tipoVehiculo) {

		Vehiculo vehiculo = null;

		String marca;
		String modelo;
		String color;
		String matricula;

		// atributos especiales de cada vehiculo
		// turismo
		String tipo;
		int numPlazas;

		// motocicleta
		int cilindrada;
		boolean carnet;

		// camion
		double pesoMax;
		boolean mercanciaPeligrosa;

		System.out.print("Marca: ");
		marca = leer.nextLine();

		System.out.print("Modelo: ");
		modelo = leer.nextLine();

		System.out.print("Color: ");
		color = leer.nextLine();

		System.out.print("Matrícula: ");
		matricula = leer.nextLine();

		switch (tipoVehiculo) {
		case "TURISMO" -> {
			System.out.print("Tipo del vehiculo (PARTICULAR/PROFESIONAL): ");
			tipo = leer.nextLine().toUpperCase();

			System.out.print("Nº de plazas: ");
			numPlazas = leer.nextInt();
			// limpiar buffer
			leer.nextLine();

			// creacion del vehiculo
			vehiculo = new Turismo(matricula, marca, modelo, color, numPlazas, tipo);
		}
		case "MOTOCICLETA" -> {
			System.out.print("Cilindrada: ");
			cilindrada = leer.nextInt();
			// limpiar buffer
			leer.nextLine();

			System.out.print("Carnet: ");
			carnet = leer.nextBoolean();

			// creacion del objeto
			vehiculo = new Motocicleta(matricula, marca, modelo, color, cilindrada, carnet);
		}
		case "CAMION" -> {
			System.out.print("Peso máximo: ");
			pesoMax = leer.nextDouble();

			System.out.print("¿Lleva mercancía peligrosa?: ");
			mercanciaPeligrosa = leer.nextBoolean();

			// creo el objeto de camion
			vehiculo = new Camion(matricula, marca, modelo, color, pesoMax, mercanciaPeligrosa);
		}
		}

		return vehiculo;

	}

	private static void arrancarMotor(Vehiculo vehiculo) {
		if (vehiculo.getMotor()) {
			System.out.println("Vehículo arrancado");
		} else {
			System.err.println("Vehículo parado");
		}
	}

	private static void pararMotor(Vehiculo vehiculo) {
		if (!vehiculo.getMotor()) {
			System.out.println("Vehículo parado");
		} else {
			System.err.println("Vehículo arrancado");
		}
	}
}
