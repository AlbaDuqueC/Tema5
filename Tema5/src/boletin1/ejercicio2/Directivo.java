package boletin1.ejercicio2;

public class Directivo {
	
Empleado empleado;

	public Directivo (String e) {
		empleado= new Empleado(e);
	}
	
	public String toString() {
		
		return empleado.toString()+ " -> Directivo";
		
	}

}
