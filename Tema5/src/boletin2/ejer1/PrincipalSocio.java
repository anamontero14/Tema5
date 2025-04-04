package boletin2.ejer1;

import java.util.Arrays;

public class PrincipalSocio {

	public static void main(String[] args) {

		// socio1 con sus atributos
		Socio soc1 = new Socio(1, "Manuel", 45);
		// socio 2 con sus atributos
		Socio soc2 = new Socio(3, "Beatriz", 56);
		// socio 3 con sus atributos
		Socio soc3 = new Socio(5, "Alvaro", 26);

		// array de socios con los creados
		Socio soc[] = new Socio[] { soc1, soc2, soc3 };

		// resultado es igual a lo que salga de compare to
		int resultado = soc1.compareTo(soc2);
		System.out.println(resultado);
		// resultado es igual a lo que salga de compare to
		resultado = soc3.compareTo(soc1);
		System.out.println(resultado);
		// resultado es igual a lo que salga de compare to
		resultado = soc2.compareTo(soc3);
		System.out.println(resultado);

		// se ordena el array dependiendo del compare to
		Arrays.sort(soc);
		// se muestra el array en string
		System.out.println(Arrays.deepToString(soc));

		// ordenar por los nombres
		Arrays.sort(soc, new OrdenNombreSocio());
		System.out.println(Arrays.toString(soc));

		// ordenar por edad
		Arrays.sort(soc, new OrdenEdadSocio());
		System.out.println(Arrays.toString(soc));
	}

}
