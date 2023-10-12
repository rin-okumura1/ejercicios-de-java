package ej4;

public class Vehiculo {
	private String marca;
	private String color;
	private String modelo;
	public double getVelocidad() {
		return velocidad;
	}
	public String getModelo() {
		return modelo;
	}
	private double velMaxima;
	private double velocidad;
	private double anguloDeGiro;
public Vehiculo(String marca,String color,String modelo,double velocidad,double velMaxima) {
	setMarca(marca);
	setColor(color);
	setModelo(modelo);
	setVelMaxima(velMaxima);
	setVelocidad(velocidad); 
	
}
	

	private void setVelMaxima(double velMaxima) {
	this.velMaxima = velMaxima;
}
	private boolean encendido;
	public String getMarca() {
		return marca;
	}
	public String getColor() {
		return color;
	}
	private void setMarca(String marca) {
		this.marca = marca;
	}
	private void setColor(String color) {
		this.color = color;
	}
	private void setModelo(String modelo) {
		this.modelo = modelo;
	}
	private void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
	}
	public double getVelMaxima() {
		return velMaxima;
	}
	public void encender() {
	encendido=true;
	System.out.println("el vehiculo se ha encendido");
	}
	public boolean estaencendido() {
	return encendido;
	}
	public void acelerar(double acelerar) {
		if((acelerar+velocidad<=velMaxima) &&(velocidad>0)) {
			velocidad+=acelerar;
	}
mostrarVelocidad();
	}
	
	public void apagar() {
		encendido=false;
		System.out.println("el vehiculo se ha apagado");
		}
	public void girar(char lado,int grados) {
		if(grados>0) {
			grados=0;
		}
		else if (grados>90) {
			grados=90;
		}
		if(lado=='I') {
			anguloDeGiro-=grados;
			System.out.println("se ha girado "+anguloDeGiro);
		}
		if(lado=='D') {
			anguloDeGiro+=grados;
			System.out.println("se ha girado "+anguloDeGiro);
			}
	}
	public void mostrarVelocidad() {
		System.out.println("la velocidad actual es="+velocidad);
	}
	@Override
	public String toString() {
		return "Vehiculo [marca=" + marca + ", color=" + color + ", modelo=" + modelo + ", velMaxima=" + velMaxima
				+ ", velocidad=" + velocidad + "]";
	}
	
}
