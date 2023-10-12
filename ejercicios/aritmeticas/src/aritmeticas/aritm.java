package aritmeticas;
import java.util.Scanner;
public class aritm {

		// TODO Auto-generated method stub
		final static Scanner sc=new Scanner(System.in);
		
		public static void main(String[] args) {

			int valA,valB;
			
			System.out.println("Valor A");
			valA =Integer.parseInt(sc.nextLine());
					
			System.out.println("Valor B");
			valB =Integer.parseInt(sc.nextLine());
			
			ImprimirResultados(valA, valB);
		}
		
		public static int Sumar(int a, int b)
		{
			return a+b;
		}
		
		public  static int Restar(int a, int b)
		{
			return a-b;
		}
		
		public static void ImprimirResultados(int valorA, int valorB) {
			
			int resSuma = Sumar(valorA,valorB);
			System.out.println("La suma es: " + resSuma);
			
			int resResta = Restar(valorA,valorB);
			System.out.println("La resta es: " + resResta);
		}
		

	}


