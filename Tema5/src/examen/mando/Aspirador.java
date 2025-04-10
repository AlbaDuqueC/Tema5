package examen.mando;

import examen.excepciones.ModeloExcepcion;
import examen.interfaces.Velocidad;

public class Aspirador extends Mando implements Velocidad{
	
	private int velocidad = 0; //max 3 y va de 1 a 1

	public Aspirador(String modelo, double anchura, double altura) throws ModeloExcepcion {
		super(modelo, anchura, altura);
	}
	public Aspirador(String modelo, double anchura, double altura, double precio) throws ModeloExcepcion {
		super(modelo, anchura, altura, precio);
	}
	
	

	public int getVelocidad() {
		return velocidad;
	}

	@Override
	public void subirVelocidad() {
		
		if(this.velocidad <3) {
			this.velocidad = this.velocidad + 1;
		}
		
	}

	@Override
	public void bajarVelocidad() {
		
		if(this.velocidad >0) {
			this.velocidad = this.velocidad - 1;
		}
		
	}
	
	@Override
	public String toString() {
		return "Aspirador: velocidad ->" + this.velocidad;
	}

}
