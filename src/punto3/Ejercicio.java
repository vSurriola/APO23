package punto3;

import java.util.Scanner;

public class Ejercicio {
	
	public static void main(String[] args) {
		
		int p = 0;
		int result; 
		Scanner scanner = new Scanner(System.in);
		
		
		
		System.out.println("Digite el numero de personas que van:");
		p = scanner.nextInt();
		
		if(p<=45) {
			System.out.println("Solo se usa 1 bus ");
			
		}
		else {
			result = p-45 ;
			System.out.println("Se utilizara un autobus y van en la furgoneta:"+ result);
		}
		
		scanner.close();
	}

}
