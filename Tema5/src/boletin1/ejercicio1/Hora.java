package boletin1.ejercicio1;

public class Hora {
	
	private int hora;
	private int min;
	
	
	public Hora (int hora, int min) {
		if(min<60) {
			this.min= min;
		}
		if(hora<24) {
			this.hora= hora;
		}
	}
	
	public void inc() {
		this.min +=1;
		
		if (this.min==60) {
			this.hora+=1;
			this.min=0;
		}
	}
	
	public int getHora() {
		return hora;
	}
	public void setHora(int hora) {
		this.hora = hora;
	}
	public int getMin() {
		return min;
	}
	public void setMin(int min) {
		this.min = min;
	}
	
	

}
