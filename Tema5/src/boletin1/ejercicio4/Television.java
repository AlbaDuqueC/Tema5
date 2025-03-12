package boletin1.ejercicio4;

public class Television extends Electrodomestico{
	
	private double resolucion=20;
	private boolean sintonizadorTDT=false;
	
	public Television(double precio, double peso) {
		super(precio, peso);
	}
	
	public Television(double precio, double peso, String color, char energia,double resolucion,boolean sintonizadorTDT ) {
		super(precio, peso, color, energia);
		
		if(resolucion>0) {
			this.resolucion=resolucion;
		}
		this.sintonizadorTDT=sintonizadorTDT;
	}
	
	public void precioFinal() {
		double precio = super.getPrecioBase();
		if (this.resolucion>40) {
			super.setPrecioBase(precio+precio*0.3);
		}
		super.precioFinal();
	}

	public double getResolucion() {
		return resolucion;
	}

	public void setResolucion(double resolucion) {
		if(resolucion>0) {
			this.resolucion=resolucion;
		}
	}

	public boolean isSintonizadorTDT() {
		return sintonizadorTDT;
	}

	public void setSintonizadorTDT(boolean sintonizadorTDT) {
		this.sintonizadorTDT = sintonizadorTDT;
	}
	
	

}
