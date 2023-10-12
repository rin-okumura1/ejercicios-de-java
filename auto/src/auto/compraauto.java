package auto;

import java.util.Scanner;

public class compraauto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		auto auto1;
		auto1=new auto();
		auto1.marca="ford";
		auto1.tamano=2;
		System.out.println("indique velocidad a la que quiere viajar");
		auto1.velocidad=sc.nextInt();
		String encendiendoElAuto = auto1.Encender();
		String velocidadAct=auto1.Encender();
		String velocidadAct=velocidadAct(auto1.velocidad());
	}

}
