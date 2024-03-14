package practica;

import java.util.Scanner;

public class Tabla_Game {
	
	public static void main (String arg[]) {
		String nombre = "",contraseña = "";	
		Scanner lector = new Scanner(System.in);
		
		System.out.print("Ingrese su nombre: ");
		nombre = lector.nextLine();
		System.out.print("Ingrese su contraseña: ");
		contraseña = lector.nextLine();
		
		if(nombre.equals("juan") && contraseña.equals("hola")) {
			System.out.print("Bienvenido");
		}else {
			System.out.print("La contraseña o el nombre es incorrecta");
		}
		
	}
	
	
}
