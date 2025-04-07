package boletin4.ejer3;

import java.util.Scanner;

public class PrincipalCuenta {
	static Scanner leer = new Scanner(System.in);

	public static void main(String[] args) {
		// opcion del menu
		int opcion;

		// tipo de la cuenta
		String tipoCuenta;

		CuentaBancaria cuenta;
		Titular titular;

		do {
			menu();
			System.out.println();
			System.out.print("Opción: ");
			opcion = leer.nextInt();
			// limpiar el buffer
			leer.nextLine();

			switch (opcion) {
			case 1 -> {
				System.out.println("AÑADIR UNA CUENTA");

				System.out.print("Tipo de la cuenta (corriente/ahorro): ");
				tipoCuenta = leer.nextLine().toUpperCase();

				cuenta = crearCuenta(tipoCuenta);

				titular = crearTitular();

				if (cuenta.añadirTitular(titular)) {
					System.out.println("\tSe añadió el titular");
				} else {
					System.err.println("\tNo se pudo añadir");
				}

			}
			case 2 -> {
			}
			case 3 -> {
			}
			case 4 -> {
			}
			default -> {
				System.err.println("Opción incorrecta. Saliendo...");
			}
			}

		} while (opcion >= 1 && opcion <= 5);

		// cerrar el scanner
		leer.close();
	}

	private static void menu() {
		System.out.println("MENÚ");
		System.out.println("1. Añadir una cuenta\n");
		System.out.println("2. Añadir un titular\n");
		System.out.println("3. Eliminar un titular\n");
		System.out.println("4. Ingresar dinero\n");
		System.out.println("5. Retirar dinero\n");
	}

	private static CuentaBancaria crearCuenta(String tipoCuenta) {
		// objeto
		CuentaBancaria cuenta2 = null;

		// atributos de la cuenta
		String numCuenta;
		double saldo;

		// atributos de la cuenta corriente
		double porcentaje;

		// atributos de la cuenta de ahorro
		double cuotaMantenimiento;
		double interesAnual;

		boolean salir = false;

		switch (tipoCuenta) {
		case "CORRIENTE" -> {
			do {
				System.out.print("Número de cuenta: ");
				numCuenta = leer.nextLine();
				System.out.print("Saldo de la cuenta: ");
				saldo = leer.nextDouble();
				System.out.print("Porcentaje cobrado por transacción: ");
				porcentaje = leer.nextDouble();
				// limpiar buffer
				leer.nextLine();

				try {
					cuenta2 = new CuentaCorriente(numCuenta, saldo, porcentaje);
					salir = true;
				} catch (SaldoExcepcion e) {
					System.err.println(e.toString());
				}

			} while (!salir);

		}
		case "AHORRO" -> {
			System.out.print("Número de cuenta: ");
			numCuenta = leer.nextLine();

			System.out.print("Saldo de la cuenta: ");
			saldo = leer.nextDouble();
			System.out.print("Cuota por el mantenimiento: ");
			cuotaMantenimiento = leer.nextDouble();
			// limpiar buffer
			leer.nextLine();

			System.out.println("Interés anual: ");
			interesAnual = leer.nextDouble();

			try {
				cuenta2 = new CuentaAhorro(numCuenta, saldo, cuotaMantenimiento, interesAnual);
			} catch (SaldoExcepcion e) {
				System.err.println(e.toString());
			}
		}
		}

		return cuenta2;
	}

	private static Titular crearTitular() {
		// atributos del titular
		String dni;
		String nombre;
		String apellido;
		long telefono;
		boolean salir = false;

		// objeto del titular
		Titular titular = null;

		do {
			System.out.print("DNI del titular: ");
			dni = leer.nextLine();
			System.out.print("Nombre del titular: ");
			nombre = leer.nextLine();
			System.out.print("Apellido del titular: ");
			apellido = leer.nextLine();
			System.out.print("Teléfono del titular: ");
			telefono = leer.nextLong();

			try {
				titular = new Titular(dni, nombre, apellido, telefono);
			} catch (DniExcepcion e) {
				System.err.println(e.toString());
			} catch (NombreExcepcion e) {
				System.err.println(e.toString());
			}
		} while (!salir);

		return titular;
	}

}
