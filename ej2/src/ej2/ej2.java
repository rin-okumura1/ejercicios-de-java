package ej2;
import java.util.Scanner;
public class ej2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int nota1 , nota2 ,nota3 ,promedio ;
System.out.println("ingrese su primera nota");
nota1=sc.nextInt();
System.out.println("ingrese su segunda nota");
nota2=sc.nextInt();
System.out.println("ingrese su tercera nota");
nota3=sc.nextInt();
promedio=(nota1+nota2+nota3)/3;
System.out.println("su promedio es "+promedio);
	}

}
