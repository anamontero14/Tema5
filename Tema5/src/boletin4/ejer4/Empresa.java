package boletin4.ejer4;

public class Empresa extends Contacto {

	private String paginaWeb;

	Empresa(String nombre, int telefono, String paginaWeb) {
		super(nombre, telefono);

		if (paginaWeb != null && !paginaWeb.isBlank()) {
			this.paginaWeb = paginaWeb;
		}
	}

	public String getPaginaWeb() {
		return paginaWeb;
	}

	public void setPaginaWeb(String paginaWeb) {
		this.paginaWeb = paginaWeb;
	}

}
