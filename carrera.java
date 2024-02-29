package practica;

import java.util.Scanner;

public class carrera {

public static void main (String arg[]){
	
	int liebre, tortuga, PasosTortuga=0, PasosLiebre=0;
			
	Scanner entrada = new Scanner(System.in);
	
	System.out.println("=================================\n");
	System.out.println("Carrera de la liebre y la tortuga\n");
	System.out.println("=================================\n");
	
	while(true) {
		liebre = entrada.nextInt();
		tortuga = entrada.nextInt();
		
		
		
		if(liebre > 10 | tortuga > 10) {
			System.out.println("EL Dato que Digitaste no se puede");
			break;	
		}
		
		if( liebre == 10 && tortuga == 10) {
			
			System.out.println("Los pasos de la liebre son: "+ liebre);
			System.out.println("Los pasos de la tortuga son: "+ tortuga);
			System.out.println("empate");
			
			break;
		}
		
		if(liebre == 10) {
			System.out.println("Gano la liebreee!!!!!!!!!");
			break;
		}
		
		if(tortuga == 10) {
			System.out.println("Gano la TOrtugaaa!!!!!!!!!!");
			break;
		}
		
		PasosLiebre += liebre;
		PasosTortuga += tortuga;
		
		if(PasosLiebre > 10 | PasosTortuga > 10) {
			System.out.println("EL Dato que Digitaste no se puede");
			break;	
		}
		
		if( PasosLiebre == 10 && PasosTortuga == 10) {
			
			System.out.println("Los pasos de la liebre son: "+ PasosLiebre);
			System.out.println("Los pasos de la tortuga son: "+ PasosTortuga);
			
			break;
		}
		
		if(PasosLiebre == 10) {
			System.out.println("Gano la liebreee!!!!!!!!!");
			break;
		}
		
		if(PasosTortuga == 10) {
			System.out.println("Gano la TOrtugaaa!!!!!!!!!!");
			break;
		}
		
	}

}
}
