package examen.main;

import java.util.ArrayList;
import java.util.Collections;

import examen.clases.MandoADistancia;
import examen.clases.MandoAcondicionado;
import examen.clases.MandoAspiradora;
import examen.clases.MandoMinicadena;
import examen.clases.MandoTelevision;

public class PrincipalMando {

	public static void main(String[] args) {

		// tabla de tamaño 10
		ArrayList<MandoADistancia> listaDeMandos = new ArrayList<MandoADistancia>();

		// crear varios objetos
		// DE CLASE MANDO A DISTANCIA
		MandoADistancia mando1 = new MandoADistancia("Negro", 5.2, 10.4);
		MandoADistancia mando2 = new MandoADistancia("Blanco", 4.23, 5.6);

		// DE CLASE MANDO TELEVISION
		MandoTelevision mando3 = new MandoTelevision("Beis", 4.6, 4.6);
		MandoTelevision mando4 = new MandoTelevision("TONTO", 12.4, 1.5);

		// DE CLASE MANDO MINI CADENA
		MandoMinicadena mando5 = new MandoMinicadena("Nuevo", 4.6, 2.6);

		// DE CLASE ASPIRADORA
		MandoAspiradora mando6 = new MandoAspiradora("Aspirar", 7.5, 2.4);

		// DE CLASE MANDO ACONDICIONADO
		MandoAcondicionado mando7 = new MandoAcondicionado("JIJI", 9.2, 3.5);

		// añadir a la lista
		listaDeMandos.add(mando1);
		listaDeMandos.add(mando2);
		listaDeMandos.add(mando3);
		listaDeMandos.add(mando4);
		listaDeMandos.add(mando5);
		listaDeMandos.add(mando6);
		listaDeMandos.add(mando7);

		// ordenar la lista
		Collections.sort(listaDeMandos);

		// imprimir la lista
		for (MandoADistancia a : listaDeMandos) {
			// encender
			a.encenderMando();

			// si es de la clase mando television hara unas cosas
			if (a instanceof MandoTelevision) {
				((MandoTelevision) a).setCanal(7);
				((MandoTelevision) a).subirVolumen();
				System.out.println(a);
				((MandoTelevision) a).bajarVolumen();
				System.out.println(a);
			}

			// si es de la clase de minicadena
			if (a instanceof MandoMinicadena) {
				((MandoMinicadena) a).subirVolumen();
				System.out.println(a);
				((MandoMinicadena) a).bajarVolumen();
				System.out.println(a);
			}

			// si es de la clase de aspiradora
			if (a instanceof MandoAspiradora) {
				((MandoAspiradora) a).subirVelocidad();
				System.out.println(a);
				((MandoAspiradora) a).bajarVelocidad();
				System.out.println(a);
			}

			// si es de la clase de aspiradora
			if (a instanceof MandoAcondicionado) {
				((MandoAcondicionado) a).setModo("CALOR");
				System.out.println(a);
				((MandoAcondicionado) a).setTemperatura(26);
				System.out.println(a);
				((MandoAcondicionado) a).subirVelocidad();
				System.out.println(a);
				((MandoAcondicionado) a).bajarVelocidad();
				System.out.println(a);
			}
			// salto de linea
			System.out.println();

		}

	}

}
