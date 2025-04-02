package boletin3.ejercicio3;

public class Titular {

	private String dni;
	private String nombre;
	private String apellido;
	private long telefono;

	public Titular(String dni, String nombre, String apellido, long telefono) {

		if (dni != null && !dni.isBlank()) {
			this.dni = dni;
		}

		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}

		if (apellido != null && !apellido.isBlank()) {
			this.apellido = apellido;
		}
		if (telefono > 0) {
			this.telefono = telefono;
		}

	}

	public String getDni() {
		return dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {

		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		if (apellido != null && !apellido.isBlank()) {
			this.apellido = apellido;
		}
	}

	public long getTelefono() {
		return telefono;
	}

	public void setTelefono(long telefono) {
		if (telefono > 0) {
			this.telefono = telefono;
		}
	}

}
