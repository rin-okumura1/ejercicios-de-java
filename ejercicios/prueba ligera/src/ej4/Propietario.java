package ej4;

import ar.edu.ort.thp.tp2.actividad2.ejercicio4.RegistroDeConducir;
import ar.edu.ort.thp.tp2.actividad2.ejercicio4.Vehiculo;

public class Propietario {
	private String nombre;
	private RegistroDeConducir registro;
	private Vehiculo vehiculo;
	
	public Propietario( String nombre, RegistroDeConducir registro) {
		setNombre(nombre);
		setRegistro(registro);
		vehiculo = null;
	}
	
	
	public RegistroDeConducir getRegistro() {
		return registro;
	}
	public void RegistroDeConducir(RegistroDeConducir registro) {
		this.registro = registro;
	}

	


	public void montarvehiculo(Vehiculo vehiculo) {
		if(this.vehiculo!=null) {
			vehiculo.
			vehiculo=this.vehiculo;
		}
	}
		public String getNombre() {
		return nombre;
	}




	public Vehiculo getVehiculo() {
			return vehiculo;
		}




	private void setRegistro(RegistroDeConducir registro) {
		this.registro = registro;
	}




	private void setNombre(String nombre) {
		this.nombre = nombre;
	}




		public void ponerenmarcha() {
		if(this.vehiculo!=null) {
			vehiculo.encender();
		}
	}
		public void acelerar(double acelerar) {
			if(this.vehiculo!=null) {
				vehiculo.acelerar(acelerar);
			}
		}
		public Vehiculo venderVehiculo() {
			Vehiculo vehiculo = this.vehiculo;
			this.vehiculo = null;
			return vehiculo;
		}
		public void apagar() {
			vehiculo.apagar();
		}
	public void estaEncendido() {
		vehiculo.estaencendido();
	}


	@Override
	public String toString() {
		return "Propietario [nombre=" + nombre + ", registro=" + registro + ", vehiculo=" + vehiculo + "]";
	}

}
