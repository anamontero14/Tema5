package examen2.main;

import java.util.ArrayList;
import java.util.Collections;

import examen2.clases.Mando;
import examen2.clases.MandoAireAcondicionado;
import examen2.clases.MandoAspiradora;
import examen2.clases.MandoMinicadena;
import examen2.clases.MandoTelevision;
import examen2.clases.ModeloNombreException;

public class PrincipalMando {

	public static void main(String[] args) {

		// lista
		ArrayList<Mando> listaMandos = new ArrayList<Mando>();

		// OBJETOS
		MandoTelevision mando1 = null;
		MandoTelevision mando2 = null;
		MandoMinicadena mando3 = null;
		MandoAspiradora mando4 = null;
		MandoAireAcondicionado mando5 = null;
		// CLASE TV
		try {
			mando1 = new MandoTelevision("LG1", 4.5, 7.4, 12.5);
			mando2 = new MandoTelevision("LG100", 4.5, 7.4, 2.5);
			mando3 = new MandoMinicadena("LG2", 6.4, 2.5, 6.3);
			mando4 = new MandoAspiradora("LG3", 4.5, 6.3, 1000.3);
			mando5 = new MandoAireAcondicionado("LG4", 7.5, 9.4, 5.6);
		} catch (ModeloNombreException e) {
			System.err.println(e.getMessage());
		}

		// añadir los mandos a la lista de mandos
		listaMandos.add(mando1);
		listaMandos.add(mando2);
		listaMandos.add(mando3);
		listaMandos.add(mando4);
		listaMandos.add(mando5);

		// ordenada en orden alfabetico
		Collections.sort(listaMandos);

		// ordenacion de la lista para que tambien esten los precios ordenados de menor
		// a mayor
		listaMandos.sort((a, b) -> {
			return (int) (a.getPrecio() - b.getPrecio());
		});

		// recorrer la lista del mando
		for (Mando m : listaMandos) {

			if (m instanceof MandoTelevision) {
				// cambiar el canal
				((MandoTelevision) m).cambiarCanal(7);

				// subir el volumen
				((MandoTelevision) m).subirVolumen();
				((MandoTelevision) m).subirVolumen();

				System.out.println(m);

				// bajar el volumen
				((MandoTelevision) m).bajarVolumen();

				System.out.println();
				System.out.println(m);
			}

			if (m instanceof MandoMinicadena) {
				// subir el volumen
				((MandoMinicadena) m).subirVolumen();
				((MandoMinicadena) m).subirVolumen();
				((MandoMinicadena) m).subirVolumen();

				System.out.println(m);

				// bajar el volumen
				((MandoMinicadena) m).bajarVolumen();
				((MandoMinicadena) m).bajarVolumen();

				System.out.println();
				System.out.println(m);
			}

			if (m instanceof MandoAspiradora) {
				// subir velocidad
				((MandoAspiradora) m).subirVelocidad();
				((MandoAspiradora) m).subirVelocidad();
				((MandoAspiradora) m).subirVelocidad();
				((MandoAspiradora) m).subirVelocidad();

				System.out.println(m);

				// bajar velocidad
				((MandoAspiradora) m).bajarVelocidad();

				System.out.println();
				System.out.println(m);
			}

			if (m instanceof MandoAireAcondicionado) {
				// cambiar el modo
				((MandoAireAcondicionado) m).setModoAire("CALOR");

				// cambiar la temperatura
				((MandoAireAcondicionado) m).setTemperatura(25);

				// subir velocidad
				((MandoAireAcondicionado) m).subirVelocidad();

				System.out.println(m);

				// bajar velocidad
				((MandoAireAcondicionado) m).bajarVelocidad();

				System.out.println();
				System.out.println(m);
			}
		}

	}

}
