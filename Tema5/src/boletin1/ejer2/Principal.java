package boletin1.ejer2;

public class Principal {

	public static void main(String[] args) {

		Empleado E1 = new Empleado("Gema");
		Directivo D1 = new Directivo("Rosario");
		Operario OP1 = new Operario("Joel");
		Oficial OF1 = new Oficial("Bayan");
		Tecnico T1 = new Tecnico("Rubén");

		System.out.println(E1);
		System.out.println(D1);
		System.out.println(OP1);
		System.out.println(OF1);
		System.out.println(T1);

	}

}
