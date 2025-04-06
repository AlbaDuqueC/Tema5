package boletin4.ejercicio2;

import java.util.Comparator;

public class OrdenAlfabetico implements Comparator<Socio>{

	@Override
	public int compare(Socio o1, Socio o2) {
		return o1.compareTo(o2);
	}

}
