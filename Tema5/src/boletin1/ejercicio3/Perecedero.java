package boletin1.ejercicio3;

public class Perecedero extends Productos{

	private int diasCaducar;

	public Perecedero(String nombre, double precio,int d) {
		super (nombre, precio);
		
		if (d >= 0) {
			this.diasCaducar = d;
		}
	}

	public String toString() {
		return  super.toString()+" quedan "+this.diasCaducar + "dias quedan para que caduque";
	}
	
	public double calcular(int cantidad) {
		
		double p=super.calcular(cantidad) ;
		
		if (cantidad==1) {
			p=p/4;
		}else if (cantidad==2) {
			p=p/3;
		}else if(cantidad==3) {
			p=p/2;
		}
		
		return p;
		
	}

	public int getDiasCaducar() {
		return diasCaducar;
	}

	public void setDiasCaducar(int diasCaducar) {

		if (diasCaducar >= 0) {
			this.diasCaducar = diasCaducar;
		}
	}

}
