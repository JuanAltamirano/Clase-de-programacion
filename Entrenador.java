import java.util.Date;

public class Entrenador extends Integrante {
	
	String federacion;

	

	public Entrenador(Date fechaNac, float estatura, String pais, String nombre, int añosExp, String federacion) {
		super(fechaNac, estatura, pais, nombre, añosExp);
		this.federacion = federacion;
	}

	public String getFederacion() {
		return federacion;
	}

	public void setFederacion(String federacion) {
		this.federacion = federacion;
	}

	
	
	

}
