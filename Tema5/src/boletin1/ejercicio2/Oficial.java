package boletin1.ejercicio2;

public class Oficial {

	Operario empleado;

	public Oficial(String e) {
		empleado = new Operario(e);
	}

	public String toString() {

		return empleado.toString() + " -> Oficial";

	}

}
