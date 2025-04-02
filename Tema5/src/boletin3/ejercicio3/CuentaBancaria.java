package boletin3.ejercicio3;

import java.util.TreeSet;

public class CuentaBancaria {
	
	private String numCuenta;
	protected double saldo=0;
	private TreeSet<Titular> titulares;
	
	public CuentaBancaria(Titular t, String numCuenta) {
		
		if(t != null) {
			this.titulares.add(t);
		}
		
		if(numCuenta != null && !numCuenta.isBlank()) {
			this.numCuenta = numCuenta;
		}
		
	}
	
	public String getNumCuenta() {
		return numCuenta;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public TreeSet<Titular> getT() {
		return titulares;
	}



	public boolean ingresar(double dinero) {
		boolean si=false;
		
		if(dinero>0) {
			this.saldo+=dinero;
			si=true;
		}
		
		return si;
	}
	
	public boolean retirar(double dinero) {
		boolean si=false;
		
		if(dinero>this.saldo) {
			this.saldo-=dinero;
			si=true;
		}
		
		return si;
	}
	
	public boolean addTitular(Titular t) {
		boolean si=false;
		
		if(t != null) {
			this.titulares.add(t);
			si=true;
		}
		
		return si;
	}
	
	public boolean removeTitular(Titular t) {
		boolean si=false;
		
		if(t != null) {
			this.titulares.remove(t);
			si=true;
		}
		
		return si;
	}

}
