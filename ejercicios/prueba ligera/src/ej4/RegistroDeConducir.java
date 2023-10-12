package ej4;

public class RegistroDeConducir {
	private String nroderegistro;

	public RegistroDeConducir(String nroRegistro) {
		this.setNroRegistro(nroRegistro);
	}

	public String getNroRegistro() {
		return nroderegistro;
	}

	private void setNroRegistro(String nroRegistro) {
		this.nroderegistro = nroRegistro;
	}

	@Override
	public String toString() {
		return "RegistroDeConducir [nroderegistro=" + nroderegistro + "]";
	}
	
	
}
