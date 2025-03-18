package boletin1.ejercicio5;

import java.util.HashSet;
import java.util.Scanner;

public class PrincipalPolígonos {
	
	static HashSet<Polígonos> poli= new HashSet<Polígonos>();

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int numMenu;

		do {
			menu();

			System.out.print("Introduce la opcion del menu: ");
			numMenu = sc.nextInt();
			sc.nextLine();

			switch (numMenu) {

			case 1 -> {
				opcion1();
			}
			case 2->{
				opcion2();
			}
			case 3->{
				
			}

			}

		} while (numMenu == 0);

	}

	public static void menu() {
		System.out.println("1. Introducir triángulo.");
		System.out.println("2. Introducir rectángulo.");
		System.out.println("3. Mostrar polígonos.");
		System.out.println("0. Salir");
	}

	public static void opcion1() {

		double lado1;
		double lado2;
		double lado3;

		System.out.println("Introduce el tamaño de los lados");
		System.out.print("-Lado 1:");
		lado1 = sc.nextDouble();
		System.out.print("-Lado 2:");
		lado2 = sc.nextDouble();
		System.out.print("-Lado 3:");
		lado3 = sc.nextDouble();

		Polígonos tri = new Triangulo(lado1, lado2, lado3);
		poli.add(tri);

	}

	public static void opcion2() {

		double lado1;
		double lado2;

		System.out.println("Introduce el tamaño de los lados");
		System.out.print("-Lado 1:");
		lado1 = sc.nextDouble();
		System.out.print("-Lado 2:");
		lado2 = sc.nextDouble();

		Polígonos rec = new Rectangulos(lado1, lado2);
		poli.add(rec);

	}

}
