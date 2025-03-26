package boletin2.ejercicio3;

public class AnimalDomestico implements Animal {
	
	private String nombre;
	private String raza;
	private double peso;
	private String color;
	
	public AnimalDomestico(String nombre, String raza, double peso, String color) {
		if(nombre!=null && !nombre.isBlank()) {
			this.nombre=nombre;
		}
		if(raza!=null && !raza.isBlank()) {
			this.raza=raza;
		}
		if(peso>0) {
			this.peso=peso;
		}
		if(color!=null && !color.isBlank()) {
			this.color=color;
		}
	}
	
	public String vacunar() {
		return "Tu mascota fue vacunada";
	}
	

	@Override
	public String hacerRuido() {
		return "";
		
	}

}
