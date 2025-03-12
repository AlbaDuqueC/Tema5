package boletin1.ejercicio4;

public class Lavadora extends Electrodomestico {

	private double carga=5;
	
	public Lavadora(double precio, double peso) {
		super(precio, peso);
	}
	
	public Lavadora(double precio, double peso, String color, char energia, double carga) {
		super( precio,  peso,  color,  energia);
		
		if (carga>=0) {
			this.carga=carga;
		}
	}
	
	

	public double getCarga() {
		return carga;
	}

	public void setCarga(double carga) {
		if (carga>=0) {
			this.carga=carga;
		}
	}
	
	public void precioFinal() {
		
		double precio=super.getPrecioBase();
		
		if (carga>30) {
			super.setPrecioBase(precio+50);
		}
		super.precioFinal();
	}
	
	
	
}
