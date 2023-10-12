
import java.util.Scanner;
public class test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
	
			final int CANT_PASADAS = 3;
			double valorMetro, ancho, largo, cantAlambre, valorTerreno;
			System.out.println("Ingresa valor metro cuadrado:");
			valorMetro =sc.nextDouble();
			System.out.println("Ingresa ancho del terreno:");
			ancho = sc.nextDouble();
			System.out.println("Ingresa largo del terreno:");
			largo = sc.nextDouble();
			valorTerreno = ancho * largo * valorMetro;
			cantAlambre = (ancho + largo) * 2 * CANT_PASADAS;
			System.out.println("Valor Terreno: $" + valorTerreno);
			System.out.println("Cantidad de alambre a utilizar: " + cantAlambre + " metros");
	}

}
