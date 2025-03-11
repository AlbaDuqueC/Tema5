package boletin1.ejercicio3;

public class Productos {

	private String nombre;
	private double precio;

	public Productos(String nombre, double precio) {

		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}

		if (precio > 0) {
			this.precio = precio;
		}
	}

	public String toString() {
		return this.nombre + " " + this.precio + "€";
	}
	
	public double calcular(int cantidad) {
		return this.precio*cantidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		if (precio > 0) {
			this.precio = precio;
		}
	}

}
