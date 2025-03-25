package boletin2.ejercicio1;

import java.util.Scanner;
import java.util.TreeSet;

public class PrincipalSocio {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		TreeSet<Socio> lista= new TreeSet<Socio>();
		Socio so;
		
		int id;
		String nombre;
		int edad;
		
		System.out.println("Introduzca los datos del nuevo socio:");
		System.out.print("ID: ");
		id=sc.nextInt();
		System.out.print("Nombre: ");
		nombre= sc.next();
		System.out.println();
		System.out.print("Edad: ");
		edad= sc.nextInt();
		System.out.println();
		so=new Socio(id,nombre,edad);
		
		lista.add(so);
		
		System.out.println(lista);
		
		//ESTA MAL

	}

}
