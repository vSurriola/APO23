package Punto2;

public class PuntoF {

	public static void main(String[] args) {
		
		double x = 1 , z = 7 , y= 5 , b = 3 , d = 4;
		
		double resultado= z * ( Math.cos( Math.sqrt( y - Math.sin( Math.sqrt( b * x - d )))));
		System.out.println("El valor es :" +resultado);
	}
}
