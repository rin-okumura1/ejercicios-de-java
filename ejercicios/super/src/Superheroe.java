import ar.edu.ort.thp.tp2.actividad3.ejercicio11.Resultado;

public class Superheroe {

	private String nombre;
	private int fuerza;
	private int resistencia;
	private int superpoderes;

	private static final int valorMax=100;
	private static final int valorMin=0;
	
	
	public Superheroe(String nombre, int fuerza, int resistencia, int superpoderes) {
		setNombre(nombre);
		setFuerza(fuerza);
		setResistencia(resistencia); 
		setSuperpoderes(superpoderes);
	}
	public String getNombre() {
		return nombre;
	}
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getFuerza() {
		return fuerza;
	}
	private void setFuerza(int fuerza) {
		this.fuerza = setvalue(fuerza);
	}
	public int getResistencia() {
		return resistencia;
	}
	private void setResistencia(int resistencia) {
		this.resistencia = setvalue(resistencia);
	}
	public int getSuperpoderes() {
		return superpoderes;
	}
	private void setSuperpoderes(int superpoderes) {
		this.superpoderes = setvalue(superpoderes);
	}
	private int setvalue(int value) {
		int ret = value;
		if (value < valorMin) {
			ret = valorMin;
		} else if (value > valorMax) {
			ret = valorMax;
		}

		return ret;
	}
	public resultados competir(Superheroe heroe) {
		resultados resultado = resultados.EMPATE;
		int ganarPuntos=0;
		int perderPuntos=0;
		if(this.fuerza>heroe.getFuerza()) {
			ganarPuntos++;
		}
		else if(this.fuerza<heroe.getFuerza()) {
			perderPuntos++;
		}
		if(this.resistencia>heroe.getResistencia()) {
			ganarPuntos++;
		}
		else if(this.resistencia<heroe.getResistencia()) {
			perderPuntos++;
		}
		if(this.fuerza>heroe.getFuerza()) {
			ganarPuntos++;
		}
		else if(this.fuerza<heroe.getFuerza()) {
			perderPuntos++;
		}
		if(this.resistencia>heroe.getSuperpoderes()) {
			ganarPuntos++;
		}
		else if(this.superpoderes<heroe.getSuperpoderes()) {
			perderPuntos++;
		}
		if(perderPuntos<=1) {
			resultado = resultados.DERROTA;
		}
		
		if(ganarPuntos>=2) {
			resultado = resultados.TRIUNFO;
		}
		return resultado;
				
	}
	@Override
	public String toString() {
		return "Superheroe [nombre=" + nombre + ", fuerza=" + fuerza + ", resistencia=" + resistencia
				+ ", superpoderes=" + superpoderes + "]";
	}
	
}
