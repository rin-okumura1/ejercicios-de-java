package ej7;
import java.util.Scanner;
public class ej7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double ancho , largo, valor,Cant_Pasadas,cantAlambre;
		Cant_Pasadas=3;
		System.out.println("ingrese el ancho");
		ancho=sc.nextDouble();
		System.out.println("ingrese el largo");
		largo=sc.nextDouble();
		System.out.println("ingrese el valor de metro cuadrado");
		valor=sc.nextDouble();
		System.out.println("el valor total es " + valor*ancho*largo);
		cantAlambre = (ancho + largo)  *2*Cant_Pasadas;
		System.out.println("y la cantidad de alambre necesaria es"+cantAlambre);
	}

}
