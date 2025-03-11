package boletin1.ejercicio2;

public class Empleado {
	
	private String nombre;
	
	public Empleado(String e) {
		this.nombre=e;
	}
	
	public void setNombre(String valor) {
		
		this.nombre=valor;
		
	}
	
	public String getnombre() {
		return this.nombre;
	}
	
	public String toString() {
		return "Empleado "+this.nombre;
	}
	

}
