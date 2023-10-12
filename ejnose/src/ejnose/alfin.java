package ejnose;

import java.util.Scanner;

public class alfin {


		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			Scanner sc= new Scanner(System.in);
			double valorc ,cont ;
			String nom ;
			String ap;
			do 
			{
			System.out.println("ingrese el valor de su compra");
			valorc=sc.nextDouble();
			System.out.println("ingrese su nombre");
			nom=sc.nextLine();
			System.out.println("ingrese su apellido");
			ap=sc.nextLine();
			System.out.println("ingrese 1 si quiere continuar");
			cont=sc.nextDouble();
			}while(cont==1);
			
	}

}
