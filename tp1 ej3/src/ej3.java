import java.util.Scanner;

public class ej3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado= new Scanner (System.in);
		int valor1 , valor2 , valor3 ;
		System.out.println("ingrese su primer numero");
		valor1 =teclado.nextInt();
		valor2=(valor1) *5 ;
		valor3=(valor1) / 2 ;
		System.out.println("el numero multiplicado por 5 es "+ valor2);
		System.out.println("el numero dividido por 2 es " +valor3);
	}

}
