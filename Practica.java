package practica;

public class Practica {
	
	public static void main (String arg []) {
		
		int i = 0;
		
		for (i = 1;i<=10;i++) {
			if(i<10) {
				System.out.print(i+",");
			}else {
				System.out.print(i);
			}
		}
		
		System.out.println("");
		System.out.println("**************");
		
		System.out.println("while");
		i=1;
		while(i<=10) {
			if(i==10) {
				System.out.print(i);
			}else {
				System.out.print(i+",");
			}
			i+=1;
		}
		
		System.out.println("");
		System.out.println("**************");
		System.out.println("*do while*");
		
		i=1;
		
		do {
			if(i==10) {
				System.out.print(i);
			}else {
				System.out.print(i+",");
			}
			i+=1;
		}while(i<=10);
		
		
		System.out.println("");
		System.out.println("=================================");
		int j=99;
		for(i=1;i<=5;i++) {
			if(i==5) {
				System.out.print(i+",");
				System.out.print(j);
			}else {
				System.out.print(i+",");
				System.out.print(j+",");
			}
			
			j--;
			
		}
		
		System.out.println("");
		System.out.println("========while=============");
		i = 1;
		j=99;
		
		while(i<=5) {
			if(i==5) {
				System.out.print(i+",");
				System.out.print(j);
			}else {
				System.out.print(i+",");
				System.out.print(j+",");
			}
			i+=1;
			j--;
		}
		
		System.out.println("");
		System.out.println("==========do While========");
		i = 1;
		j = 99;
		do {
			if(i==5) {
				System.out.print(i+",");
				System.out.print(j);
			}else {
				System.out.print(i+",");
				System.out.print(j + ",");
			}
		i++;
		j--;
		}while(i<=5);
		
	}

}
