package examen.mando;

import examen.excepciones.ModeloExcepcion;
import examen.interfaces.Velocidad;

public class AireAcondicionados extends Mando implements Velocidad{
	
	
	
	private boolean frioCalor = false; //si es true sera calor y false sera frio
	private int temperatura = 25 ;
	private int velocidad = 0 ;//max 5 y va de 1 a 1
	
	public AireAcondicionados(String modelo, double anchura, double altura) throws ModeloExcepcion {
		super(modelo, anchura, altura);

	}
	
	public AireAcondicionados(String modelo, double anchura, double altura, double precio) throws ModeloExcepcion {
		super(modelo, anchura, altura, precio);
	}
	
	
	
	public boolean isFrioCalor() {
		return frioCalor;
	}

	public void setFrioCalor(boolean frioCalor) {
		this.frioCalor = frioCalor;
	}

	public int getTemperatura() {
		return temperatura;
	}

	public int getVelocidad() {
		return velocidad;
	}

	@Override
	public void subirVelocidad() {
		
		if(this.velocidad < 5 ) {
			this.velocidad= this.velocidad + 1;
		}
		
	}
	@Override
	public void bajarVelocidad() {
		
		if(this.velocidad>0) {
			this.velocidad= this.velocidad - 1;
		}
		
	}
	
	@Override
	public String toString() {
		return "AireAcondicionado: ";
	}

}
