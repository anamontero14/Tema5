package boletin1.ejer5;

import java.util.HashSet;

public class CrudPoligono {

	// lista que almacenará los polígonos
	private static HashSet<Poligono> listaPoligonos = new HashSet<Poligono>();

	public static boolean crearTriangulo(Triangulo trian) {
		boolean validez = false;

		if (listaPoligonos.add(trian)) {
			validez = true;
		}

		return validez;
	};

	public static boolean crearRectangulo(Rectangulo rectang) {
		boolean validez = false;

		if (listaPoligonos.add(rectang)) {
			validez = true;
		}

		return validez;
	};

	public static void mostrarPoligonos() {

		for (Poligono p : listaPoligonos) {
			System.out.println();
			System.out.println(p);
		}

	}
}
