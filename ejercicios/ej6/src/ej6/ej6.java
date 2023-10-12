package ej6;
import java.util.Scanner;
public class ej6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double ventas ,sueldo,objvalor,valorobjetototal,porcentaje, totaldeltotal;
		System.out.println("ingrese el numero de ventas ");
		ventas=sc.nextDouble();
		System.out.println("ingrese el por objeto ");
		objvalor=sc.nextDouble();
		valorobjetototal=ventas*objvalor;
		porcentaje=(valorobjetototal  % 84);
		sueldo=44400;
		System.out.println("el valor total es "+(sueldo+porcentaje));
		
	}

}
