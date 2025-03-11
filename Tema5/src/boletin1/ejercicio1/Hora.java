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
			
			if(this.hora==24) {
				this.hora=0;
			}
		}
	}
	
	public boolean setMinutos(int valor) {
		
		boolean si=false;
		if (valor < 60 && valor>=0) {
			this.min=valor;
			si=true;
		}
		return si;
		
	}
	
	public boolean setHora(int valor) {
		
		boolean si=false;
		if (valor<24 && valor>=0) {
			this.hora=valor;
			si=true;
		}
		return si;
		
	}
	
	public String toString() {
		
		return this.hora+":"+this.min;
	}
	
	public int getHora() {
		return hora;
	}
	
	public int getMin() {
		return min;
	}
	
	
	

}
