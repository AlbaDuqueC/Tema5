package boletin3.ejercicio2;

public class Libro extends Ficha {

	String autor;
	String editorial;

	public Libro(int id, String titulo, String autor, String editorial) {
		super(id, titulo);

		if (autor != null && !autor.isBlank()) {
			this.autor = autor;
		}

		if (editorial != null && !editorial.isBlank()) {
			this.editorial = editorial;
		}

	}

	public String getAutor() {
		return autor;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {

		if (editorial != null && !editorial.isBlank()) {
			this.editorial = editorial;
		}
	}

	@Override
	public String toString() {
		return "Libro [autor=" + autor + ", editorial=" + editorial + "]";
	}

	@Override
	public boolean prestar(int tiempo) {

		boolean prest = false;

		if (tiempo <= 15) {
			prest = true;
		}
		return prest;
	}

}
