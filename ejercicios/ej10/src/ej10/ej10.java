package ej10;
import java.util.Scanner;
public class ej10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String nombre1,nombre2,nombre3;
double cap1,cap2,cap3,captotal,cap6,cap5,cap4;
System.out.println("ingrese el nombre 1");
nombre1=sc.nextLine();
System.out.println("ingrese valor 1");
cap1=sc.nextDouble();
System.out.println("ingrese el nombre 2");
nombre2=sc.next();
System.out.println("ingrese valor 2");
cap2=sc.nextDouble();
System.out.println("ingrese el nombre 3");
nombre3=sc.next();
System.out.println("ingrese valor 3");
cap3=sc.nextDouble();
captotal=cap1 + cap2 +cap3;
cap4=(cap1/captotal)*100;
cap5=(cap2/captotal)*100;
cap6=(cap3/captotal)*100;
System.out.println("el porcentaje es "+nombre1 +" es " +cap4);
System.out.println("el porcentaje es "+nombre2 +" es " +cap5);
System.out.println("el porcentaje es "+nombre3 +" es " +cap6);
	}

}
