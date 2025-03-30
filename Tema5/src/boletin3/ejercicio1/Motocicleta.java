package boletin3.ejercicio1;

public class Motocicleta extends Vehiculo{
	
	private int cilindrada;

	public Motocicleta(String marca, String modelo, String color, String matricula, int cilindrada) {
		super(marca, modelo, color, matricula);
		
		if (cilindrada > 0) {
			this.cilindrada = cilindrada;
		}
		
	}
	
	public int getCilindrada() {
		return cilindrada;
	}

	public boolean requiereCarnet() {

		boolean si = false;

		if (this.cilindrada >= 125) {
			si = true;
		}

		return si;
	}

	public String toString() {
		return super.toString() + ", Cilindrada: " + cilindrada;
	}

}
