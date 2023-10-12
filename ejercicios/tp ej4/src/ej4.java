import java.util.Scanner;
public class ej4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		double valorhora , horastrabajadas , diastrabajados , diassabados  ,valortotals ,valortotal1;
		System.out.println("ingrese el valor por hora");
		valorhora=teclado.nextInt();
		System.out.println("ingrese la cantidad de horas por dia");
		horastrabajadas=teclado.nextInt();
		System.out.println("ingrese dias trabajados");
		diastrabajados=teclado.nextDouble();
		diassabados = horastrabajadas / 2.0 ;
		valortotals=diassabados;
		valortotal1=(valorhora* horastrabajadas* diastrabajados)+valortotals;
		System.out.println("el salario semanal es " + valortotal1);
	}

}
