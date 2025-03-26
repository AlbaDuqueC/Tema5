package boletin2.ejercicio3;

import java.util.Random;

public class Perro extends AnimalDomestico{

	public Perro(String nombre, String raza, double peso, String color) {
		super(nombre, raza, peso, color);
		
	}
	
	public boolean hacerCaso() {
		Random rand = new Random();
		boolean si=false;
		int por=rand.nextInt(0,11);
		if(por<=9) {
			si=true;
		}
		return si;
		
		
	}
	
	public String sacarPaseo() {
		return "--sacandolo de paseo--";
	}
	
	@Override
	public String hacerRuido(){
		return "guau";
	}

}
