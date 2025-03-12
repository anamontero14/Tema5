package boletin1.ejer4;

public class Lavadora extends Electrodomestico {

	/**
	 * Carga de la lavadora
	 */
	double carga = 5;

	/**
	 * Constructor con atributos heredados de la superclase
	 * 
	 * @param precio
	 * @param peso
	 */
	Lavadora(double precio, double peso) {
		super(precio, peso);
	}

	/**
	 * Constructor con los atributos heredados y el nuevo atributo
	 * 
	 * @param precio
	 * @param peso
	 * @param color
	 * @param consumo
	 * @param carga
	 */
	Lavadora(double precio, double peso, String color, char consumo, double carga) {
		super(precio, color, consumo, peso);

		if (carga >= 0) {
			this.carga = carga;
		}
	}

	public double getCarga() {
		return carga;
	}

	public void setCarga(double carga) {
		this.carga = carga;
	}

	/**
	 * Si tiene una carga mayor de 30 kg, aumentará el precio 50 €, si no es así, no
	 * se incrementará el precio. Llama al método padre y ctañade el código necesario.
	 * Recuerda que las condiciones que hemos visto en la clase Elerodomestico
	 * también deben afectar al precio.
	 */
	public void precioFinal() {
		if (carga >= 30) {
			precioBase += 50;
		}

		super.precioFinal();
	}

	@Override
	public String toString() {
		return super.toString() + ", " + carga + "KG de carga";
	}
	
	

}
