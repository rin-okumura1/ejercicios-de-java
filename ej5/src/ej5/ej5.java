package ej5;
import java.util.Scanner;
public class ej5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num1 ,num2 ,conserva;
		System.out.println("ingrese su primer valor ");
		num1=sc.nextInt();
		System.out.println("ingrese su segundo valor ");
		num2=sc.nextInt();
		conserva=num2;
		num2=num1;
		num1=conserva;
		System.out.println("segundo valor "+num2);
		System.out.println("primer valor "+num1);
	}

}
