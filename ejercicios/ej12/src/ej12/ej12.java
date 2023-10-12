package ej12;
import java.util.Scanner;
public class ej12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc =new Scanner(System.in);
sc= new Scanner(System.in);
int num1, num2;

System.out.println("Ingrese un número");
num1= Integer.parseInt(sc.nextLine());

System.out.println("Ingrese un segundo número");

num2= Integer.parseInt(sc.nextLine());

if(num1 > num2) {
	System.out.println("Numero 1 es mayor que numero 2");
}
else if(num1==num2) {
	System.out.println("Los 2 números son identicos");
}
else 
{
	System.out.println("Numero 2 es mayor que numero 1");
}
}

	}
	


