package boletin4.ejercicio2;

import java.util.Arrays;

public class Principal {

	public static void main(String[] args) {
		
		Socio socios[] = new Socio[] { new Socio(1, "Juan", 38), new Socio(2, "Pepe", 26), new Socio(3, "Amalia", 49), };

		System.out.println(Arrays.toString(socios));

		Arrays.sort(socios);
		System.out.println(Arrays.toString(socios));

		Arrays.sort(socios, new OrdenAlfabetico());
		System.out.println(Arrays.toString(socios));
		
		Arrays.sort(socios, new OrdenEdadMasMenos());
		System.out.println(Arrays.toString(socios));

	}

}
