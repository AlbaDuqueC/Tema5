package boletin4.ejercicio2;

import java.util.Comparator;

public class Socio implements Comparable<Socio>{
	
	private int id;
	private String nombre;
	private int edad;
	
	public Socio(int id, String nombre, int edad) {
		
		if(id>=1) {
			this.id = id;
		}
		
		if(nombre!=null && !nombre.isBlank()) {
			this.nombre=nombre;
		}
		
		if(edad>=18) {
			this.edad=edad;
		}
		
	}
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}


	

	@Override
	public String toString() {
		return id+" "+ nombre + " " + edad;
	}



	@Override
	public int compareTo(Socio o) {

		int si=0;
		
		if(this.id<o.id) {
			si = -1;
		}else if(this.id>o.id){
			si=1;
		}
		
		return si;
	}

	

}
