import java.util.Date;

public class Futbolista extends Integrante {
	
	String posicion, dorsal;
	int goles,minutosJugados;
	
	
	public Futbolista(Date fechaNac, float estatura, String pais, String nombre, int añosExp, String posicion,
			String dorsal, int goles, int minutosJugados) {
		super(fechaNac, estatura, pais, nombre, añosExp);
		this.posicion = posicion;
		this.dorsal = dorsal;
		this.goles = goles;
		this.minutosJugados = minutosJugados;
	}


	public String getPosicion() {
		return posicion;
	}


	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}


	public String getDorsal() {
		return dorsal;
	}


	public void setDorsal(String dorsal) {
		this.dorsal = dorsal;
	}


	public int getGoles() {
		return goles;
	}


	public void setGoles(int goles) {
		this.goles = goles;
	}


	public int getMinutosJugados() {
		return minutosJugados;
	}


	public void setMinutosJugados(int minutosJugados) {
		this.minutosJugados = minutosJugados;
	}
	
	
	
	
	
	
	
	
	
	
	

}
