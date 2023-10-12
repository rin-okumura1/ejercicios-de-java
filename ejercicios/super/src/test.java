import ar.edu.ort.thp.tp2.actividad3.ejercicio11.SuperHeroe;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Superheroe superheroe1=new Superheroe("ganar",1000,-200,50);
Superheroe superheroe2=new Superheroe("empatar",50,50,50);
Superheroe superheroe3=new Superheroe("empatar",50,50,50);
Superheroe superheroe4=new Superheroe("derrotar",0,0,0);

competir(superheroe1, superheroe2);
competir(superheroe2, superheroe1);
competir(superheroe1, superheroe3);
competir(superheroe3, superheroe1);
competir(superheroe2, superheroe3);
competir(superheroe3, superheroe2);
competir(superheroe4, superheroe2);
	}
	private static void competir(Superheroe sh1, Superheroe sh2) {
		System.out.println(sh1);
		System.out.println(sh2);
		System.out.println("resultado? " + sh1.competir(sh2));
		
	}
	
}

