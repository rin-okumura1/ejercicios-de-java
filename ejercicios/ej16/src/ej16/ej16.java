package ej16;
import java.util.Scanner;
public class ej16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int cantAsientos , cantPersonas,resto ;
		System.out.println("Ingrese cantidad de asientos");
		cantAsientos=sc.nextInt();
		System.out.println("Ingrese cantidad de personas");
		cantPersonas=sc.nextInt();
		resto=cantAsientos-cantPersonas;
		if(resto>=0) {
			System.out.println("hay suficientes asientos y sobran "+resto);
			}
		else 
		{
				System.out.println("faltan esta cantidad de asientos " + resto *-1);
			}
			}
		
		
	}


