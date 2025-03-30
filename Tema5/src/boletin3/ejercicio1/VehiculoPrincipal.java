package boletin3.ejercicio1;

import java.util.Scanner;

public class VehiculoPrincipal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int veloci;

		int tiempo;

		Camion camion1 = new Camion("Seat", "To-Guapo", "Azul", "1234ABC", 10000, true);

		camion1.arrancar();

		System.out.println("Dime la velocidad deseada: ");
		veloci = sc.nextInt();
		sc.nextLine();

		camion1.acelerar(veloci);

		System.out.println("Introduce el tiempo: ");
		tiempo = sc.nextInt();

		sc.nextLine();

		System.out.println("Se ha mantenido " + tiempo + " minutos a " + camion1.getVelocidad() + " km/h");

		camion1.frenar(15);

		camion1.Parar();
		
	}

}
