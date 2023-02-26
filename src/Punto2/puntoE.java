package Punto2;

public class puntoE {
	public static void main(String[] args) {
		
		double x = 1 , y = 1 , f= 1 , z= 2;
		double result = x / ( y - 1 / ( x - Math.pow( z, y )));
		
		System.out.println("  el resultado es: " + result 	);
	}

}
