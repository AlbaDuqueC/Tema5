package boletin1.ejercicio1;

public class PrincipalHora {

	public static void main(String[] args) {
		
		Hora horita;
		HoraExacta horitaEx;
		
		int h=23;
		int m=59;
		int s=59;
		
		
		horita=new Hora(h, m);
		horitaEx= new HoraExacta(h, m, s);
		
		System.out.println(horita.setHora(h));
		
		System.out.println(horita.setMinutos(m)); 
		horita.inc();
		System.out.println(horita.toString()); 
		
		System.out.println(horitaEx.toString());
		horitaEx.inc();
		System.out.println(horitaEx.toString());
		

	}

}
