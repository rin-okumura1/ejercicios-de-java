package com.ar.corralitocorralon;
import java.time.LocalDate;
import java.util.Date;

public class cuentabancaria {
public cuentabancaria() {
saldo=0;
}

	private String clavebancaria;
private Tipo tipo;
private double saldo=0;
private Date fechadeapertura;
private persona titular;

private void setpersona(persona ptitular) {
	titular = ptitular;
}
public String getNombre() {
	return nombre;
}
private void setNombre(String _nombre) {
	nombre = _nombre;
}
public Tipo getTipo(Tipo pTipo) {
	return tipo;
}
public static Date obtenerFechaDeHoy() {
	return Date;
}
public String generarCBU() {
	return "1234567";
	
}
public double verSaldo() {
	return saldo;
	
}
public void depositar (double saldoADeDepositar) {
if(saldoADeDepositar>0) {
	
saldo+=saldoADeDepositar;

}
public boolean Extraer(double saldoAExtraer) {
	if(saldo>=saldoAExtraer&&saldoAExtraer>0) {
		saldo-=saldoAExtraer;
		return true;
	}
	else {
		return false;
	}

}
}
}