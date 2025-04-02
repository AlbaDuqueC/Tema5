package boletin3.ejericio4;

public class Personas extends Contacto{
	
	private String nombreP;
	private int cumpleños;

	public Personas(String nombre, int telefono, String nombreP, int cumpleaños) {
		super(nombre, telefono);
		
		if(nombreP!=null && !nombreP.isBlank()) {
			
			this.nombreP=nombreP;
			
		}
		
		if(cumpleaños>0) {
			this.cumpleños=cumpleaños;
		}
		
	}

	public String getNombreP() {
		return nombreP;
	}

	public int getCumpleños() {
		return cumpleños;
	}

	public void setCumpleños(int cumpleños) {
		this.cumpleños = cumpleños;
	}
	

}
