package examen.mando;

import examen.excepciones.ModeloExcepcion;

public class Mando implements Comparable<Mando>{
	
	private String modelo;
	private double anchura;
	private double altura;
	private double precio=0;
	private boolean onOff = false;
	
	public Mando (String modelo, double anchura, double altura) throws ModeloExcepcion{
		
		if(modelo!= null && !modelo.isBlank()) {
			this.modelo= modelo;
		}else {
			throw new ModeloExcepcion();
		}
		
		if(anchura>0) {
			this.anchura= anchura;
		}
		
		if(altura>0) {
			this.altura= altura;
		}
		
	}
	
	public Mando (String modelo, double anchura, double altura, double precio) throws ModeloExcepcion{
		
		if(modelo!= null && !modelo.isBlank()) {
			this.modelo= modelo;
		}else {
			throw new ModeloExcepcion();
		}
		
		if(anchura>0) {
			this.anchura= anchura;
		}
		
		if(altura>0) {
			this.altura= altura;
		}
		
		if(precio>0) {
			this.precio= precio;
		}
		
	}

	public String getModelo() {
		return modelo;
	}

	public double getAnchura() {
		return anchura;
	}

	public double getAltura() {
		return altura;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public boolean isOnOff() {
		return onOff;
	}

	public void setOnOff(boolean onOff) {
		this.onOff = onOff;
	}

	@Override
	public boolean equals(Object obj) {
		
		boolean si=false;
		
		Mando o= (Mando) obj;
		
		if(this.modelo.equals(o.modelo)) {
			si=true;
		}
		
		return si;
	}

	@Override
	public int compareTo(Mando o) {
		
		return this.modelo.compareTo(o.modelo);
	}

	@Override
	public String toString() {
		return "Mando: \t Modelo -> "+this.modelo+" Anchura -> "+ this.anchura+" Altura -> "+ this.altura+" Precio -> "+ this.precio;
	}
	
	
	

}
