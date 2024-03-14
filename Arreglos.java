package practica;

import java.util.Scanner;

public class Arreglos {
	public static void main (String arg []) {
		int filas = 2, columnas=3;
		int vector[][] = new int [filas][columnas];
		int posicion = 3;
		int datos=1;
		
		
		Scanner lector = new Scanner(System.in);
		
		for(int j = 0;j<filas;j++) {
			
			for(int i = 0;i<columnas;i++) {
				vector[j][i]=datos;
				datos++;
				System.out.print("["+vector[j][i]+"]");
			
				
			}
			System.out.println("");
		}	
		
	}
	
}
