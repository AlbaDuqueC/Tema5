package boletin2.ejercicio3;

import java.util.Random;

public class Gato extends AnimalDomestico{

	public Gato(String nombre, String raza, double peso, String color) {
		super(nombre, raza, peso, color);
		
	}
	
	public boolean hacerCaso() {
		Random rand = new Random();
		boolean si=false;
		int por=rand.nextInt(0,101);
		if(por<=5) {
			si=true;
		}
		return si;
		
		
	}
	
	public String toserBolaPelo() {
		return "ggggg --escupe bola--";
	}
	
	@Override
	public String hacerRuido(){
		return "miau";
	}
	
	
	

}
