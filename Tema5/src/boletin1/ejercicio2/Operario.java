package boletin1.ejercicio2;

public class Operario {
	
	Empleado empleado;
	
	public Operario (String e) {
		empleado= new Empleado(e);
	}
	
	public String toString() {
		
		return empleado.toString()+ " -> Operario";
		
	}

}
