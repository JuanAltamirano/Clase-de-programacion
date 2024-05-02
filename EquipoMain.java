
import java.util.ArrayList;
import java.util.Date;

public class EquipoMain {
	
	private ArrayList<Integrante> equipo;
	
	public static void main (String[]args) {
		
		
		Entrenador nuevoEntrenador = new Entrenador (new Date(2024,03,12), 1.68f,"colombia","Jorge",10,"FC Cali");
		
		
		System.out.println(nuevoEntrenador.getFechaNac());
		System.out.println(nuevoEntrenador.getNombre());
	}
		
	

}
