package practica;

public class Fizz_Buzz {
	
	public static void main(String arg[]) {
		
		int Num = 100;
		
		for(int i = 1; i <= Num;i++) {
			
			if(i % 3 == 0 && i % 5 == 0) {
				System.out.println(i + " Fizz Buzz");
				
			}else if(i % 5 == 0) {
				System.out.println(i + " Buzz");
			}else if(i % 3 == 0 ){
				System.out.println(i + " Fizz");
				
			}else {
				System.out.println(i);
			}
			
		}
	}
	
	

}
