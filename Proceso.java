package practica;

import java.util.Scanner;

public class Proceso {
	public static void main(String args []) {
		int suma;
		int resta;
		int multiplicacion;
		float division;
		int inicio;
		
		
		
		System.out.println("=====calculadota======\n");
		System.out.println("Digite 1 si quieres sumar\n");
		System.out.println("======================\n");
		System.out.println("Digite 2 si quieres restar \n");
		System.out.println("======================\n");
		System.out.println("Digite 3 si quieres multiplicar\n");
		System.out.println("======================\n");
		System.out.println("Digite 4 si quieres dividir \n");
		System.out.println("======================\n");

		Scanner entrada = new Scanner(System.in);
		
		inicio = entrada.nextInt();
			
		if(inicio == 1) {
			System.out.println("ingrese dos valores\n");
			int valor1 = entrada.nextInt();
			int valor2 = entrada.nextInt();
			suma = valor1 + valor2;
			
			System.out.println("la suma es: "+ suma);
			
		}else if(inicio == 2) {
			System.out.println("ingrese dos valores\n");
			int valor1 = entrada.nextInt();
			int valor2 = entrada.nextInt();
			resta = valor1 - valor2;
			
			System.out.println("la resta es: "+ resta);
	
		}else if(inicio == 3) {
			System.out.println("ingrese dos valores\n");
			int valor1 = entrada.nextInt();
			System.out.println("x");
			int valor2 = entrada.nextInt();
			multiplicacion = valor1 * valor2;
			System.out.println("la multiplicacion es: "+ multiplicacion);
			
		}else if(inicio == 4) {
			System.out.println("ingrese dos valores\n");
			float valor1 = entrada.nextFloat();
			float valor2 = entrada.nextFloat();
			division = valor1 / valor2;
			
			System.out.println("la Division es: "+division);
			
		}else {
			System.out.println("error");
		}
		
		
				
		
		
	}

}
