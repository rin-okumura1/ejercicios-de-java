package joderajacko;

import java.util.Scanner;

public class joder {
	Scanner sc = new Scanner(System.in);
private String molestar ;
public String getMolestar() {
	return molestar;
}
public void setMolestar(String molestar) {
	this.molestar = molestar;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
private String nombre ;
public String molesto() {
	return molestar +" " + nombre;
}
}
