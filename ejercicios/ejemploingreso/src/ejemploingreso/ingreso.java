package ejemploingreso;


import java.util.Scanner;

public class ingreso {

	public static void main(String[] args) {
		Scanner teclado=new Scanner (System.in);
		double horastrabajadas , diastrabajados , valorhora;
		System.out.println("ingrese horas trabajadas");
		horastrabajadas=teclado.nextDouble();
		System.out.println("ingrese dias trabajados");
		diastrabajados=teclado.nextDouble();
		System.out.println("ingrese el valor por hora de trabajo");
		valorhora=teclado.nextDouble();
		System.out.println("el salario semanal es "+ valorhora*diastrabajados*horastrabajadas);
		
		}

	}


