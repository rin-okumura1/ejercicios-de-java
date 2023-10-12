package tp2.actividad2;

public class Procesador {
	private String marca;
	private String modelo;
	private double nivelactualdetemperatura;
	public void temperaturacritica() {
		if(nivelactualdetemperatura>80) {
			System.out.println("temperatura alta");
		}
	}
}
