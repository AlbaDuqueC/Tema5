package boletin3.ejercicio1;

public class Turismo extends Vehiculo {
	
	enum TipoUso{PROFESIONAL, PARTICULAR}
	
	private int numPlazas;
	private TipoUso uso=TipoUso.PARTICULAR;
	

	public Turismo(String marca, String modelo, String color, String matricula, int numPlazas, String uso) {
		super(marca, modelo, color, matricula);
		
		if(numPlazas>0 && numPlazas<=7) {
			
			this.numPlazas=numPlazas;
			
		}
		
		comprobarTipo(uso);
	
		}
	

		public int getNumPlazas() {
			return numPlazas;
		}
		
		public TipoUso getUso() {
			return uso;
		}

		public void setUso(TipoUso uso) {
			this.uso = uso;
		}
		
		
		private void comprobarTipo(String uso) {
			
			uso.toUpperCase();
			
			switch(uso) {
				case "PROFESIONAL", "PARTICULAR" ->{
					this.uso=TipoUso.valueOf(uso);
					
				}
			}
			
		}
		
		public String toString() {
			return super.toString() + ", TipoUso: " + uso + ", NumeroPlazas: " + numPlazas;
		}
	

}
