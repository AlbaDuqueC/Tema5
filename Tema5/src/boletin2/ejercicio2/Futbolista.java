package boletin2.ejercicio2;

import java.util.Objects;

public class Futbolista implements Comparable<Futbolista>{
	
	private int numCamisetas;
	private String nombre;
	private int edad;
	private int numGoles;
	
	public Futbolista(int cami, String nombre, int edad, int goles) {
		if (cami>0) {
			this.numCamisetas=cami;
		}
		if(nombre!=null && !nombre.isBlank()) {
			this.nombre=nombre;
		}
		if(edad>0) {
			this.edad=edad;
		}
		if(goles>=0) {
			this.numGoles=goles;
		}
	}

	@Override
	public String toString() {
		return "Futbolista [numCamisetas=" + numCamisetas + ", nombre=" + nombre + ", edad=" + edad + ", numGoles="
				+ numGoles + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(edad, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		
		Futbolista o= (Futbolista) obj;
		
		boolean si=false;
		
		if(this.numCamisetas== o.numCamisetas && this.nombre.equals(o.nombre)) {
			si=true;
		}
		
		return si;
		
		
	}

	@Override
	public int compareTo(Futbolista o) {
		
		int si=0;
		
		si= this.numCamisetas - o.numCamisetas;
		
		if(si==0) {
			si= this.nombre.compareTo(o.nombre);
		}
		
		return si;
		
		
	}
	
	
	

}
