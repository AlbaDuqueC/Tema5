package boletin1.ejercicio2;

public class Tecnico {
	
Operario empleado;

	public Tecnico (String e) {
		empleado= new Operario(e);
	}
	
	public String toString() {
		
		return empleado.toString()+ " -> Tecnico";
		
	}

}
