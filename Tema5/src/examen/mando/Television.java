package examen.mando;

import examen.excepciones.ModeloExcepcion;
import examen.interfaces.Volumen;

public class Television extends Mando implements Volumen{
	
	private int volumen = 0; //va de 5 a 5
	private int canal = 1;

	public Television(String modelo, double anchura, double altura) throws ModeloExcepcion {
		
		super(modelo, anchura, altura);
		
	}
	
	public Television (String modelo, double anchura, double altura, double precio) throws ModeloExcepcion{
		
		super(modelo, precio, precio, precio);
		
	}

	public int getVolumen() {
		return volumen;
	}

	public int getCanal() {
		return canal;
	}

	public void setCanal(int canal) {
		this.canal = canal;
	}
	
	public void subirCanal() {
		this.canal= this.canal + 1;
	}
	
	public void bajarCanal() {
		this.canal= this.canal - 1;
	}

	@Override
	public void subirVolumen() {
		this.volumen= this.volumen + 5;
		
	}

	@Override
	public void bajarVolumen() {
		this.volumen= this.volumen - 5;
		
	}

	@Override
	public String toString() {
		return "Television: \t Volumen ->" + volumen + ", Canal -> " + canal ;
	}
	

}
