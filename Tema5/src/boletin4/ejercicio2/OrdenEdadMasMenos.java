package boletin4.ejercicio2;

import java.util.Comparator;

public class OrdenEdadMasMenos implements Comparator<Socio>{

	@Override
	public int compare(Socio o1, Socio o2) {

		return o2.getEdad() - o1.getEdad();
	}

}
