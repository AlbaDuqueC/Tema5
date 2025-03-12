package boletin1.ejercicio4;

public class Electrodomestico {

	private double precioBase = 100;
	private double peso = 5;

	enum Color {
		BLANCO, NEGRO, ROJO, AZUL, GRIS;
	}

	enum Energia {
		A, B, C, D, E, F;
	}

	private Color color = Color.BLANCO;
	private Energia consumoEnergetico = Energia.F;

	public Electrodomestico(double precio, double peso) {
		if (precio >= 0) {
			this.precioBase = precio;
		}
		if (peso >= 0) {
			this.peso = peso;
		}
	}

	public Electrodomestico(double precio, double peso, String color, char energia) {
		if (precio >= 0) {
			this.precioBase = precio;
		}
		if (peso >= 0) {
			this.peso = peso;
		}
		switch (color) {
		case "NEGRO", "ROJO", "AZUL", "GRIS"-> {
			this.color = Color.valueOf(color);
		}
		}

		switch (energia) {
		case 'A', 'B', 'C', 'D', 'E' -> {
			this.consumoEnergetico = Energia.valueOf(String.valueOf(energia));
		}
		}

	}
	
	public void comprobarConsumoEnergetico(char letra) {
		switch (letra) {
		case 'A', 'B', 'C', 'D', 'E' -> {
			this.consumoEnergetico = Energia.valueOf(String.valueOf(letra));
		}
		}
	}
	
	public void comprobarColor(String color) {
		switch (color) {
		case "NEGRO", "ROJO", "AZUL", "GRIS"-> {
			this.color = Color.valueOf(color);
		}
		}
	}
	
	public void precioFinal() {
		switch (this.consumoEnergetico) {
		case A ->{
			this.precioBase+=100;
		}
		case B->{
			this.precioBase+=80;
		}
		case C->{
			this.precioBase+=60;
		}
		case D->{
			this.precioBase+=50;
		}
		case E->{
			this.precioBase+=30;
		}
		case F->{
			this.precioBase+=10;
		}
		}
		if(this.peso>=0 && peso<20) {
			this.precioBase+=10;
			
		}else if(this.peso>=20 && peso<50) {
			this.precioBase+=50;
			
		}else if(this.peso>=50 && peso<80) {
			this.precioBase+=80;
			
		}else if(this.peso>=80) {
			this.precioBase+=100;
		}
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		if (precioBase >= 0) {
			this.precioBase = precioBase;
		}
	}

	public double getPeso() {
		return peso;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(String color) {
		switch (color) {
		case "NEGRO", "ROJO", "AZUL", "GRIS" -> {
			this.color = Color.valueOf(color);
		}
		}
	}

	public Energia getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public void setConsumoEnergetico(char consumoEnergetico) {
		switch (consumoEnergetico) {
		case 'A', 'B', 'C', 'D', 'E' -> {
			this.consumoEnergetico = Energia.valueOf(String.valueOf(consumoEnergetico));
		}
		}
	}
	

	

}
