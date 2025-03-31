package boletin3.ejercicio2;

public abstract class Ficha {
	
	private int id;
	private String titulo;
	
	public Ficha(int id, String titulo) {
		
		
		
	}

	public int getId() {
		return id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	@Override
	public String toString() {
		return "Ficha [id=" + id + ", titulo=" + titulo + "]";
	}
	
	public abstract boolean prestar(int tiempo);

}
