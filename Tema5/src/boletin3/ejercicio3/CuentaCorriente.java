package boletin3.ejercicio3;

import java.util.List;

public class CuentaCorriente extends CuentaBancaria{

	

	private List<Transaccion> transacciones;
	private double porcentaje;
	
	public CuentaCorriente(Titular t, String numCuenta, double porcentaje) {
		super(t, numCuenta);
		 
		if(porcentaje>=0) {
			this.porcentaje=porcentaje;
		}
	}
	
	
	
	public List<Transaccion> getTransacciones() {
		return transacciones;
	}

	public double getPorcentaje() {
		return porcentaje;
	}

	public void setPorcentaje(double porcentaje) {
		this.porcentaje = porcentaje;
	}


	public void realizarTransaccion(Transaccion t) {
		
		transacciones.add(t);
		
	}
	
}
