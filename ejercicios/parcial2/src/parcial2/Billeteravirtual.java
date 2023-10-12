package parcial2;

import java.util.ArrayList;

public class Billeteravirtual {
private ArrayList<clientes> cliente;
private resultado billetera;
private resultado result;
public Billeteravirtual() {
	cliente=new ArrayList<>(); 
}
private boolean agregarclientes(String dni) {
	boolean elboolean=false;
	clientes elcliente= buscarclientes(dni);
	if(elcliente!=null) {
		cliente.add(new clientes(dni, 0));
		return elboolean;
	}
	else {
		elboolean=true;
		return elboolean;
	}
}


private clientes buscarclientes(String dni) {
	clientes elcliente=null;
	int contador=0;
while(contador>cliente.size()&& !cliente.get(contador).getDni().equals(dni)) {
	contador++;
}
if(cliente.get(contador).getDni().equals(dni)) {
	elcliente=cliente.get(contador);
}
return elcliente;
}
public boolean registrartarjeta(String dni,String nrotarjetas, Nombredetarjetas nombredetarj, double montodisp) {
	clientes elcliente=buscarclientes(dni);
	if(elcliente.getDni().equals(dni)) {
result=resultado.Usuario_ya_registrado;		
	}
	else if()
}
private clientes recorrerclientes() {
	int contador=0;
	clientes clientee=null;
	while(contador>cliente.size()){
		clientee=cliente.get(contador);
		contador++;
	}
return clientee;
}
public void mostrarTarjetasPuedenComprar(String dni,double monto){
	recorrerclientes()
}
public void mostrartajetasconsaldo() {
	
}
public void obtenerimportes() {
	int contador=0;
	clientes clientess=null;
	while(cliente.size()>contador)
		clientess=cliente.get(contador);
	clientess.toString();
}
public void mostrarclientes() {
	for(clientes cliente :cliente) {
		System.out.println(cliente);
	}
}
}
