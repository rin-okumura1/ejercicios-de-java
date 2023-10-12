package ej20;
import java.util.Scanner;
public class ej20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
	int suma, resta ,multiplicacion ,num1 ,num2;
	double division;
	System.out.println("ingrese su primer numero");
	num1=sc.nextInt();
	System.out.println("ingrese su segundo numero");
	num2=sc.nextInt();
    suma=num1 + num2;
    System.out.println(suma);
    resta = num1 -num2;
    System.out.println(resta);
    multiplicacion=num1*num2;
    System.out.println(multiplicacion);
    division=num1/num2 ;
    if(division==0)
    {
    	System.out.println("Error"+ division);
    }
	}

}
