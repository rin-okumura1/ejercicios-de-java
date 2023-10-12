import java.util.Scanner;
public class ej9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		int angulo1,angulo2,restante,total;
		System.out.println("ingrese angulo 1");
		angulo1=sc.nextInt();
				System.out.println("ingrese angulo 2");
		angulo2=sc.nextInt();
		restante=180;
		total=angulo1+angulo2;
		System.out.println(restante-total);
	}

}
