package boletin3.ejercicio1;

public class Camion extends Vehiculo{
	
	private double pesoMaximo;
	private boolean mercanciaPeligrosa;

	public Camion(String marca, String modelo, String color, String matricula, double pesoMaximo, boolean mercanciaPeligrosa) {
		super(marca, modelo, color, matricula);
		
		if (pesoMaximo > 0) {
			this.pesoMaximo = pesoMaximo;
		}

		if (mercanciaPeligrosa || !mercanciaPeligrosa) {
			this.mercanciaPeligrosa = mercanciaPeligrosa;
		}
		
	}
	
	public double getPesoMax() {
		return pesoMaximo;
	}

	public boolean isMercanciaPeligrosa() {
		return mercanciaPeligrosa;
	}

	public void setMercanciaPeligrosa(boolean mercanciaPeligrosa) {
		this.mercanciaPeligrosa = mercanciaPeligrosa;
	}
	
	public String toString() {
		return super.toString() + ", PesoMax: " + pesoMaximo + ", MercanciaPeligrosa: "
				+ mercanciaPeligrosa;
	}
	

}
