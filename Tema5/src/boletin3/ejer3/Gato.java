package boletin3.ejer3;

import java.util.Random;

/**
 * Clase gato que se extiende a animal domestico
 */
public class Gato extends AnimalDomestico {

	/**
	 * Constructor heredado del padre
	 * 
	 * @param nombre - Nombre del gato
	 * @param raza   - Raza del gato
	 * @param peso   - Peso del gato
	 * @param color  - Color del gato
	 */
	Gato(String nombre, String raza, double peso, String color) {
		super(nombre, raza, peso, color);
	}

	@Override
	/**
	 * Hace miau
	 */
	public void hacerRuido() {
		System.out.println("MIAU");
	}

	@Override
	/**
	 * Método heredado el cuál indica que el gato obedece solo un 5% de las veces
	 * 
	 * @return devuelve false dependiendo si el nº aleatorio es mayor que 5 o no
	 */
	public boolean hacerCaso() {
		Random rand = new Random();
		int random = rand.nextInt(1, 101);
		boolean obedece = true;

		if (random < 5) {
			obedece = false;
		}

		return obedece;
	}

	/**
	 * Método que indica que el gato tose una bola de pelo
	 */
	public void toserBolaPelo() {
		System.out.println("*tose bola de pelo*");
	}

}
