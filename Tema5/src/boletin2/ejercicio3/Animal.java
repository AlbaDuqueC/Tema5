package boletin2.ejercicio3;

public interface Animal {
	
	public static void comer() {
		System.out.println("ñam");
	}
	
	public static void dormir() {
		System.out.println("zzz");
	}
	
	public default String hacerRuido() {
		return "";
		
	}

}
