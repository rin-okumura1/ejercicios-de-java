package com.ar.corralitocorralon;

public class Domicilio {
	public Domicilio(String pcalle,String paltura,String pbarrio) {
		
	}
	private String altura;
	private String calle;
	private String barrio;
	
	public void setcalle(String pcalle) {
		calle = pcalle;
	}
	
	public String getcalle() {
		return calle;
	}
		public void setaltura(String paltura) {
			altura = paltura;
		}
		
		public String getaltura() {
			return altura;
		}
		public void setbarrio(String pbarrio) {
			barrio = pbarrio;
		}
		
		public String getbarrio() {
			return barrio;
	}
}
