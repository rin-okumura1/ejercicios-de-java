package modeloexamenestante;
import java.util.Scanner;
public class estante {

	static final char FIN = 'Z';
	static final char INFANTIL ='I' ;
	static final char NOVELA ='N' ;
	static final char HISTORIA ='H' ;
	static final Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int cantidadl,cantpaginas,cantlibroN,cantlibroH,contadorl,generoi,generoh,generon,estantes,promedioest,maxpags;
char genero,estante;
String nombre,nombremax;
double promediolibro;
maxpags=0;
generoi=0;
contadorl=0;
generoh=0;
generon=0;
cantpaginas=-1;
estantes=0;
cantidadl=1;
nombremax="";
System.out.println("ingrese nombre de estante ponga Z para terminar");
estante=sc.next().toUpperCase().charAt(0);
while(estante!=FIN){
	
	System.out.println("ingrese cantidad de libros");
	estantes++;
	cantidadl=sc.nextInt();
	while(cantidadl<=-1) {
	if(cantidadl<=-1)
		System.out.println("porfavor ingrese un numero valido de libros");
		cantidadl=sc.nextInt();
	}
	while(contadorl<cantidadl) {
		System.out.println("ingrese el nombre");
		contadorl++;
		nombre=sc.next();
		System.out.println("ingrese el genero");
		genero=sc.next().toUpperCase().charAt(0);
		switch(genero){
			case HISTORIA:
				generoh++;
				
				break;
			case INFANTIL:
				generoi++;
				
				break;
			case NOVELA:
				generon++;

				break;
				default:
		}
		if(genero!=INFANTIL&&genero!=NOVELA&&genero!=HISTORIA) {
			
			System.out.println("genero no valido");
		}
		
		System.out.println("ingrese cantidad de paginas");
		cantpaginas=sc.nextInt();
	while(cantpaginas<0) {
			System.out.println("ingrese cantidad de paginas validas");
			cantpaginas=sc.nextInt();
	}
		
	if(cantpaginas>maxpags) {
		maxpags=cantpaginas;
		nombremax=nombre;
		
	}
	}
	System.out.println("ingrese estante");
	estante=sc.next().toUpperCase().charAt(0);		
	
	}
promedioest=(estantes/cantidadl);
System.out.println(promedioest);
System.out.println("el mayor numero de paginas lo tuvo "+maxpags +" y su nombre fue "+ nombremax);
	

	}
}
