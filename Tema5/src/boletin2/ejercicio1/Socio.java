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
	public int compareTo(Socio o) {
		int respuesta=0;
		if(this.id==o.id) {
			respuesta=1;
		}else if(this.id!=o.id) {
			respuesta=-1;
		}
		return respuesta;
	}
	
	

}
