package boletin4.ejercicio4;

public abstract class Ficha {

	private int id;
	private String titulo;

	public Ficha(int id, String titulo) {

		if (id > 0) {
			this.id = id;
		}

		if (titulo != null && !titulo.isBlank()) {
			this.titulo = titulo;
		}

	}

	public int getId() {
		return id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {

		if (titulo != null && !titulo.isBlank()) {
			this.titulo = titulo;
		}
	}

	@Override
	public String toString() {
		return "Ficha [id=" + id + ", titulo=" + titulo + "]";
	}

	public abstract boolean prestar(int tiempo);

}
