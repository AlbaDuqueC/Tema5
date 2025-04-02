package boletin3.ejericio4;

public class Contacto implements Comparable<Contacto>{

	private String nombre;
	private int telefono;

	public Contacto(String nombre, int telefono) {

		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}

		if (telefono > 0) {

			this.telefono = telefono;

		}

	}

	public String getNombre() {
		return nombre;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {

		if (telefono > 0) {
			this.telefono = telefono;
		}
	}

	@Override
	public int compareTo(Contacto o) {
		
		int num=0;
		
		if(o.nombre.equals(this.nombre)) {
			num=1;
		}
		
		return num;
	}

	
	
	

}
