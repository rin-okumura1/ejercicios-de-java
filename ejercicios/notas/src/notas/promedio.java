package notas;
import java.util.Scanner;
public class promedio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		double terminar=0;
		short nota1;
		do {
			System.out.println("ingrese nota");
			nota1=sc.nextShort();
			if(nota1>=2 && nota1<=4) 
		{
				System.out.println("usted no aprobo");
		}
			if(nota1>=5 && nota1<=7)
		{
				System.out.println("usted  aprobo");
		}
			if(nota1>=8 && nota1<=10)
		{
				System.out.println("usted supero");
		}
				System.out.println("ingrese 1 para continuar");
		 terminar=sc.nextDouble();
	}while (terminar==1);
	}
}
