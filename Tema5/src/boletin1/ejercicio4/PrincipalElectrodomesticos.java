package boletin1.ejercicio4;

public class PrincipalElectrodomesticos {

	public static void main(String[] args) {
		
	Electrodomestico electro1= new Electrodomestico(36, 50);
	Electrodomestico electro2= new Electrodomestico(20, 40, "AZUL", 'B');
	
	electro1.precioFinal();
	electro2.precioFinal();
	
	System.out.println(electro1.getPrecioBase());
	System.out.println(electro2.getPrecioBase());
	
	Electrodomestico electro3= new Television(36, 50);
	Electrodomestico electro4= new Television(20, 50, "GRIS", 'C', 30, false);
	Electrodomestico electro5= new Lavadora(20, 40);
	Electrodomestico electro6= new Lavadora(20, 40, "ROJO", 'D', 54);

	electro3.precioFinal();
	electro4.precioFinal();
	electro5.precioFinal();
	electro6.precioFinal();
	
	System.out.println(electro3.getPrecioBase());
	System.out.println(electro4.getPrecioBase());
	System.out.println(electro5.getPrecioBase());
	System.out.println(electro6.getPrecioBase());
	}

}
