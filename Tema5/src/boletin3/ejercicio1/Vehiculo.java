package boletin3.ejercicio1;

public class Vehiculo {
	
	private String marca;
	private String modelo;
	private String color;
	private String matrícula;
	
	private boolean encendido=false;
	private int marcha=0;
	private int velocidad=0;
	
	public Vehiculo (String marca, String modelo, String color, String matricula) {
		if(marca!=null && !marca.isBlank()) {
			this.marca=marca;
		}
		
		if(modelo!=null && !modelo.isBlank()) {
			this.modelo=modelo;
		}
		
		if(color!=null && !color.isBlank()) {
			this.color=color;
		}
		
		if(matricula!=null && !matricula.isBlank()) {
			this.matrícula=matricula;
		}
		
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		
		if(color!=null && !color.isBlank()) {
			this.color = color;
		}
		
	}

	public String getMatrícula() {
		return matrícula;
	}

	public boolean isEncendido() {
		return encendido;
	}

	public int getMarcha() {
		return marcha;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void Parar() {
		
		this.encendido=false;
		this.marcha=0;
		this.velocidad=0;
		
	}
	
	public void arrancar() {
		
		this.encendido=true;
		this.marcha=0;
		this.velocidad=0;
		
	}
	
	public void subirmarcha() {

		if(this.marcha<5) {
		this.marcha+=1;
		}
		
	}
	
	public void bajarMarcha() {
		
		if(this.marcha>-1) {
			this.marcha-=1;
		}
		
	}
	
	public boolean acelerar(int velocidad) {
		boolean si=false;
		
		while(this.velocidad<velocidad) {
			this.velocidad+=1;
			
			if(this.velocidad==velocidad) {
				si=true;
			}
			
		}
		
		return si;
	}
	
	public boolean frenar (int velocidad) {
		boolean si=false;
		
		while(this.velocidad>velocidad) {
			this.velocidad-=1;
			
			if (cambiarMarcha(this.velocidad)) {
				System.out.println("Cambio de marcha a " + this.marcha + "ª");
			}

			
		}
		
		return si;
	}
	
	private boolean cambiarMarcha(int velocidad) {
			
			int marcha = 0;
	
			boolean sePudo = false;
	
			if (velocidad >= 0 && velocidad < 30) {
				marcha = 1;
			}
	
			if (velocidad >= 30 && velocidad < 50) {
				marcha = 2;
			}
	
			if (velocidad >= 50 && velocidad < 70) {
				marcha = 3;
			}
	
			if (velocidad >= 70 && velocidad < 100) {
				marcha = 4;
			}
	
			if (velocidad >= 100) {
				marcha = 5;
			}
	
			if (marcha != this.marcha) {
				sePudo = true;
				this.marcha = marcha;
			}
	
			return sePudo;
	
		}

	public String toString() {
		return "Coche: \n Marca -> " + marca + "\n Modelo -> " + modelo + "\n Color -> " + color + "\n Matricula -> " + matrícula
				+ "\n EstadoMotor -> " + encendido + "\n Marcha -> " + marcha + "\n Velocidad -> " + velocidad;
	}
	

}
