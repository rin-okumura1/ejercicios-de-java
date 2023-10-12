package tabla;
import java.util.Scanner;
public class tablademultiplicar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num , cont ;
		cont=0;
		System.out.println("ingrese su numero a multiplicar");
		num=sc.nextInt();
		for(int numerador=1;numerador<=10;numerador++)
		{
			cont++;
			System.out.println("el numero multiplicado es "+ num*cont);
		}
		}
	}


