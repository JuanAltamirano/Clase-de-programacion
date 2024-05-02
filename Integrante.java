import java.util.Date;

public abstract class Integrante {
	
	Date fechaNac;
	float estatura;
	String pais,nombre;
	int añosExp;
	

	public Integrante(Date fechaNac, float estatura, String pais, String nombre, int añosExp) {
		super();
		this.fechaNac = fechaNac;
		this.estatura = estatura;
		this.pais = pais;
		this.nombre = nombre;
		this.añosExp = añosExp;
	}



	public Date getFechaNac() {
		return fechaNac;
	}



	public void setFechaNac(Date fechaNac) {
		this.fechaNac = fechaNac;
	}



	public float getEstatura() {
		return estatura;
	}



	public void setEstatura(float estatura) {
		this.estatura = estatura;
	}



	public String getPais() {
		return pais;
	}



	public void setPais(String pais) {
		this.pais = pais;
	}



	public int getAñosExp() {
		return añosExp;
	}



	public void setAñosExp(int añosExp) {
		this.añosExp = añosExp;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	

}
