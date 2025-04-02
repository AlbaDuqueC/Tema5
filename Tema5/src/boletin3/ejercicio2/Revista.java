package boletin3.ejercicio2;

public class Revista extends Ficha {

	private int numRevista;
	private int añoPublicado;

	public Revista(int id, String titulo, int numR, int añoP) {
		super(id, titulo);

		if (numR > 0) {
			this.numRevista = numR;
		}

		if (añoP > 0) {
			this.añoPublicado = añoP;
		}
	}

	public int getNumRevista() {
		return numRevista;
	}

	public void setNumRevista(int numRevista) {
		if (numRevista > 0) {
			this.numRevista = numRevista;
		}
	}

	public int getAñoPublicado() {

		return añoPublicado;
	}

	@Override
	public boolean prestar(int tiempo) {
		
		boolean prest=false;
		
		if(tiempo<=10) {
			prest=true;
		}
		
		return prest;
	}

}
