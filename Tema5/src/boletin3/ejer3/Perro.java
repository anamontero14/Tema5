package boletin3.ejer3;

import java.util.Random;

public class Perro extends AnimalDomestico {

	/**
	 * Constructor heredado del padre
	 * 
	 * @param nombre - Nombre del perro
	 * @param raza   - Raza del perro
	 * @param peso   - Peso del perro
	 * @param color  - Color del perro
	 */
	Perro(String nombre, String raza, double peso, String color) {
		super(nombre, raza, peso, color);
	}

	@Override
	/**
	 * El perro ladra
	 */
	public void hacerRuido() {
		System.out.println("GUAU");

	}

	@Override
	/**
	 * Método heredado del padre que devuelve true el 90% de las veces
	 * 
	 * @return true si el nº es menor que 90
	 */
	public boolean hacerCaso() {
		Random rand = new Random();
		int random = rand.nextInt(1, 101);
		boolean obedece = true;

		if (random > 90) {
			obedece = false;
		}

		return obedece;
	}

	/**
	 * Método que indica que el perro sale de paseo
	 */
	public void sacarPaseo() {
		System.out.println("Sale de paseito");
	}

}
