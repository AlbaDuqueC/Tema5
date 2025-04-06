package boletin4.ejercicio3;

import java.util.Objects;

public class Futbolista implements Comparable<Futbolista>{
	
	private int numCamisa;
	
	private String nombre;
	
	private int edad;
	
	private int numGoles;
	
	public Futbolista(int numCamisa, String nombre, int edad, int numGoles) {
		if(numCamisa >= 1) {
			this.numCamisa = numCamisa;
		}
		
		if(nombre != null && !nombre.isBlank()) {
			this.nombre=nombre;
		}
		
		if(edad>=1) {
			this.edad=edad;
		}
		
		if(numGoles >=0) {
			this.numGoles=numGoles;
		}
	}
	
	

	public int getNumCamisa() {
		return numCamisa;
	}



	public void setNumCamisa(int numCamisa) {
		this.numCamisa = numCamisa;
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



	public int getNumGoles() {
		return numGoles;
	}



	public void setNumGoles(int numGoles) {
		this.numGoles = numGoles;
	}



	@Override
	public int compareTo(Futbolista o) {
		
		int si = 0;
		
		if(this.numCamisa == o.numCamisa) {
			si=this.nombre.compareTo(o.nombre);
		}else {
			si=this.numCamisa - o.numCamisa;
		}
		
		return si;
		
	}


	@Override
	public boolean equals(Object obj) {

		boolean si = false;

		Futbolista fut = (Futbolista) obj;

		if (numCamisa == fut.numCamisa && nombre.equals(fut.nombre)) {
			si = true;
		}

		return si;
	}



	@Override
	public String toString() {
		return "Futbolista [numCamisa=" + numCamisa + ", nombre=" + nombre + ", edad=" + edad + ", numGoles=" + numGoles
				+ "]";
	}
	
	
	
	

}
