package practica;

import java.util.Scanner;

public class CocaCola {
	
	public static void main (String arg[]) {
		
		int clave,años;
		
		
		System.out.println("Ingrese su Nombre");
		
		Scanner lector = new Scanner(System.in);
		
		String nombre = lector.nextLine();
		
		System.out.println("Ingrese su departamento (clave 1) (clave 2) (clave 3)");
		
		clave = lector.nextInt();
		
		if(clave == 1) {
			System.out.println("Ingrese cuantos añoos esta en la empresa ");
			años = lector.nextInt();
			
			if(años == 1) {
				System.out.println("Tienes 6 dias de vacaciones");
			}else if(años > 1 && años < 7) {
				System.out.println("Tienes 14 dias de vacaciones");
			}else if(años >= 7) {
				System.out.println("Tienes 20 dias de vacaciones");
			}else {
				return;
			}
			
			
		}else if(clave == 2) {
			System.out.println("Ingrese cuantos añoos esta en la empresa ");
			años = lector.nextInt();
			
			if(años == 1) {
				System.out.println("Tienes 7 dias de vacaciones");
			}else if(años > 1 && años < 7) {
				System.out.println("Tienes 15 dias de vacaciones");
			}else if(años >= 7) {
				System.out.println("Tienes 22 dias de vacaciones");
			}else {
				return;
			}
			
		}else if(clave == 3) {
			System.out.println("Ingrese cuantos añoos esta en la empresa ");
			años = lector.nextInt();
			
			if(años == 1) {
				System.out.println("Tienes 10 dias de vacaciones");
			}else if(años > 1 && años < 7) {
				System.out.println("Tienes 20 dias de vacaciones");
			}else if(años >= 7) {
				System.out.println("Tienes 30 dias de vacaciones");
			}else {
				return;
			}
		}else {
			return;
		}
		
		
	}

}
