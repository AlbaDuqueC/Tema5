package boletin4.ejercicio1;

import java.util.Comparator;

public class Ordenar implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2)  {
		return o2-o1;
	}

}
