package boletin1.ejer4;

public class Electrodomestico {

	/**
	 * Atributo que representa el precio base del objeto
	 */
	double precioBase = 100;

	/**
	 * Atributo que guardará el color del electrodomestico
	 */
	Colores color = Colores.BLANCO;

	enum Colores {
		ROJO, AZUL, VERDE, AMARILLO, NARANJA, NEGRO, GRIS, BLANCO
	}

	/**
	 * Enumerado de las opciones que puede tener el consumo
	 */
	ConsumoEnergetico consumo = ConsumoEnergetico.F;

	enum ConsumoEnergetico {
		A, B, C, D, E, F
	};

	/**
	 * Atributo que representa el peso del electrodomestico en kg
	 */
	double peso = 5;

	/**
	 * Constructor con solo el precio y el peso del electrodomestico
	 * 
	 * @param precioBase
	 * @param peso
	 */
	Electrodomestico(double precioBase, double peso) {
		if (precioBase >= 0) {
			this.precioBase = precioBase;
		}

		if (peso > 0) {
			this.peso = peso;
		}
	}

	/**
	 * Constructor con todos los atributos del objeto
	 * 
	 * @param precioBase
	 * @param color
	 * @param consumo
	 * @param peso
	 */
	Electrodomestico(double precioBase, String color, char consumo, double peso) {
		if (precioBase >= 0) {
			this.precioBase = precioBase;
		}

		switch (color) {
		case "ROJO" -> {
			this.color = Colores.ROJO;
		}
		case "AZUL" -> {
			this.color = Colores.AZUL;
		}
		case "VERDE" -> {
			this.color = Colores.VERDE;
		}
		case "AMARILLO" -> {
			this.color = Colores.AMARILLO;
		}
		case "NARANJA" -> {
			this.color = Colores.NARANJA;
		}
		case "NEGRO" -> {
			this.color = Colores.NEGRO;
		}
		case "GRIS" -> {
			this.color = Colores.GRIS;
		}
		}

		switch (consumo) {
		case 'A' -> {
			this.consumo = ConsumoEnergetico.A;
		}
		case 'B' -> {
			this.consumo = ConsumoEnergetico.B;
		}
		case 'C' -> {
			this.consumo = ConsumoEnergetico.C;
		}
		case 'D' -> {
			this.consumo = ConsumoEnergetico.D;
		}
		case 'E' -> {
			this.consumo = ConsumoEnergetico.E;
		}
		}

		if (peso > 0) {
			this.peso = peso;
		}
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public Colores getColor() {
		return color;
	}

	public void setColor(String color) {
		switch (color) {
		case "ROJO" -> {
			this.color = Colores.ROJO;
		}
		case "AZUL" -> {
			this.color = Colores.AZUL;
		}
		case "VERDE" -> {
			this.color = Colores.VERDE;
		}
		case "AMARILLO" -> {
			this.color = Colores.AMARILLO;
		}
		case "NARANJA" -> {
			this.color = Colores.NARANJA;
		}
		case "NEGRO" -> {
			this.color = Colores.NEGRO;
		}
		case "GRIS" -> {
			this.color = Colores.GRIS;
		}
		}
	}

	public ConsumoEnergetico getConsumo() {
		return consumo;
	}

	public void setConsumo(char consumo) {
		switch (consumo) {
		case 'A' -> {
			this.consumo = ConsumoEnergetico.A;
		}
		case 'B' -> {
			this.consumo = ConsumoEnergetico.B;
		}
		case 'C' -> {
			this.consumo = ConsumoEnergetico.C;
		}
		case 'D' -> {
			this.consumo = ConsumoEnergetico.D;
		}
		case 'E' -> {
			this.consumo = ConsumoEnergetico.E;
		}
		}
	}

	public double getPeso() {
		return peso;
	}

	/**
	 * Comprueba que la letra es correcta. Si no es correcta, usará la letra por
	 * defecto. Se invocará al crear el objeto y no será visible
	 * 
	 * @param letra
	 * @return
	 */
	private boolean comprobarConsumoEnergetico(char letra) {

		boolean validez = true;

		switch (letra) {
		case 'A' -> {
			this.consumo = ConsumoEnergetico.A;
		}
		case 'B' -> {
			this.consumo = ConsumoEnergetico.B;
		}
		case 'C' -> {
			this.consumo = ConsumoEnergetico.C;
		}
		case 'D' -> {
			this.consumo = ConsumoEnergetico.D;
		}
		case 'E' -> {
			this.consumo = ConsumoEnergetico.E;
		}
		default -> {
			this.consumo = ConsumoEnergetico.F;
			validez = false;
		}
		}

		return validez;

	}

	/**
	 * Comprueba que el color es correcto, si no lo es usa el color por defecto. Se
	 * invocará al crear el objeto y no será visible
	 * 
	 * @param color
	 * @return
	 */
	private boolean comprobarColor(String color) {

		boolean validez = true;

		switch (color) {
		case "ROJO" -> {
			this.color = Colores.ROJO;
		}
		case "AZUL" -> {
			this.color = Colores.AZUL;
		}
		case "VERDE" -> {
			this.color = Colores.VERDE;
		}
		case "AMARILLO" -> {
			this.color = Colores.AMARILLO;
		}
		case "NARANJA" -> {
			this.color = Colores.NARANJA;
		}
		case "NEGRO" -> {
			this.color = Colores.NEGRO;
		}
		case "GRIS" -> {
			this.color = Colores.GRIS;
		}
		default -> {
			this.color = Colores.BLANCO;
			validez = false;
		}
		}

		return validez;
	}

	/**
	 * según el consumo energético, aumentará su precio base, y según su tamaño,
	 * también aumentará su precio base.
	 */
	public void precioFinal() {
		switch (consumo) {
		case A -> {
			precioBase += 100;
		}
		case B -> {
			precioBase += 80;
		}
		case C -> {
			precioBase += 60;
		}
		case D -> {
			precioBase += 50;
		}
		case E -> {
			precioBase += 30;
		}
		default -> {
			precioBase += 10;

		}
		}

		if (peso > 0 && peso <= 19) {
			precioBase += 10;
		} else if (peso >= 20 && peso <= 49) {
			precioBase += 50;
		} else if (peso >= 50 && peso <= 79) {
			precioBase += 80;
		} else {
			precioBase += 100;
		}
	}

	@Override
	public String toString() {
		return "Electrodomestico: " + precioBase + "€ , " + color + ", " + consumo + " de consumo, " + peso + "KG";
	}

}
