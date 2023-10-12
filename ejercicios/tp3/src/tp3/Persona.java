package tp3;

public class Persona {
	public Persona(String dni,String nombre,String apellido , String domicilio);
	{
		setdni(dni);
	}
private String nombre;
private String apellido;
private String dni;
private String domicilio;

public String getdni() {
return dni;
}
private void setdni(String dni) {
	this.dni=dni;
}
}

