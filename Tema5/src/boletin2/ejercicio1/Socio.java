package boletin2.ejercicio1;

public class Socio implements Comparable{
	
	private int id;
	private String nombre;
	private int edad;
	
	public Socio (int id, String nombre, int edad) {
		if(id>0) {
			this.id=id;
		}
		if(nombre!=null && nombre.isBlank()) {
			
			this.nombre=nombre;
			
		}
		if(edad>=18) {
			this.edad=edad;
		}
	}

	@Override
	public String toString() {
		return "Socio [id=" + id + ", nombre=" + nombre + ", edad=" + edad + "]";
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
