package ej14;
import java.util.Scanner;
public class ej14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
double altura;
int edad ;
String nombre ;
System.out.println("ingrese su nombre ");
nombre=sc.nextLine();
System.out.println("ingrese su edad ");
edad=sc.nextInt();
System.out.println("ingrese su altura ");
altura=sc.nextDouble();
if(edad>=7 && altura>1.50) 
{System.out.println("usted puede entrar " +nombre);

}
else 
{
	System.out.println("no puede entrar " +nombre);
}
	}
}




	
