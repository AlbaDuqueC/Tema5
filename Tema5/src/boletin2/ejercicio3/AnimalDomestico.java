package boletin2.ejercicio3;

public class AnimalDomestico implements Animal {
	
	private String nombre;
	private String raza;
	private double peso;
	private String color;
	
	public String vacunar() {
		return "Tu mascota fue vacunada";
	}
	

	@Override
	public void hacerRuido() {
		
	}

}
