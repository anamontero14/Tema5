package boletin4.ejer3;

import java.util.Comparator;

public class OrdenarTitulares implements Comparator<Titular> {

	@Override
	public int compare(Titular o1, Titular o2) {

		int res = 0;

		// si se repiten (repetir es que la comparación da 0)
		if (o1.getApellido().compareTo(o2.getApellido()) == 0) {
			// los ordena por el nombre
			res = o1.getNombre().compareTo(o2.getNombre());
		} else {
			// si no se repiten los ordena por apellido
			res = o1.getApellido().compareTo(o2.getApellido());
		}

		return res;
	}

}
