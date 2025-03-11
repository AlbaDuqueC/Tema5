package boletin1.ejercicio1;

public class HoraExacta {
	
	Hora horita;
	
	int seg;
	
	public HoraExacta(int h, int m, int s) {
		
		horita=new Hora(h, m);
		if(s<60 && s>=0) {
			this.seg=s;
		}
		
	}
	
	public boolean setSegundo(int valor) {
		boolean si=true;
		
		if(valor<60 && valor>=0) {
			this.seg= valor;
			si=true;
		}
		return si;
	}
	
	public void inc() {
		this.seg+=1;
		
		
		if (this.seg==60) {
			this.seg=0;
			
			horita.inc();
		}
	}
	
	public String toString() {
		
		return horita.toString()+":"+this.seg;
		
	}
	

}
