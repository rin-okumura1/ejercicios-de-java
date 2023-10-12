package ej18;
import java.util.Scanner;
public class ej18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num1 , num2,division;
		System.out.println("ingrese el numero 1 ");
		num1=sc.nextInt();
		System.out.println("ingrese el numero 2 ");
		num2=sc.nextInt();
		division=num1 /num2;
		System.out.println(Math.floor(division));
		if (division  % 2 !=Math.floor(division) )
		{
			System.out.println("el numero es divisible");
		}
		else {
			
		
		System.out.println("el numero no es divisible");
		}
	}
	

}
