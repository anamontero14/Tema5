package boletin1.ejer5;

import java.util.HashSet;

public class CrudPoligono {

	/**
	 * Lista hashset donde guardar todos los polígonos
	 */
	private static HashSet<Poligono> listaPoligonos = new HashSet<Poligono>();

	/**
	 * Método para crear un triángulo
	 * 
	 * @param trian Objeto triángulo creado
	 * @return true o false dependiendo del resultado de la operación
	 */
	public static boolean crearTriangulo(Triangulo trian) {
		boolean validez = false;

		if (listaPoligonos.add(trian)) {
			validez = true;
		}

		return validez;
	};

	/**
	 * Método para crear un rectángulo
	 * 
	 * @param rectang Objeto rectángulo creado
	 * @return true o false dependiendo del resultado de la operación
	 */
	public static boolean crearRectangulo(Rectangulo rectang) {
		boolean validez = false;

		if (listaPoligonos.add(rectang)) {
			validez = true;
		}

		return validez;
	};

	/**
	 * Método para mostrar todos los polígonos almacenados en la lista
	 */
	public static void mostrarPoligonos() {

		for (Poligono p : listaPoligonos) {
			System.out.println();
			System.out.println(p);
		}

	}
}
