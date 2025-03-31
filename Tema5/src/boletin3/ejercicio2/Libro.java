package boletin3.ejercicio2;

public class Libro extends Ficha{

	
	String autor;
	String editorial;
	
	
	public Libro(int id, String titulo, String autor, String editorial) {
		super(id, titulo);
		
	}


	public String getAutor() {
		return autor;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	

	@Override
	public String toString() {
		return "Libro [autor=" + autor + ", editorial=" + editorial + "]";
	}


	@Override
	public boolean prestar(int tiempo) {
		
		return false;
	}
	
	
}
