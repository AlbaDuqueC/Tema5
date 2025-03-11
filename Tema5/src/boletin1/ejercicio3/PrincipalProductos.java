package boletin1.ejercicio3;

public class PrincipalProductos {

	public static void main(String[] args) {
		
		Productos p1= new Productos ("Tomate", 6);
		Perecedero pP1= new Perecedero ("Tomate", 6,3);
		
		Productos p2= new Productos ("Guisante", 2);
		NoPerecedero pN2= new NoPerecedero ("Guisante" ,2.0,"legumbre");
		
		System.out.println(p1);
		System.out.println(pP1);
		System.out.println(p2);
		System.out.println(pN2);

	}

}
