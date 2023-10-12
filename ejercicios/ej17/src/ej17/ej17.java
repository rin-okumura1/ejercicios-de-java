package ej17;
import java.util.Scanner;
public class ej17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String sexo;
		int edad ;
		System.out.println("ingrese su genero puede se f para femenino o m para masculino");
		sexo=sc.next();
		System.out.println("ingrese su edad ");
		edad=(sc.nextInt());
		if (sexo!="f"&&edad>=65 && sexo!="F"){
			System.out.println("usted se puede jubilar ");
			
		}
		else if (sexo=="f"&&edad>=60){
			System.out.println("usted se puede jubilar ");
		}
		else 
		{
			System.out.println("usted no se puede jubilar ");
		
		}
	}

}
