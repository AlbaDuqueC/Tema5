package boletin3.ejericio4;

public class Empresas extends Contacto{
	
	private String nombreE;
	private String web;

	public Empresas(String nombre, int telefono, String nombreE, String web) {
		
		super(nombre, telefono);
		
		if(nombreE!=null && !nombreE.isBlank()) {
			
			this.nombreE=nombreE;
			
		}
		
		if(web!=null && !web.isBlank()) {
			this.web=web;
		}
	}

	public String getNombreE() {
		return nombreE;
	}

	public String getWeb() {
		return web;
	}

	public void setWeb(String web) {
		this.web = web;
	}
	
	

}
