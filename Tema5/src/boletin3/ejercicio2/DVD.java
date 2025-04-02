package boletin3.ejercicio2;

public class DVD extends Ficha {

	enum TipoDVD {
		PELICULA, DOCUMENTAL, SERIE
	}

	private String director;
	private int año;
	private TipoDVD tipo;

	public DVD(int id, String titulo, String director, int año, String tipo) {
		super(id, titulo);

		if (director != null && !director.isBlank()) {
			this.director = director;
		}

		if (año > 0) {
			this.año = año;
		}

		if (tipo != null && !tipo.isBlank()) {
			compararTipo(tipo);
		}

	}

	public String getDirector() {
		return director;
	}

	public int getAño() {
		return año;
	}

	public TipoDVD getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {

		compararTipo(tipo);
	}

	private void compararTipo(String tipo) {
		String t = tipo.toUpperCase();

		switch (t) {
		case "PELICULA", "DOCUMENTAL", "SERIE" -> {
			this.tipo = TipoDVD.valueOf(t);
		}
		}

	}

	@Override
	public boolean prestar(int tiempo) {
		boolean prest = false;

		if (tiempo <= 5) {
			prest = true;
		}

		return prest;
	}

}
