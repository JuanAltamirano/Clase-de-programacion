package practica;
import java.util.Scanner;
public class SUMADIGITOS {
	
	public static void main (String [] args) {	

		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Ingrese un número entero (N): ");
			int N = scanner.nextInt();

			if (N % 4 == 0) {
			    System.out.println("Sí, " + N + " puede ser la suma de dos números pares.");
			} else {
			    System.out.println("No, " + N + " no puede ser la suma de dos números pares.");
			}
		}

			
			
			
				


	}
	
}
	
	