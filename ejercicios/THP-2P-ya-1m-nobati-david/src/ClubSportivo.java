import java.util.ArrayList;

public class ClubSportivo {
private ArrayList<Socios> socios;
private Socios soci;
private Resultado resultado;

public ClubSportivo(){
	Resultado resultado=null;
	socios=new ArrayList<>();
	
}
public void agregarSocios(String nombre,int edad) {
	buscarSocios(nombre,edad);
	if(!soci.equals(nombre))
	socios.add(soci);
	System.out.println(resultado);
}
public void buscarSocios(String nombre,int edad) {
	for(Socios socio:socios) {
	revisarsocios(nombre,edad);	
	}
}
	public void revisarsocios (String nombre,int edad) {
		if(soci.equals(nombre)&&soci.getEdad()==edad) {
			Resultado resultado=resultado.YA_EXISTE;
		}
		if(soci.equals(nombre)) {
			Resultado resultado=resultado.NOMBRES_IGUALES;
	}
}
	public Socios getSoci() {
		return soci;
	}
	private void setSoci(Socios soci) {
		this.soci = soci;
	}

}
