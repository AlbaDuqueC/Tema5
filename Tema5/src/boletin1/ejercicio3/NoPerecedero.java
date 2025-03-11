package boletin1.ejercicio3;

public class NoPerecedero extends Productos {
	

	private String tipo;

	public NoPerecedero(String nombre, double precio ,String tipo) {

		super(nombre, precio);
		
		if (tipo != null && !tipo.isBlank()) {
			this.tipo = tipo;
		}

	}

	public String toString() {
		return super.toString()+", "+"Tipo: " + this.tipo;
	}

	public double calcular(int cantidad) {

		return this.getPrecio() * cantidad;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		if (tipo != null && !tipo.isBlank()) {
			this.tipo = tipo;
		}
	}

}
