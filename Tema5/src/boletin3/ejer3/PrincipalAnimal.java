package boletin3.ejer3;

public class PrincipalAnimal {

	public static void main(String[] args) {

		// perro
		Perro p1 = new Perro("Piedra", "Golden Retriever", 34.5, "Rubio");
		Perro p2 = new Perro("Pedruscón", "Pastor alemán", 45.6, "Marrón y negro");
		Gato g2 = new Gato("Michael Jackson", "Bicolor", 10.56, "Negro y blanco");

		p1.comer();
		System.out.println(p2.hacerCaso());
		g2.hacerRuido();

	}

}
