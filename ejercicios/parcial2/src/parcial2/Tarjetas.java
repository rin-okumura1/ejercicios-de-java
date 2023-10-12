package parcial2;

public class Tarjetas {
private String nrotarjeta;
private Nombredetarjetas nombredetarj;
private double montodisp;


public Tarjetas(String nrotarjetas, Nombredetarjetas nombredetarj, double montodisp) {
	setNrotarjeta(nrotarjeta); 
	setNombredetarj(nombredetarj);
	setMontodisp(montodisp);
}


public String getNrotarjeta() {
	return nrotarjeta;
}


private void setNrotarjeta(String nrotarjeta) {
	this.nrotarjeta = nrotarjeta;
}


public Nombredetarjetas getNombredetarj() {
	return nombredetarj;
}


private void setNombredetarj(Nombredetarjetas nombredetarj) {
	this.nombredetarj = nombredetarj;
}


public double getMontodisp() {
	return montodisp;
}


private void setMontodisp(double montodisp) {
	this.montodisp = montodisp;
}

}
