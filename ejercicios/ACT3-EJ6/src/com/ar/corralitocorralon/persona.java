package com.ar.corralitocorralon;

public class persona {


public class Persona {
	public Persona(String _DNI, String _nombre, String _apellido, Domicilio domicilio) {
		setDNI(_DNI);
		setNombre(_nombre);
		setApellido(_apellido);
	}
	
	private void setDNI(String _dni) {
		DNI = _dni;
	}
	
	public String getDNI() {
		return DNI;
	}
	
	private void setNombre(String _nombre) {
		nombre = _nombre;
	}
	public String getNombre() {
		return nombre;
	}

	private void setApellido(String _dni) {
		apellido = _dni;
	}
	public String getApellido() {
		return apellido;
	}

	public void setDomicilio(Domicilio _domicilio) {
		domicilio = _domicilio;
	}
	
	public Domicilio getDomicilio() {
		return domicilio;
	}
	
	private String DNI;
	private String nombre;
	private String apellido;
	private Date fechaDeNacimiento;
	private Domicilio domicilio;
}
}
