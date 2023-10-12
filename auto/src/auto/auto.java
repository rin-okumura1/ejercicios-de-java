package auto;

public class auto {

	public int velocidad;
	public String marca;
	public String color;
	public double tamano;
	
	public String Encender() {
		String E ="encendiendo el auto";
		return E;
	}
	
	public String apagar() {
		String E ="apagar el auto";
		return E;
	}
	public String frenar() {
		String E ="frenando el auto";
		return E;
	}
	
	public String VelocidadAtual(int _velocidad ) {
		String E ="Viajando a " + _velocidad + "k/h";
		return E;
	}

}
