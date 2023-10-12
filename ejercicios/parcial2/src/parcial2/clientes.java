package parcial2;

import java.util.ArrayList;

public class clientes {
private String dni;
private ArrayList<Tarjetas> tarjeta;
private double importeacumulado;

public clientes(String dni, double importeacumulado) {
	
	setDni( dni);
 tarjeta = new ArrayList<>();
	setImporteacumulado(importeacumulado);
}
public String getDni() {
	return dni;
}
private void setDni(String dni) {
	this.dni = dni;
}
public double getImporteacumulado() {
	return importeacumulado;
}
private void setImporteacumulado(double importeacumulado) {
	this.importeacumulado = importeacumulado;
}
public boolean agregartarjeta(String dni,String nrotarjeta, Nombredetarjetas nombredetarj, double montodisp) {
	boolean elboolean=false;
	Tarjetas tarjet=recorrertarjetas(nrotarjeta);
	if(tarjet!=null) {
		tarjeta.add(new Tarjetas(nrotarjeta, nombredetarj, montodisp));
	}
	return elboolean;
}
@Override
public String toString() {
	return "clientes [dni=" + dni + ", importeacumulado=" + importeacumulado + "]";
}
public Tarjetas recorrertarjetas(String nrotarjeta) {
	int tarj=0;
	Tarjetas tarjet=null;
	while(tarj<tarjeta.size()&&tarjeta.get(tarj).getNrotarjeta().equals(nrotarjeta)){
		if(tarjeta.get(tarj).getNrotarjeta().equals(nrotarjeta)) {
			tarjet=tarjeta.get(tarj);
		}
	}
		return tarjet;
	}
public void sabersaldo(double saldo) {
	Tarjetas tarjetaa=null;
	int contador=0;
	while(contador>tarjeta.size() ) {
		tarjetaa=tarjeta.get(contador);
		if(tarjetaa.getMontodisp()>saldo) {
			System.out.println("la tarjeta tiene un saldo de ");
			System.out.println(tarjetaa.getMontodisp());
		}
		
		contador++;
	}
	
}

}

