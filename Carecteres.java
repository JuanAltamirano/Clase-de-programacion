package practica;

import java.util.Scanner;

public class Carecteres {
	public static void main (String arg []) {
		String nombre = "", cambio ="";
		int Num_Caracteres = 0, Desde = 0, Hasta = 0;
		Scanner lector = new Scanner(System.in);
		
		System.out.print("Ingrese un nombre: ");
		nombre = lector.nextLine();
		
		Num_Caracteres = nombre.length();
		System.out.println("lo que se guardo se llama: "+nombre+" Y tiene "+Num_Caracteres+" Caracteres");
		System.out.print("Ingrese desde que caracter quiere hacer el corte: ");
		Desde = lector.nextInt();
		System.out.print("Ingrese hasta que caracter quiere hacer el corte: ");
		Hasta = lector.nextInt();
		
		cambio = nombre.substring(Desde,Hasta);
		
		System.out.println("asi quedo el cambio: "+ cambio);
			
		
	}
}
