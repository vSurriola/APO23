package Taller;

import java.util.Scanner;

public class punto1 {

public static void main(String[] args) {

	double x = 0;
	
	try (Scanner scan = new Scanner(System.in)) {
		System.out.print("Ingrese el numero:\t");
		x= scan.nextDouble();
	
		if(x<=7) {
			
			System.out.println("X no es mayor que 7 falso");
		}
		
		else {
			System.out.println("X es mayor que 7 es verdadero");
		}
	
}	
	

}

}