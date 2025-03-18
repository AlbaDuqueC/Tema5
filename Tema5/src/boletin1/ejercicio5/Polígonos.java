package boletin1.ejercicio5;

public abstract class Polígonos {
	


	private int numLados;
	
	public Polígonos(int numLados) {
		
		if(numLados>2) {
			this.numLados=numLados;
			
		}
		
	}
	
	

	public int getNumLados() {
		return numLados;
	}

	@Override
	public String toString() {
		return "Numero de lados: "+ this.numLados;
	}
	
	public abstract double area();
	
	
	
}
