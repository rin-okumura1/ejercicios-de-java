package ej8;
import java.util.Scanner;
public class ej {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		Scanner sc=new Scanner(System.in);
	int num,num2;
	System.out.println("ingrese su primer numero" );
	num=sc.nextInt();
	System.out.println("ingrese su segundo numero");
	num2=sc.nextInt();
	if (num>=1&&num2>=1) {
		System.out.println(num/num2);
		System.out.println(num*num2);
		System.out.println(num-num2);
		System.out.println(num+num2);
	}
		else {
			System.out.println("ingrese un valor natural");
		
		}
	}
	}
	

