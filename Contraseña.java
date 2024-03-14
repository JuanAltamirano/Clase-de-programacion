package practica;

import java.util.Scanner;

public class Contraseña {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Ingresa tu contraseña: ");
	        String password = scanner.nextLine();

	        // Verificar la longitud de la contraseña
	       

	        // Contar caracteres diferentes
	        int caracteresUnicos = countUniqueCharacters(password);

	        // Verificar si la cantidad de caracteres es par o impar
	        if (caracteresUnicos % 2 == 0) {
	            System.out.println("La contraseña es segura.");
	        } else {
	            System.out.println("La contraseña es insegura.");
	        }

	        // Imprimir la cantidad de caracteres únicos
	        System.out.println("Cantidad de caracteres únicos: " + caracteresUnicos);
	    }

	    // Método para contar caracteres únicos en la contraseña
	    private static int countUniqueCharacters(String str) {
	        boolean[] visited = new boolean[256];
	        int count = 0;
	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);
	            if (!visited[ch]) {
	                visited[ch] = true;
	                count++;
	            }
	        }
	        return count;
	    }
	

}
