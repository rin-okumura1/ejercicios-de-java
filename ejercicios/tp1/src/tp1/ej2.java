package tp1;

import java.util.Scanner;

public class ej2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n1,n2,n3,promedio,acum;
		System.out.println("ingrese su 1era nota");
		n1=sc.nextInt();
		System.out.println("ingrese su 2da nota");
		n2=sc.nextInt();
		System.out.println("ingrese su 3era nota");
		n3=sc.nextInt();
		acum=n1+n2+n3;
		promedio=acum/3;
		System.out.println("su promedio es = "+promedio);
	}

}
