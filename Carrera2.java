package practica;

import java.util.Scanner;

public class Carrera2 {
	
	public static void main (String arg[]) {
		
		int liebre = 0, tortuga = 0, pasosT = 0, pasosL = 0, meta = 10;
		
		System.out.println("========Carrera========");
		Scanner lector = new Scanner(System.in);
		while(pasosL < meta && pasosT < meta) {
			System.out.println("Ingrese los paso de la tortuga");
			tortuga = lector.nextInt();
			System.out.println("Ingrese los pasos de la liebre");
			liebre = lector.nextInt();
			
			pasosT += tortuga;
			pasosL += liebre;
		}
		
		
		if(pasosT >= meta && pasosL >= meta) {
			System.out.println("Empate");
		}else if(pasosT >= meta && pasosL <= meta) {
			System.out.println("Gano la tortuga");
		}else {
			System.out.println("Gano la liebre");
		}
	}

}
