import java.util.Date;

public class Medico extends Integrante {
	
	String especialidad;

	

	public Medico(Date fechaNac, float estatura, String pais, String nombre, int añosExp, String especialidad) {
		super(fechaNac, estatura, pais, nombre, añosExp);
		this.especialidad = especialidad;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	
	
	

}
