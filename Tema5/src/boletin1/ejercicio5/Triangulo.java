package boletin1.ejercicio5;

public class Triangulo extends Polígonos{

	private double lado1=1;
	private double lado2=1;
	private double lado3=1;
	
	public Triangulo() {
		super(3);
	}
	
	public Triangulo (double lado1, double lado2, double lado3) {
	
		super(3);
		
		if(lado1>0) {
			this.lado1=lado1;
		}
		if(lado2>0) {
			this.lado2=lado2;
		}
		if(lado3>0) {
			this.lado3=lado3;
		}
		
		
	}

	


	public double getLado1() {
		return lado1;
	}

	public void setLado1(double lado1) {
		if(lado1>0) {
			this.lado1=lado1;
		}
	}

	public double getLado2() {
		return lado2;
	}

	public void setLado2(double lado2) {
		if(lado2>0) {
			this.lado2=lado2;
		}
	}

	public double getLado3() {
		return lado3;
	}

	public void setLado3(double lado3) {
		if(lado3>0) {
			this.lado3=lado3;
		}
	}

	@Override
	public String toString() {
		return "Triangulo: \n -Lado 1: "+ this.lado1 + 
				"\n -Lado 2: "+ this.lado2 +
				"\n -Lado 3: "+ this.lado3 ;
	}




	@Override
	public double area() {
	
		double s=(this.lado1+this.lado2+this.lado3)/2;
		
		return Math.sqrt(s*(s-lado1)*(s-lado2)*(s-lado3));
	}

	

	
}
