package Punto2;

public class puntoD {

	
	public static void main(String[] args) {
		
		double  x = 1 , y = 4 , z = 6 , f = 3;
		double  result=  Math.pow ( x, y  ) - Math.sqrt( z * x - Math.pow( y, f ));
		System.out.println(" El resultado de la operacion es: " +result );
	}
}
