import java.util.Scanner;

public class peajetest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char vehiculo;
		int precio,hora,vehiculos,camionetas ,total,terminar,noterminar;
		double porcentaje ;
		final char moto='M';
		final char auto='A';
		final char camioneta='C';
		vehiculos=0;
		noterminar=0;
		terminar=1;
		total=0;
		camionetas=0;
		String patente;
		char fin;
		System.out.println("ingrese patente fin para terminar ");
		patente=sc.next().toUpperCase();
		switch(patente) {
		case "FIN":
			terminar=-1;
				break;
			
				default:break;
			}
		while(terminar>noterminar) {
			if(noterminar>=terminar) {
				break;
			}
		
		
		System.out.println("ingrese tipo de vehiculo M para moto ,C para camioneta y A para auto");
		vehiculo=sc.next().toUpperCase().charAt(0);
		switch(vehiculo) {
		case moto:
			vehiculos++;
			precio=50;
			
			System.out.println("ingrese la hora");
			hora=sc.nextInt();
			if(hora>=9&&hora<=18) {
				precio=50 +25;
			}
			total=total+precio;
				
				break;
			
		case auto:
			vehiculos++;
			precio=100;
			System.out.println("ingrese la hora");
			hora=sc.nextInt();
			if(hora>=9&&hora<=18) {
				precio=(100 + 50);
			}
			total=total+precio;
			
			break;
		case camioneta:
			vehiculos++;
			camionetas++;
			precio=150;
			System.out.println("ingrese la hora");
			hora=sc.nextInt();
			if(hora>=9&&hora<=18) {
				precio=(150  +75);
			}
			total=total+precio;
				break;

			}
		System.out.println("ingrese patente (fin para terminar ");
		patente=sc.next().toUpperCase();
		switch(patente) {
		case "FIN":
			terminar=-1;
				break;
				default:break;
			}
		

		}
		if(vehiculos<=0) {
			System.out.println("no hubo vehiculos");
		}
		if(vehiculos >0) {
		porcentaje=(camionetas/vehiculos)*100;
		System.out.println("el promedio de camionetas fue "+ porcentaje);
		System.out.println("el total recaudado es "+ total);
		}

	
}
}

